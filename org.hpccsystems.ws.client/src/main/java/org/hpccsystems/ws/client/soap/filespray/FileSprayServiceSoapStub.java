/**
 * FileSprayServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.filespray;

public class FileSprayServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.soap.filespray.FileSprayServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[26];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AbortDFUWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "AbortDFUWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">AbortDFUWorkunit"), org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">AbortDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "AbortDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Copy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Copy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Copy"), org.hpccsystems.ws.client.soap.filespray.Copy.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">CopyResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.CopyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CopyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateDFUWorkunit");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">CreateDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CreateDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DFUWUFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWUFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUFileRequest"), org.hpccsystems.ws.client.soap.filespray.DFUWUFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWUFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DFUWUSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWUSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUSearchRequest"), org.hpccsystems.ws.client.soap.filespray.DFUWUSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUSearchResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWUSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DFUWorkunitsAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunitsActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionRequest"), org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunitsActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteDFUWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DeleteDFUWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunit"), org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DeleteDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteDFUWorkunits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DeleteDFUWorkunits"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunits"), org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunits.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunitsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DeleteDFUWorkunitsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteDropZoneFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DeleteDropZoneFilesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDropZoneFilesRequest"), org.hpccsystems.ws.client.soap.filespray.DeleteDropZoneFilesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunitsActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Despray");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Despray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Despray"), org.hpccsystems.ws.client.soap.filespray.Despray.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DesprayResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DesprayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DesprayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DfuMonitor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DfuMonitorRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DfuMonitorRequest"), org.hpccsystems.ws.client.soap.filespray.DfuMonitorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DfuMonitorResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DfuMonitorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DropZoneFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZoneFilesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesRequest"), org.hpccsystems.ws.client.soap.filespray.DropZoneFilesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZoneFilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoDateTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "EchoDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">EchoDateTime"), org.hpccsystems.ws.client.soap.filespray.EchoDateTime.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">EchoDateTimeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "EchoDateTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FileListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListRequest"), org.hpccsystems.ws.client.soap.filespray.FileListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.FileListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FileListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDFUExceptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUExceptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUExceptions"), org.hpccsystems.ws.client.soap.filespray.GetDFUExceptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUExceptionsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUExceptionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDFUProgress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ProgressRequest"), org.hpccsystems.ws.client.soap.filespray.ProgressRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ProgressResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.ProgressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDFUWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunit"), org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDFUWorkunits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUWorkunits"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunits"), org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunits.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUWorkunitsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenSave");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "OpenSaveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">OpenSaveRequest"), org.hpccsystems.ws.client.soap.filespray.OpenSaveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">OpenSaveResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "OpenSaveResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Rename");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Rename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Rename"), org.hpccsystems.ws.client.soap.filespray.Rename.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">RenameResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.RenameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "RenameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Replicate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Replicate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Replicate"), org.hpccsystems.ws.client.soap.filespray.Replicate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ReplicateResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.ReplicateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ReplicateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShowResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ShowResultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ShowResultRequest"), org.hpccsystems.ws.client.soap.filespray.ShowResultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ShowResultResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.ShowResultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ShowResultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SprayFixed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SprayFixed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayFixed"), org.hpccsystems.ws.client.soap.filespray.SprayFixed.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayFixedResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SprayFixedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SprayVariable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SprayVariable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayVariable"), org.hpccsystems.ws.client.soap.filespray.SprayVariable.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.SprayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SprayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitDFUWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SubmitDFUWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SubmitDFUWorkunit"), org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SubmitDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SubmitDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDFUWorkunit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "UpdateDFUWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">UpdateDFUWorkunit"), org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">UpdateDFUWorkunitResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "UpdateDFUWorkunitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"), 
                      true
                     ));
        _operations[25] = oper;

    }

    public FileSprayServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FileSprayServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FileSprayServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">>DFUWUSearchResponse>ClusterNames");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">AbortDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">AbortDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Copy");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.Copy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">CopyResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.CopyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">CreateDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunits");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDFUWorkunitsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DeleteDropZoneFilesRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DeleteDropZoneFilesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Despray");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.Despray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DesprayResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DesprayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DfuMonitorRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DfuMonitorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DfuMonitorResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUFileRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWUFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUSearchRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWUSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUSearchResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DropZoneFilesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">EchoDateTime");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.EchoDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">EchoDateTimeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.FileListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.FileListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUExceptions");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUExceptionsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunits");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">OpenSaveRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.OpenSaveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">OpenSaveResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ProgressRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ProgressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ProgressResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ProgressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Rename");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.Rename.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">RenameResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.RenameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Replicate");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.Replicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ReplicateResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ReplicateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ShowResultRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ShowResultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ShowResultResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ShowResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayFixed");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SprayFixed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayFixedResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SprayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayVariable");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SprayVariable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SubmitDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SubmitDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">UpdateDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">UpdateDFUWorkunitResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfDFUActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResult");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfDFUException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUException[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUException");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUException");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfDFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWorkunit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfDropZone");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DropZone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfPhysicalFileStruct");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.PhysicalFileStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResult");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DFUWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.DropZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "EspStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.filespray.PhysicalFileStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/AbortDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AbortDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.CopyResponse copy(org.hpccsystems.ws.client.soap.filespray.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/Copy?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Copy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.CopyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.CopyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.CopyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/CreateDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.soap.filespray.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DFUWUFile?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DFUWUFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.soap.filespray.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DFUWUSearch?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DFUWUSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DFUWorkunitsAction?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DFUWorkunitsAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DeleteDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DeleteDFUWorkunits?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteDFUWorkunits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DeleteDropZoneFiles?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteDropZoneFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DesprayResponse despray(org.hpccsystems.ws.client.soap.filespray.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/Despray?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Despray"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DesprayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DesprayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DesprayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.soap.filespray.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DfuMonitor?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DfuMonitor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/DropZoneFiles?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DropZoneFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.soap.filespray.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/EchoDateTime?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EchoDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.FileListResponse fileList(org.hpccsystems.ws.client.soap.filespray.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/FileList?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FileList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.FileListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.FileListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.FileListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.soap.filespray.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/GetDFUExceptions?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDFUExceptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.soap.filespray.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/GetDFUProgress?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDFUProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.ProgressResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.ProgressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.ProgressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/GetDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/GetDFUWorkunits?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDFUWorkunits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse openSave(org.hpccsystems.ws.client.soap.filespray.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/OpenSave?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpenSave"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.RenameResponse rename(org.hpccsystems.ws.client.soap.filespray.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/Rename?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Rename"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.RenameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.RenameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.RenameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.ReplicateResponse replicate(org.hpccsystems.ws.client.soap.filespray.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/Replicate?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Replicate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.ReplicateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.ReplicateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.ReplicateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.ShowResultResponse showResult(org.hpccsystems.ws.client.soap.filespray.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/ShowResult?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ShowResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.ShowResultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.ShowResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.ShowResultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.soap.filespray.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/SprayFixed?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SprayFixed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.SprayResponse sprayVariable(org.hpccsystems.ws.client.soap.filespray.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/SprayVariable?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SprayVariable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.SprayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.SprayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.SprayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/SubmitDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmitDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FileSpray/UpdateDFUWorkunit?ver_=1.06");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateDFUWorkunit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
