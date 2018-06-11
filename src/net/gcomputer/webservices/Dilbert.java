/**
 * Dilbert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gcomputer.webservices;

public interface Dilbert extends javax.xml.rpc.Service {
    public java.lang.String getDilbertSoapAddress();

    public net.gcomputer.webservices.DilbertSoap getDilbertSoap() throws javax.xml.rpc.ServiceException;

    public net.gcomputer.webservices.DilbertSoap getDilbertSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
