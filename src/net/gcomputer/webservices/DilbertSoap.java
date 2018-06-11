/**
 * DilbertSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gcomputer.webservices;

public interface DilbertSoap extends java.rmi.Remote {
    public java.lang.String todaysDilbert() throws java.rmi.RemoteException;
    public java.lang.String dailyDilbert(java.util.Calendar ADate) throws java.rmi.RemoteException;
}
