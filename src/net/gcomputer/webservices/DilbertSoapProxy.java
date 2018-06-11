package net.gcomputer.webservices;

public class DilbertSoapProxy implements net.gcomputer.webservices.DilbertSoap {
  private String _endpoint = null;
  private net.gcomputer.webservices.DilbertSoap dilbertSoap = null;
  
  public DilbertSoapProxy() {
    _initDilbertSoapProxy();
  }
  
  public DilbertSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDilbertSoapProxy();
  }
  
  private void _initDilbertSoapProxy() {
    try {
      dilbertSoap = (new net.gcomputer.webservices.DilbertLocator()).getDilbertSoap();
      if (dilbertSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dilbertSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dilbertSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dilbertSoap != null)
      ((javax.xml.rpc.Stub)dilbertSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.gcomputer.webservices.DilbertSoap getDilbertSoap() {
    if (dilbertSoap == null)
      _initDilbertSoapProxy();
    return dilbertSoap;
  }
  
  public java.lang.String todaysDilbert() throws java.rmi.RemoteException{
    if (dilbertSoap == null)
      _initDilbertSoapProxy();
    return dilbertSoap.todaysDilbert();
  }
  
  public java.lang.String dailyDilbert(java.util.Calendar ADate) throws java.rmi.RemoteException{
    if (dilbertSoap == null)
      _initDilbertSoapProxy();
    return dilbertSoap.dailyDilbert(ADate);
  }
  
  
}