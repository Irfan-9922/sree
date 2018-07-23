/**
 * SimpleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

public class SimpleServiceLocator extends org.apache.axis.client.Service implements demo.SimpleService {

    public SimpleServiceLocator() {
    }


    public SimpleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for simplePort
    private java.lang.String simplePort_address = "http://localhost:1212/irfan1";

    public java.lang.String getsimplePortAddress() {
        return simplePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String simplePortWSDDServiceName = "simplePort";

    public java.lang.String getsimplePortWSDDServiceName() {
        return simplePortWSDDServiceName;
    }

    public void setsimplePortWSDDServiceName(java.lang.String name) {
        simplePortWSDDServiceName = name;
    }

    public demo.Simple getsimplePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(simplePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsimplePort(endpoint);
    }

    public demo.Simple getsimplePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            demo.SimplePortBindingStub _stub = new demo.SimplePortBindingStub(portAddress, this);
            _stub.setPortName(getsimplePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsimplePortEndpointAddress(java.lang.String address) {
        simplePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (demo.Simple.class.isAssignableFrom(serviceEndpointInterface)) {
                demo.SimplePortBindingStub _stub = new demo.SimplePortBindingStub(new java.net.URL(simplePort_address), this);
                _stub.setPortName(getsimplePortWSDDServiceName());
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
        if ("simplePort".equals(inputPortName)) {
            return getsimplePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo/", "simpleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo/", "simplePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("simplePort".equals(portName)) {
            setsimplePortEndpointAddress(address);
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
