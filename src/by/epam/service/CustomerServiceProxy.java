package by.epam.service;

public class CustomerServiceProxy implements by.epam.service.CustomerService {
  private String _endpoint = null;
  private by.epam.service.CustomerService customerService = null;
  
  public CustomerServiceProxy() {
    _initCustomerServiceProxy();
  }
  
  public CustomerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServiceProxy();
  }
  
  private void _initCustomerServiceProxy() {
    try {
      customerService = (new by.epam.service.impl.CustomerServiceImplServiceLocator()).getCustomerServiceImplPort();
      if (customerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerService != null)
      ((javax.xml.rpc.Stub)customerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public by.epam.service.CustomerService getCustomerService() {
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService;
  }
  
  public by.epam.service.Customer[] getCustomers() throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService.getCustomers();
  }
  
  public by.epam.service.Customer getCustomerById(int arg0) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    return customerService.getCustomerById(arg0);
  }
  
  public void addCustomer(by.epam.service.Customer arg0) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    customerService.addCustomer(arg0);
  }
  
  public void deleteCustomer(int arg0) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    customerService.deleteCustomer(arg0);
  }
  
  public void updateCustomer(by.epam.service.Customer arg0) throws java.rmi.RemoteException{
    if (customerService == null)
      _initCustomerServiceProxy();
    customerService.updateCustomer(arg0);
  }
  
  
}