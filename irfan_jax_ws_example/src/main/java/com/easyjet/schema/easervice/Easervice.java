
package com.easyjet.schema.easervice;

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
@WebServiceClient(name = "Easervice", targetNamespace = "http://www.easyjet.com/schema/Easervice", wsdlLocation = "file:/C:/%20sreenuTech/irfan_jax_ws_example/src/main/webapp/WEB-INF/Easervice.wsdl")
public class Easervice
    extends Service
{

    private final static URL EASERVICE_WSDL_LOCATION;
    private final static WebServiceException EASERVICE_EXCEPTION;
    private final static QName EASERVICE_QNAME = new QName("http://www.easyjet.com/schema/Easervice", "Easervice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/%20sreenuTech/irfan_jax_ws_example/src/main/webapp/WEB-INF/Easervice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EASERVICE_WSDL_LOCATION = url;
        EASERVICE_EXCEPTION = e;
    }

    public Easervice() {
        super(__getWsdlLocation(), EASERVICE_QNAME);
    }

    public Easervice(WebServiceFeature... features) {
        super(__getWsdlLocation(), EASERVICE_QNAME, features);
    }

    public Easervice(URL wsdlLocation) {
        super(wsdlLocation, EASERVICE_QNAME);
    }

    public Easervice(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EASERVICE_QNAME, features);
    }

    public Easervice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Easervice(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EasyJetService
     */
    @WebEndpoint(name = "EaserviceSOAP")
    public EasyJetService getEaserviceSOAP() {
        return super.getPort(new QName("http://www.easyjet.com/schema/Easervice", "EaserviceSOAP"), EasyJetService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EasyJetService
     */
    @WebEndpoint(name = "EaserviceSOAP")
    public EasyJetService getEaserviceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.easyjet.com/schema/Easervice", "EaserviceSOAP"), EasyJetService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EASERVICE_EXCEPTION!= null) {
            throw EASERVICE_EXCEPTION;
        }
        return EASERVICE_WSDL_LOCATION;
    }

}
