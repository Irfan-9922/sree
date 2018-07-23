
package com.easyjet.airlines.schemas.enroll.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrollmentReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollmentReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientDetails" type="{http://www.easyjet.com/airlines/schemas/enroll/request}ClientDetailsType"/>
 *         &lt;element name="CustomerDetails" type="{http://www.easyjet.com/airlines/schemas/enroll/request}CustomerDetailsType"/>
 *         &lt;element name="ServiceDetails" type="{http://www.easyjet.com/airlines/schemas/enroll/request}ServiceDetailsType"/>
 *         &lt;element name="Address" type="{http://www.easyjet.com/airlines/schemas/enroll/request}AddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollmentReqType", propOrder = {
    "clientDetails",
    "customerDetails",
    "serviceDetails",
    "address"
})
public class EnrollmentReqType {

    @XmlElement(name = "ClientDetails", required = true)
    protected ClientDetailsType clientDetails;
    @XmlElement(name = "CustomerDetails", required = true)
    protected CustomerDetailsType customerDetails;
    @XmlElement(name = "ServiceDetails", required = true)
    protected ServiceDetailsType serviceDetails;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;

    /**
     * Gets the value of the clientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetailsType }
     *     
     */
    public ClientDetailsType getClientDetails() {
        return clientDetails;
    }

    /**
     * Sets the value of the clientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetailsType }
     *     
     */
    public void setClientDetails(ClientDetailsType value) {
        this.clientDetails = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetailsType }
     *     
     */
    public CustomerDetailsType getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the value of the customerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetailsType }
     *     
     */
    public void setCustomerDetails(CustomerDetailsType value) {
        this.customerDetails = value;
    }

    /**
     * Gets the value of the serviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailsType }
     *     
     */
    public ServiceDetailsType getServiceDetails() {
        return serviceDetails;
    }

    /**
     * Sets the value of the serviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailsType }
     *     
     */
    public void setServiceDetails(ServiceDetailsType value) {
        this.serviceDetails = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
