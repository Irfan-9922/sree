/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Valubean;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author :IRFAN
 *TIME:5:13:03 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class ResponceBEAN {
    private String pan;
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String campignCode;
    private String partnerCode;
	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the campignCode
	 */
	public String getCampignCode() {
		return campignCode;
	}
	/**
	 * @param campignCode the campignCode to set
	 */
	public void setCampignCode(String campignCode) {
		this.campignCode = campignCode;
	}
	/**
	 * @return the partnerCode
	 */
	public String getPartnerCode() {
		return partnerCode;
	}
	/**
	 * @param partnerCode the partnerCode to set
	 */
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponceBEAN [pan=" + pan + ", firstName=" + firstName + ", lastName=" + lastName + ", cardNumber="
				+ cardNumber + ", campignCode=" + campignCode + ", partnerCode=" + partnerCode + "]";
	}


}
