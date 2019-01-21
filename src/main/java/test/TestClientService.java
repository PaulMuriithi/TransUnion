package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import co.ke.transunion.crbws.ws.Product121;
import co.ke.transunion.crbws.ws.ServerInfo;
import co.ke.transunion.crbws.ws.impl.ControllerKenyaImplPortBindingStub;
import co.ke.transunion.crbws.ws.impl.ControllerKenyaImplServiceLocator;

public class TestClientService {
    private ControllerKenyaImplPortBindingStub controller;

    public TestClientService(String url, String username, String password) {
        init(url, username, password);
    }

    private void init(String url, String username, String password) {
        try {
            URL wsdlUrl = new URL(url);
            controller = (ControllerKenyaImplPortBindingStub) (new ControllerKenyaImplServiceLocator())
                    .getControllerKenyaImplPort(wsdlUrl);
            controller.setUsername(username);
            controller.setPassword(password);
            controller.setMaintainSession(true);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public ServerInfo retrieveServerInfo(String username, String password,
                                         String code, String infinityCode) throws RemoteException {
        return controller.getServerInfo(username, password, code, infinityCode);
    }

    public Product121 getProduct121(String username, String password,
                                    String code, String infinityCode, String name1, String name2,
                                    String name3, String name4, String nationalID, String passportNo,
                                    String serviceID, String alienID, String taxID,
                                    java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown,
                                    String postalCountry, String telephoneWork, String telephoneHome,
                                    String telephoneMobile, String physicalAddress, String physicalTown,
                                    String physicalCountry, int reportReason) throws java.rmi.RemoteException {
        return controller.getProduct121(username, password, code, infinityCode,
                name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth,
                postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile,
                physicalAddress, physicalTown, physicalCountry, reportReason);
    }
}
