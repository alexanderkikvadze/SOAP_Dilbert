/**
 * DilbertLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gcomputer.webservices;

public class DilbertLocator extends org.apache.axis.client.Service implements net.gcomputer.webservices.Dilbert {

    public DilbertLocator() {
    }


    public DilbertLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DilbertLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DilbertSoap
    private java.lang.String DilbertSoap_address = "http://www.gcomputer.net/webservices/dilbert.asmx";

    public java.lang.String getDilbertSoapAddress() {
        return DilbertSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DilbertSoapWSDDServiceName = "DilbertSoap";

    public java.lang.String getDilbertSoapWSDDServiceName() {
        return DilbertSoapWSDDServiceName;
    }

    public void setDilbertSoapWSDDServiceName(java.lang.String name) {
        DilbertSoapWSDDServiceName = name;
    }

    public net.gcomputer.webservices.DilbertSoap getDilbertSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DilbertSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDilbertSoap(endpoint);
    }

    public net.gcomputer.webservices.DilbertSoap getDilbertSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.gcomputer.webservices.DilbertSoapStub _stub = new net.gcomputer.webservices.DilbertSoapStub(portAddress, this);
            _stub.setPortName(getDilbertSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDilbertSoapEndpointAddress(java.lang.String address) {
        DilbertSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.gcomputer.webservices.DilbertSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.gcomputer.webservices.DilbertSoapStub _stub = new net.gcomputer.webservices.DilbertSoapStub(new java.net.URL(DilbertSoap_address), this);
                _stub.setPortName(getDilbertSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DilbertSoap".equals(inputPortName)) {
            return getDilbertSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gcomputer.net/webservices/", "Dilbert");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gcomputer.net/webservices/", "DilbertSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DilbertSoap".equals(portName)) {
            setDilbertSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
