
package com.easyjet.airlines.schemas.enroll.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.easyjet.airlines.schemas.enroll.request package. 
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

    private final static QName _EnrollmentReq_QNAME = new QName("http://www.easyjet.com/airlines/schemas/enroll/request", "EnrollmentReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.easyjet.airlines.schemas.enroll.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnrollmentReqType }
     * 
     */
    public EnrollmentReqType createEnrollmentReqType() {
        return new EnrollmentReqType();
    }

    /**
     * Create an instance of {@link ServiceDetailsType }
     * 
     */
    public ServiceDetailsType createServiceDetailsType() {
        return new ServiceDetailsType();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link ClientDetailsType }
     * 
     */
    public ClientDetailsType createClientDetailsType() {
        return new ClientDetailsType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollmentReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.easyjet.com/airlines/schemas/enroll/request", name = "EnrollmentReq")
    public JAXBElement<EnrollmentReqType> createEnrollmentReq(EnrollmentReqType value) {
        return new JAXBElement<EnrollmentReqType>(_EnrollmentReq_QNAME, EnrollmentReqType.class, null, value);
    }

}
