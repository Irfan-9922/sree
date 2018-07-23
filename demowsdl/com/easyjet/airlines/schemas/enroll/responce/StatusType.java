
package com.easyjet.airlines.schemas.enroll.responce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResopnceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RespMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
    "resopnceCode",
    "respMessage"
})
public class StatusType {

    @XmlElement(name = "ResopnceCode", required = true)
    protected String resopnceCode;
    @XmlElement(name = "RespMessage", required = true)
    protected String respMessage;

    /**
     * Gets the value of the resopnceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResopnceCode() {
        return resopnceCode;
    }

    /**
     * Sets the value of the resopnceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResopnceCode(String value) {
        this.resopnceCode = value;
    }

    /**
     * Gets the value of the respMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespMessage() {
        return respMessage;
    }

    /**
     * Sets the value of the respMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespMessage(String value) {
        this.respMessage = value;
    }

}
