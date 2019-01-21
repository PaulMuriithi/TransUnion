package test;

import co.ke.transunion.crbws.ws.Product121;
import co.ke.transunion.crbws.ws.ServerInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Properties;

public class TestClient {

    private static String TRANSPORT_USERNAME;
    private static String TRANSPORT_PASSWORD;
    private static String MESSAGE_USERNAME;
    private static String MESSAGE_PASSWORD;
    private static String CODE;
    private static String INFINITY_CODE;

    public static void main(String[] args) {
        Properties configs = readConfigs();
        TRANSPORT_USERNAME = configs.getProperty("TRANSPORT_USERNAME");
        TRANSPORT_PASSWORD = configs.getProperty("TRANSPORT_PASSWORD");
        MESSAGE_USERNAME = configs.getProperty("MESSAGE_USERNAME");
        MESSAGE_PASSWORD = configs.getProperty("MESSAGE_PASSWORD");
        CODE = configs.getProperty("CODE");
        INFINITY_CODE = configs.getProperty("INFINITY_CODE");

        TestClientService clientService = new TestClientService("https://secure3.crbafrica.com/crbws/ke?wsdl",
                TRANSPORT_USERNAME, TRANSPORT_PASSWORD);
        try {
            ServerInfo serverInfo = clientService.retrieveServerInfo(MESSAGE_USERNAME, MESSAGE_PASSWORD, CODE, INFINITY_CODE);
            System.out.println("Response Code: " + serverInfo.getResponseCode());

            if (serverInfo.getResponseCode() == 100) {
                System.out.println("Protocol: " + serverInfo.getProtocol());
                System.out.println("Country: " + serverInfo.getCountry());
                System.out.println("Version: " + serverInfo.getVersion());

            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, 1990);
            calendar.set(Calendar.MONTH, 8);
            calendar.set(Calendar.DAY_OF_MONTH, 18);
            String postalBoxNo = null;
            String postalTown = null;
            String postalCountry = null;
            String telephoneWork = null;
            String telephoneHome = null;
            String telephoneMobile = configs.getProperty("SAMPLE_PHONE");
            String physicalAddress = null;
            String physicalTown = null;
            String physicalCountry = null;
            int reportReason = 0;
            Product121 product121 = clientService.getProduct121(MESSAGE_USERNAME, MESSAGE_PASSWORD, CODE, INFINITY_CODE,
                    configs.getProperty("SAMPLE_USERNAME1"), configs.getProperty("SAMPLE_USERNAME2"), null, null,
                    configs.getProperty("SAMPLE_ID"), null, null, null, null, calendar, postalBoxNo,
                    postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
            System.out.println("Got product: " + product121 + "\nCode: " + product121.getResponseCode());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private static Properties readConfigs() {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // load a properties file
            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }
}
