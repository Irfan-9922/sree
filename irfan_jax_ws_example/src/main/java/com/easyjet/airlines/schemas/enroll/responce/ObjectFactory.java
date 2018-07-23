
package com.easyjet.airlines.schemas.enroll.responce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.easyjet.airlines.schemas.enroll.responce package. 
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

    private final static QName _EnrollmentResponce_QNAME = new QName("http://www.easyjet.com/airlines/schemas/enroll/responce", "EnrollmentResponce");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.easyjet.airlines.schemas.enroll.responce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnrollmentResponceType }
     * 
     */
    public EnrollmentResponceType createEnrollmentResponceType() {
        return new EnrollmentResponceType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link ResponceType }
     * 
     */
    public ResponceType createResponceType() {
        return new ResponceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollmentResponceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.easyjet.com/airlines/schemas/enroll/responce", name = "EnrollmentResponce")
    public JAXBElement<EnrollmentResponceType> createEnrollmentResponce(EnrollmentResponceType value) {
        return new JAXBElement<EnrollmentResponceType>(_EnrollmentResponce_QNAME, EnrollmentResponceType.class, null, value);
    }

}
