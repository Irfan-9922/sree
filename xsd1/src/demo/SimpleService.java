/**
 * SimpleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

public interface SimpleService extends javax.xml.rpc.Service {
    public java.lang.String getsimplePortAddress();

    public demo.Simple getsimplePort() throws javax.xml.rpc.ServiceException;

    public demo.Simple getsimplePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
