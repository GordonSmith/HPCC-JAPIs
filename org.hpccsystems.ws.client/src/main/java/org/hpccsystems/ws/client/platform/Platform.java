/*******************************************************************************
 * Copyright (c) 2014 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWSClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayLocator;
import org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunits;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_24.DFULogicalFile;
import org.hpccsystems.ws.client.gen.wsdfu.v1_24.DFUQueryRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_24.DFUQueryResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_24.WsDfuLocator;
import org.hpccsystems.ws.client.gen.wsdfu.v1_24.WsDfuServiceSoap;
import org.hpccsystems.ws.client.gen.wssmc.v1_19.Activity;
import org.hpccsystems.ws.client.gen.wssmc.v1_19.ActivityResponse;
import org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCLocator;
import org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCServiceSoap;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpDropZone;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpServices;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpTargetCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyLocator;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoap;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ECLSourceFile;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ECLWorkunit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.QuerySet;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCreateAndUpdate;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuery;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysets;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetsResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSubmit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUUpdateResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsLocator;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class Platform extends DataSingleton {
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static Platform get(boolean ssl, String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (Platform)All.get(new Platform(ssl, ip, port));
	}
	public static Platform getNoCreate(boolean ssl, String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (Platform)All.getNoCreate(new Platform(ssl, ip, port));
	}
	public static void remove(Platform p) {
		All.remove(p);
	}

	public static final String P_DISABLED = "disabledConfig"; //$NON-NLS-1$
	public static final String P_SSL = "sslConfig"; //$NON-NLS-1$
	public static final boolean P_SSL_DEFAULT = false;
	public static final String P_IP = "ipLaunchConfig"; //$NON-NLS-1$
	public static final String P_IP_DEFAULT = "localhost"; //$NON-NLS-1$
	public static final String P_PORT = "portLaunchConfig"; //$NON-NLS-1$
	public static final int P_PORT_DEFAULT = 8010;
	public static final int P_SSLPORT_DEFAULT = 18010;
	public static final String P_PORT_DEFAULT_STR = "8010"; //$NON-NLS-1$
	public static final String P_SSLPORT_DEFAULT_STR = "18010"; //$NON-NLS-1$
	public static final String P_USER = "userLaunchConfig"; //$NON-NLS-1$
	public static final String P_PASSWORD = "passwordLaunchConfig"; //$NON-NLS-1$
	public static final String P_CLUSTER = "clusterLaunchConfig"; //$NON-NLS-1$
	public static final String P_COMPILEONLY = "compileOnly"; //$NON-NLS-1$

	protected String user;
	protected String password;
	private enum SERVER_EXISTS {
		UNKNOWN,
		TESTING,
		FALSE,
		TRUE
	}
	private SERVER_EXISTS serverExists = SERVER_EXISTS.UNKNOWN; 
	protected boolean isDisabled;
	public boolean isTempDisabled;
	protected boolean ssl;
	protected String ip;
	protected int port;
	private String build = ""; //$NON-NLS-1$
	private Version version;
	private Collection<Cluster> clusters;
	private Collection<DropZone> dropZones;
	protected Collection<Workunit> workunits;	
	private Collection<FileSprayWorkunit> fileSprayWorkunits;
	private Collection<DataQuerySet> dataQuerySets;
	private Collection<LogicalFile> logicalFiles;

	static int LATENCY_TEST = 0;

	protected Platform(boolean ssl, String ip, int port) {
		this.ssl = ssl;
		this.ip = ip;
		this.port = port;
		isDisabled = false;
		isTempDisabled = false;
		this.user = ""; //$NON-NLS-1$
		this.password = ""; //$NON-NLS-1$

		clusters = new HashSet<Cluster>();
		dropZones = new HashSet<DropZone>();
		workunits = new HashSet<Workunit>();	
		fileSprayWorkunits = new HashSet<FileSprayWorkunit>();
		dataQuerySets = new HashSet<DataQuerySet>();
		logicalFiles = new HashSet<LogicalFile>();
	}
	
	public void setCredentials(String user, String password) {
		this.user = user;
		this.password = password; 
	}


	protected synchronized void confirmDisable() {
	}

	public void clearTempDisabled() {
		isTempDisabled = false;
		serverExists = SERVER_EXISTS.UNKNOWN;
		build=""; //$NON-NLS-1$
	}

	protected synchronized void testServer() {
		if (serverExists == SERVER_EXISTS.UNKNOWN) {
			serverExists = SERVER_EXISTS.TESTING;
			if (pingServer(getUser(), getPassword())) {
				serverExists = SERVER_EXISTS.TRUE;
			} else {
				serverExists = SERVER_EXISTS.FALSE;
				isTempDisabled = true;
			}
		}
	}

	public boolean isDisabled() {
		testServer();
		return isDisabled || isTempDisabled;
	}

	public boolean isEnabled() {
		return !isDisabled();
	}

	public String getProtocol() {
		return ssl ? "https" : "http"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	public String getIP() {
		return ip;
	}

	public int getPort() {
		return port;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	protected String getBuild() {
		if (isEnabled() && build.isEmpty()) {
			WsSMCServiceSoap service = getWsSMCServiceSoap();
			Activity request = new Activity();
			try {
				ActivityResponse response = service.activity(request);
				build = response.getBuild();
			} catch (ArrayOfEspException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
		}
		return build;
	}
	
	public synchronized boolean pingServer(String user, String password) {
		//  Special call used to verify if server is active  ---
		WsWorkunitsServiceSoap service = getWsWorkunitsService(user, password);
		int oldTimeout = ((org.apache.axis.client.Stub) service).getTimeout();
		((org.apache.axis.client.Stub) service).setTimeout(3 * 1000);
		WUQuery request = new WUQuery();
		request.setWuid("XXX"); //$NON-NLS-1$
		try {
			service.WUQuery(request);
			return true;
		} catch (ArrayOfEspException e) {
		} catch (RemoteException e) {
		} finally {
			((org.apache.axis.client.Stub) service).setTimeout(oldTimeout);
		}
		return false;
	}
	
	public synchronized String getBuild(String user, String password) throws ArrayOfEspException, RemoteException {
		//  Special call used to verify if server is active  ---
		if (build.isEmpty()) {
			WsSMCServiceSoap service = getWsSMCServiceSoap(user, password);
			Activity request = new Activity();
			ActivityResponse response = service.activity(request);
			build = response.getBuild();
		}
		return build;
	}

	public Version getBuildVersion() {
		return new Version(getBuild());
	}
	
	public Version getVersion() {
		if (version == null) {
			version = new Version(getBuild());
		}
		return version;
	}
	
	/*
 enum WUAction
{
    WUActionUnknown = 0,
    WUActionCompile = 1,
    WUActionCheck = 2,
    WUActionRun = 3,
    WUActionExecuteExisting = 4,
    WUActionPause = 5, 
    WUActionPauseNow = 6, 
    WUActionResume = 7, 
    WUActionSize = 8
};
	 */
	protected String hackUnicodeInXMLForAxisOneAndESP(String src) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src.length(); ++i) {
			int charVal = src.codePointAt(i);
			if (charVal > 127) {
				sb.append("&#x" + Integer.toString(charVal, 16) + ";"); //$NON-NLS-1$ //$NON-NLS-2$
			} else {
				sb.append(src.charAt(i));
			}
		}
		return sb.toString();
	}

	public Workunit submit(String cluster, String archiveOrEcl, boolean compileOnly) {
		return this.submit(cluster, archiveOrEcl, "", "", 0, compileOnly);
	}
	
	public Workunit submit(String cluster, String archiveOrEcl, String jobname, String filePath, int inlineResultLimit, boolean compileOnly) {
		try {
			Workunit.All.pushTransaction("Platform.submit"); //$NON-NLS-1$
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUCreateAndUpdate request = new WUCreateAndUpdate();
			request.setQueryText(hackUnicodeInXMLForAxisOneAndESP(archiveOrEcl));
			request.setJobname(jobname);
			if (compileOnly)
				request.setAction(1);
			ApplicationValue[] appVals = new ApplicationValue[1];
			appVals[0] = new ApplicationValue();
			appVals[0].setApplication("org.hpccsystems.eclsoap");
			appVals[0].setName("path"); //$NON-NLS-1$
			appVals[0].setValue(filePath);
			request.setApplicationValues(appVals);
			if (inlineResultLimit > 0) {
				request.setResultLimit(inlineResultLimit);
			}

			try {
				WUUpdateResponse response = service.WUCreateAndUpdate(request);
				response.getWorkunit().setCluster(cluster);	//  WUSubmit does not return an updated ECLWorkunit, so set cluster here...  
				Workunit wu = getWorkunit(response.getWorkunit());
				if (wu != null) {
					workunits.add(wu);

					WUSubmit submitRequest = new WUSubmit();
					submitRequest.setWuid(response.getWorkunit().getWuid());
					submitRequest.setCluster(cluster);
					service.WUSubmit(submitRequest);
				}
				return wu;
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
		} finally {
			Workunit.All.popTransaction();
		}
		return null;
	}

	@Override
	protected boolean isComplete() {
		return true;
	}

	@Override
	protected void fastRefresh() {
	}

	@Override
	protected void fullRefresh() {
	}

	//  Workunit  ---
	public Workunit getWorkunit(String wuid) {
		if (isEnabled()) {
			return Workunit.get(this, wuid);
		}
		return null;
	}

	public Workunit getWorkunit(ECLWorkunit wu) {
		Workunit workunit = getWorkunit(wu.getWuid());
		workunit.update(wu);
		return workunit;
	}

	Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate) {
		return getWorkunits(userOnly, cluster, startDate, endDate, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname) {
		return getWorkunits(userOnly, cluster, startDate, endDate, jobname, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname, String appKey, String appData) {
		if (isEnabled()) {
			Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuery request = new WUQuery();
			if (userOnly) {
				request.setOwner(user);
			}
			if (!cluster.isEmpty())
				request.setCluster(cluster);
			if (!jobname.isEmpty())
				request.setJobname(jobname);
			if (!startDate.isEmpty())
				request.setStartDate(startDate);
			if (!endDate.isEmpty())
				request.setEndDate(endDate);
			if (!appKey.isEmpty()) {
				request.setApplicationName("org.hpccsystems.eclsoap");
				request.setApplicationKey(appKey);
				request.setApplicationData(appData);
			}
			request.setCount(100);
			try {
				WUQueryResponse response = service.WUQuery(request);
				updateWorkunits(response.getWorkunits());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			Workunit.All.popTransaction();
			return new HashSet<Workunit>(workunits);
		}
		return new HashSet<Workunit>();
	}

	public static String toESPString(GregorianCalendar _calendar) {
		//2013-10-02T23:00:00Z
		Calendar now = GregorianCalendar.getInstance();
		Calendar nowUTC = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC")); //$NON-NLS-1$
		int delta = nowUTC.get(Calendar.HOUR_OF_DAY) - now.get(Calendar.HOUR_OF_DAY);
		GregorianCalendar calendar = (GregorianCalendar)_calendar.clone();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); //$NON-NLS-1$
		calendar.add(Calendar.HOUR_OF_DAY, delta);
		return df.format(calendar.getTime());
	}

	public Collection<Workunit> getWorkunits(String owner, String cluster, GregorianCalendar startDate, GregorianCalendar endDate) {
		if (isEnabled()) {
			Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuery request = new WUQuery();
			if (owner != null)
				request.setOwner(owner);
			if (cluster != null)
				request.setCluster(cluster);
			if (startDate != null)
				request.setStartDate(toESPString(startDate));
			if (endDate != null)
				request.setEndDate(toESPString(endDate));
			request.setCount(100);
			try {
				WUQueryResponse response = service.WUQuery(request);
				updateWorkunits(response.getWorkunits());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			Workunit.All.popTransaction();
			return new HashSet<Workunit>(workunits);
		}
		return new HashSet<Workunit>();
	}

	public Collection<Workunit> getWorkunits(boolean userOnly, String cluster) {
		return getWorkunits(userOnly, cluster, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public Collection<Workunit> getWorkunits(boolean userOnly) {
		return getWorkunits(userOnly, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	boolean isValid(String wuid) {
		//W20120816-100734
		if (wuid.length() >= 16) {
			if (wuid.startsWith("W")) { //$NON-NLS-1$
				for (int i = 1; i < 8; ++i) {
					if (!Character.isDigit(wuid.charAt(i)))
						return false;
				}
				return true;
			}
		}
		
		return false;
	}

	synchronized void updateWorkunits(ECLWorkunit[] rawWorkunits) {
		workunits.clear();
		if (rawWorkunits != null) {
			for(ECLWorkunit wu : rawWorkunits) {
				if (isValid(wu.getWuid())) {
					workunits.add(getWorkunit(wu)); 	//  Will mark changed if needed  ---
				}
			}
		}
	}

	//  FileSPrayWorkunit  ---
	public FileSprayWorkunit getFileSprayWorkunit(String id) {
		return FileSprayWorkunit.get(this, id);
	}

	public FileSprayWorkunit getFileSprayWorkunit(DFUWorkunit wu) {
		FileSprayWorkunit workunit = getFileSprayWorkunit(wu.getID());
		workunit.update(wu);
		return workunit;
	}

	public FileSprayWorkunit[] getFileSprayWorkunits(String cluster) {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getFileSprayWorkunits", fileSprayWorkunits);
			FileSprayServiceSoap service = getFileSprayService();
			GetDFUWorkunits request = new GetDFUWorkunits();
			request.setPageSize(new Long(100));
			request.setCluster(cluster);
			try {
				GetDFUWorkunitsResponse response = service.getDFUWorkunits(request);
				updateFileSprayWorkunits(response.getResults());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			//TODO notifyObservers(monitor.calcChanges(fileSprayWorkunits));
		}
		return fileSprayWorkunits.toArray(new FileSprayWorkunit[0]);
	}

	public FileSprayWorkunit[] getFileSprayWorkunits() {
		return getFileSprayWorkunits(""); //$NON-NLS-1$
	}

	synchronized void updateFileSprayWorkunits(DFUWorkunit[] rawWorkunits) {
		fileSprayWorkunits.clear();
		if (rawWorkunits != null) {
			for(DFUWorkunit wu : rawWorkunits) {
				fileSprayWorkunits.add(getFileSprayWorkunit(wu)); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  LogicalFile  ---
	public DataQuerySet getDataQuerySet(String name) {
		return DataQuerySet.get(this, name);
	}

	public DataQuerySet getDataQuerySet(QuerySet qs) {
		DataQuerySet dataQuerySet = getDataQuerySet(qs.getQuerySetName());
		dataQuerySet.Update(qs);
		return dataQuerySet;
	}

	public DataQuerySet[] getDataQuerySets() {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getDataQuerySets", dataQuerySets);
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuerysets request = new WUQuerysets();
			try {
				WUQuerysetsResponse response = service.WUQuerysets(request);
				updateDataQuerySets(response.getQuerysets());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated )catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			//TODO notifyObservers(monitor.calcChanges(dataQuerySets));
		}
		return dataQuerySets.toArray(new DataQuerySet[0]);
	}

	synchronized void updateDataQuerySets(QuerySet[] rawQuerySets) {
		dataQuerySets.clear();
		if (rawQuerySets != null) {
			for(QuerySet qs : rawQuerySets) {
				dataQuerySets.add(getDataQuerySet(qs)); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  LogicalFile  ---
	public LogicalFile getLogicalFile(String name) {
		return LogicalFile.get(this, name);
	}

	public LogicalFile getLogicalFile(DFULogicalFile lf) {
		LogicalFile logicalFile = getLogicalFile(lf.getName());
		logicalFile.Update(lf);
		return logicalFile;
	}

	public LogicalFile getLogicalFile(ECLSourceFile sf) {
		LogicalFile logicalFile = getLogicalFile(sf.getName());
		logicalFile.Update(sf);
		return logicalFile;
	}

	public LogicalFile[] getLogicalFiles(String cluster) {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getLogicalFiles", logicalFiles);
			WsDfuServiceSoap service = getWsDfuService();
			DFUQueryRequest request = new DFUQueryRequest();
			request.setClusterName(cluster);
			request.setFirstN(100);
			request.setPageStartFrom(0);
			request.setPageSize(100);
			try {
				DFUQueryResponse response = service.DFUQuery(request);
				updateLogicalFiles(response.getDFULogicalFiles());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			//TODO notifyObservers(monitor.calcChanges(logicalFiles));
		}
		return logicalFiles.toArray(new LogicalFile[0]);
	}

	public LogicalFile[] getLogicalFiles() {
		return getLogicalFiles(""); //$NON-NLS-1$
	}

	synchronized void updateLogicalFiles(DFULogicalFile[] rawLogicalFiles) {
		logicalFiles.clear();
		if (rawLogicalFiles != null) {
			for(DFULogicalFile lf : rawLogicalFiles) {
				logicalFiles.add(getLogicalFile(lf)); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  Cluster  ---
	public Cluster getCluster(String name) {
		return Cluster.get(this, name);
	}

	public Cluster getCluster(TpTargetCluster tc) {
		Cluster cluster = getCluster(tc.getName());
		cluster.Update(tc);
		return cluster;
	}

	public Cluster[] getClusters() {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
			WsTopologyServiceSoap service = getWsTopologyService();
			TpLogicalClusterQueryRequest request = new TpLogicalClusterQueryRequest();
			try {
				TpLogicalClusterQueryResponse response = service.tpLogicalClusterQuery(request);
				updateClusters(response.getTpLogicalClusters());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			//TODO notifyObservers(monitor.calcChanges(clusters));
		}
		return clusters.toArray(new Cluster[0]);
	}

	synchronized void updateClusters(TpLogicalCluster[] tpLogicalClusters) {
		if (tpLogicalClusters != null) {
			for(TpLogicalCluster c : tpLogicalClusters) {
				clusters.add(getCluster(c.getName())); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  Drop Zones  ---
	public DropZone getDropZone(String name) {
		return DropZone.get(this, name);
	}

	public DropZone getDropZone(TpDropZone dz) {
		DropZone dropZone = getDropZone(dz.getName());
		dropZone.update(dz);
		return dropZone;
	}

	public DropZone[] getDropZones() {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
			WsTopologyServiceSoap service = getWsTopologyService();
			TpServiceQueryRequest request = new TpServiceQueryRequest();
			request.setType("ALLSERVICES"); //$NON-NLS-1$
			try {
				TpServiceQueryResponse response = service.tpServiceQuery(request);
				updateServices(response.getServiceList());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
			}
			//TODO notifyObservers(monitor.calcChanges(clusters));
		}
		return dropZones.toArray(new DropZone[0]);
	}

	private void updateServices(TpServices serviceList) {
		if (serviceList != null) {
			updateDropZones(serviceList.getTpDropZones());
		}

	}
	private void updateDropZones(TpDropZone[] rawDropZones) {
		if (rawDropZones != null) {
			for(TpDropZone dz : rawDropZones) {
				dropZones.add(getDropZone(dz));
			}
		}
	}

	//  SOAP Stub Helpers  ---
	public URL getURL() throws MalformedURLException {
		return getURL(""); //$NON-NLS-1$
	}

	public URL getURL(String service) throws MalformedURLException {
		return new URL(getProtocol(), getIP(), getPort(), "/" + service); //$NON-NLS-1$
	}

	public URL getURL(String service, String method) throws MalformedURLException {
		return getURL(service + "/" + method); //$NON-NLS-1$
	}

	public URL getURL(String service, String method, String params) throws MalformedURLException {
		return getURL(service + "/" + method + "?" + params); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public URL getWidgetURL(String widget, String params) throws MalformedURLException {
		return getURL("esp/files/stub.htm?Widget=" + widget + (params.isEmpty() ? "" : "&" + params)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	private void initStub(Stub stub, String user, String password) {
		stub.setUsername(user);
		stub.setPassword(password);
		stub.setTimeout(180 * 1000);
		stub.setMaintainSession(true);
	}
	
	void initStub(Stub stub) {
		initStub(stub, getUser(), getPassword());
		stub.setTimeout(180 * 1000);
		stub.setMaintainSession(true);
	}

	void latencyTest() {
		if (LATENCY_TEST == 0) {
			return;
		}

		try {
			Thread.sleep(LATENCY_TEST);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WsWorkunitsServiceSoap getWsWorkunitsService(String user, String password) {
		latencyTest();
		WsWorkunitsLocator locator = new WsWorkunitsLocator();
		try {
			WsWorkunitsServiceSoap service = locator.getWsWorkunitsServiceSoap(getURL("WsWorkunits")); //$NON-NLS-1$
			initStub((org.apache.axis.client.Stub)service, user, password);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public WsWorkunitsServiceSoap getWsWorkunitsService() {
		return getWsWorkunitsService(getUser(), getPassword());		
	}

	public WsDfuServiceSoap getWsDfuService() {
		latencyTest();
		WsDfuLocator locator = new WsDfuLocator();
		try {
			WsDfuServiceSoap service = locator.getWsDfuServiceSoap(getURL("WsDfu")); //$NON-NLS-1$
			initStub((org.apache.axis.client.Stub)service);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public FileSprayServiceSoap getFileSprayService() {
		latencyTest();
		FileSprayLocator locator = new FileSprayLocator();
		try {
			FileSprayServiceSoap service = locator.getFileSprayServiceSoap(getURL("FileSpray")); //$NON-NLS-1$
			initStub((org.apache.axis.client.Stub)service);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public WsTopologyServiceSoap getWsTopologyService() {
		latencyTest();
		WsTopologyLocator locator = new WsTopologyLocator();
		try {
			WsTopologyServiceSoap service = locator.getWsTopologyServiceSoap(getURL("WsTopology")); //$NON-NLS-1$
			initStub((org.apache.axis.client.Stub)service);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private WsSMCServiceSoap getWsSMCServiceSoap(String user, String password) {
		latencyTest();
		WsSMCLocator locator = new WsSMCLocator();
		try {
			WsSMCServiceSoap service = locator.getWsSMCServiceSoap(getURL("WsSMC")); //$NON-NLS-1$
			initStub((org.apache.axis.client.Stub)service, user, password);
			return service;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;	
	}

	public WsSMCServiceSoap getWsSMCServiceSoap() {
		return getWsSMCServiceSoap(getUser(), getPassword());
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( this == aThat ) {
			return true;
		}

		if ( !(aThat instanceof Platform) ) {
			return false;
		}
		Platform that = (Platform)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(getProtocol(), that.getProtocol()) &&
				EqualsUtil.areEqual(getIP(), that.getIP()) &&
				EqualsUtil.areEqual(getPort(), that.getPort());
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, getProtocol());
		result = HashCodeUtil.hash(result, getIP());
		result = HashCodeUtil.hash(result, getPort());
		return result;
	}
}
