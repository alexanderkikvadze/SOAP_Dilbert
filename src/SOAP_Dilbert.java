import java.net.ResponseCache;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import net.gcomputer.webservices.DilbertLocator;
import net.gcomputer.webservices.DilbertSoap;
import net.gcomputer.webservices.DilbertSoapStub;

//import net.gcomputer.webservices.DilbertLocator;

public class SOAP_Dilbert {
	public static void main(String[] args) {
		
		SOAP_Dilbert dilbert = new SOAP_Dilbert();
		
		dilbert.test();
		
	}

	public void test() {
		System.out.println("    SOAP Dilbert project ... ");
		
		DilbertLocator locator = new DilbertLocator();		
		String soapAddress = locator.getDilbertSoapAddress();
		
		System.out.println(soapAddress);
		
		String serviceName = locator.getDilbertSoapWSDDServiceName();
		System.out.println(serviceName);
		
		DilbertSoap soap1 = null;
		try {
			soap1 = new DilbertSoapStub();
		} catch (AxisFault e1) {
			e1.printStackTrace();
		}		
		try {
			soap1 = locator.getDilbertSoap();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		String responce = "";
		
		try {
			responce = soap1.todaysDilbert();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		System.out.println(responce);
	}
	
}
