/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.epam.service;

public interface CustomerService extends java.rmi.Remote {
    public by.epam.service.Customer[] getCustomers() throws java.rmi.RemoteException;
    public by.epam.service.Customer getCustomerById(int arg0) throws java.rmi.RemoteException;
    public void addCustomer(by.epam.service.Customer arg0) throws java.rmi.RemoteException;
    public void deleteCustomer(int arg0) throws java.rmi.RemoteException;
    public void updateCustomer(by.epam.service.Customer arg0) throws java.rmi.RemoteException;
}
