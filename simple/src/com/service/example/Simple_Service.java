
package com.service.example;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "simple", targetNamespace = "http://www.service.com/example/", wsdlLocation = "file:/C:/sreenuTech/simple/WebContent/WEB-INF/simple.wsdl")
public class Simple_Service
    extends Service
{

    private final static URL SIMPLE_WSDL_LOCATION;
    private final static WebServiceException SIMPLE_EXCEPTION;
    private final static QName SIMPLE_QNAME = new QName("http://www.service.com/example/", "simple");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/sreenuTech/simple/WebContent/WEB-INF/simple.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMPLE_WSDL_LOCATION = url;
        SIMPLE_EXCEPTION = e;
    }

    public Simple_Service() {
        super(__getWsdlLocation(), SIMPLE_QNAME);
    }

    public Simple_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMPLE_QNAME, features);
    }

    public Simple_Service(URL wsdlLocation) {
        super(wsdlLocation, SIMPLE_QNAME);
    }

    public Simple_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMPLE_QNAME, features);
    }

    public Simple_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Simple_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Simple
     */
    @WebEndpoint(name = "simpleSOAP")
    public Simple getSimpleSOAP() {
        return super.getPort(new QName("http://www.service.com/example/", "simpleSOAP"), Simple.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Simple
     */
    @WebEndpoint(name = "simpleSOAP")
    public Simple getSimpleSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.service.com/example/", "simpleSOAP"), Simple.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMPLE_EXCEPTION!= null) {
            throw SIMPLE_EXCEPTION;
        }
        return SIMPLE_WSDL_LOCATION;
    }

}
