
package com.ij;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ij package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmpResponse_QNAME = new QName("http://ij.com/", "getEmpResponse");
    private final static QName _GetEmp_QNAME = new QName("http://ij.com/", "getEmp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ij
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpResponse }
     * 
     */
    public GetEmpResponse createGetEmpResponse() {
        return new GetEmpResponse();
    }

    /**
     * Create an instance of {@link GetEmp }
     * 
     */
    public GetEmp createGetEmp() {
        return new GetEmp();
    }

    /**
     * Create an instance of {@link Employeedemo }
     * 
     */
    public Employeedemo createEmployeedemo() {
        return new Employeedemo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ij.com/", name = "getEmpResponse")
    public JAXBElement<GetEmpResponse> createGetEmpResponse(GetEmpResponse value) {
        return new JAXBElement<GetEmpResponse>(_GetEmpResponse_QNAME, GetEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ij.com/", name = "getEmp")
    public JAXBElement<GetEmp> createGetEmp(GetEmp value) {
        return new JAXBElement<GetEmp>(_GetEmp_QNAME, GetEmp.class, null, value);
    }

}
