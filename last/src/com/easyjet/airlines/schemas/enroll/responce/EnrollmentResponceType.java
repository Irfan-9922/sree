
package com.easyjet.airlines.schemas.enroll.responce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrollmentResponceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollmentResponceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.easyjet.com/airlines/schemas/enroll/responce}StatusType"/>
 *         &lt;element name="ResponceMessage" type="{http://www.easyjet.com/airlines/schemas/enroll/responce}ResponceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollmentResponceType", propOrder = {
    "status",
    "responceMessage"
})
public class EnrollmentResponceType {

    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "ResponceMessage", required = true)
    protected ResponceType responceMessage;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the responceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ResponceType }
     *     
     */
    public ResponceType getResponceMessage() {
        return responceMessage;
    }

    /**
     * Sets the value of the responceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponceType }
     *     
     */
    public void setResponceMessage(ResponceType value) {
        this.responceMessage = value;
    }

}
