package co.ke.transunion.crbws.ws;

public class ControllerKenyaProxy implements ControllerKenya {
  private String _endpoint = null;
  private ControllerKenya controllerKenya = null;
  
  public ControllerKenyaProxy() {
    _initControllerKenyaProxy();
  }
  
  public ControllerKenyaProxy(String endpoint) {
    _endpoint = endpoint;
    _initControllerKenyaProxy();
  }
  
  private void _initControllerKenyaProxy() {
    try {
      controllerKenya = (new co.ke.transunion.crbws.ws.impl.ControllerKenyaImplServiceLocator()).getControllerKenyaImplPort();
      if (controllerKenya != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controllerKenya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controllerKenya)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controllerKenya != null)
      ((javax.xml.rpc.Stub)controllerKenya)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ControllerKenya getControllerKenya() {
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya;
  }
  
  public Product150 getProduct150(String username, String password, String code, String infinityCode, String companyName, String companyRegNo, String taxID, String vatID, java.util.Calendar companyRegDate, String postalBoxNo, String postalTown, String postalCountry, String telephoneNo, String faxNo, String websiteAddress, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct150(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product151 getProduct151(String username, String password, String code, String infinityCode, String companyName, String companyRegNo, String taxID, String vatID, java.util.Calendar companyRegDate, String postalBoxNo, String postalTown, String postalCountry, String telephoneNo, String faxNo, String websiteAddress, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct151(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product152 getProduct152(String username, String password, String code, String infinityCode, String companyName, String companyRegNo, String taxID, String vatID, java.util.Calendar companyRegDate, String postalBoxNo, String postalTown, String postalCountry, String telephoneNo, String faxNo, String websiteAddress, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct152(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product153 getProduct153(String username, String password, String code, String infinityCode, String companyName, String companyRegNo, String taxID, String vatID, java.util.Calendar companyRegDate, String postalBoxNo, String postalTown, String postalCountry, String telephoneNo, String faxNo, String websiteAddress, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct153(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public CreditBal getCreditBal(String username, String password, String code, String infinityCode) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getCreditBal(username, password, code, infinityCode);
  }
  
  public Product100 getProduct100(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct100(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product126 getProduct126(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct126(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product401 getProduct401(String username, String password, String code, String infinityCode, String phoneNumber, int reportSector, int reportReason, String message) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct401(username, password, code, infinityCode, phoneNumber, reportSector, reportReason, message);
  }
  
  public Product402 getProduct402(String username, String password, String code, String infinityCode, String documentNumber, String names, String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct402(username, password, code, infinityCode, documentNumber, names, phoneNumber, reportSector, reportReason);
  }
  
  public Product403 getProduct403(String username, String password, String code, String infinityCode, String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct403(username, password, code, infinityCode, phoneNumber, reportSector, reportReason);
  }
  
  public Product405 getProduct405(String username, String password, String code, String infinityCode, String origin, String dest, String receivedTimeStamp, String transactionDate, String transactionTime, String transactionCode, String transactionMobileNo, String transactionAccount, String senderNames, String transactionAmount) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct405(username, password, code, infinityCode, origin, dest, receivedTimeStamp, transactionDate, transactionTime, transactionCode, transactionMobileNo, transactionAccount, senderNames, transactionAmount);
  }
  
  public Product406 getProduct406(String username, String password, String code, String infinityCode, String phoneNumber, String emailAddress, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct406(username, password, code, infinityCode, phoneNumber, emailAddress, reportSector, reportReason);
  }
  
  public Product159 getProduct159(String username, String password, String code, String infinityCode, String companyName, String companyRegNo, String taxID, String vatID, java.util.Calendar companyRegDate, String postalBoxNo, String postalTown, String postalCountry, String telephoneNo, String faxNo, String websiteAddress, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct159(username, password, code, infinityCode, companyName, companyRegNo, taxID, vatID, companyRegDate, postalBoxNo, postalTown, postalCountry, telephoneNo, faxNo, websiteAddress, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product125 getProduct125(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct125(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product108 getProduct108(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct108(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product112 getProduct112(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct112(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product114 getProduct114(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct114(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product110 getProduct110(String username, String password, String code, String infinityCode, int crn, String phoneNumber, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct110(username, password, code, infinityCode, crn, phoneNumber, reportSector, reportReason);
  }
  
  public Product121 getProduct121(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct121(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public Product124 getProduct124(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct124(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product102 getProduct102(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct102(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public Product101 getProduct101(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct101(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product104 getProduct104(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct104(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product116 getProduct116(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct116(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product118 getProduct118(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct118(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product105 getProduct105(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct105(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product109 getProduct109(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct109(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product103 getProduct103(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct103(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportReason);
  }
  
  public Product107 getProduct107(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct107(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product115 getProduct115(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct115(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public Product122 getProduct122(String username, String password, String code, String infinityCode, String name1, String name2, String name3, String name4, String nationalID, String passportNo, String serviceID, String alienID, String taxID, java.util.Calendar dateOfBirth, String postalBoxNo, String postalTown, String postalCountry, String telephoneWork, String telephoneHome, String telephoneMobile, String physicalAddress, String physicalTown, String physicalCountry, int reportSector, int reportReason) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getProduct122(username, password, code, infinityCode, name1, name2, name3, name4, nationalID, passportNo, serviceID, alienID, taxID, dateOfBirth, postalBoxNo, postalTown, postalCountry, telephoneWork, telephoneHome, telephoneMobile, physicalAddress, physicalTown, physicalCountry, reportSector, reportReason);
  }
  
  public ServerInfo getServerInfo(String username, String password, String code, String infinityCode) throws java.rmi.RemoteException{
    if (controllerKenya == null)
      _initControllerKenyaProxy();
    return controllerKenya.getServerInfo(username, password, code, infinityCode);
  }
  
  
}