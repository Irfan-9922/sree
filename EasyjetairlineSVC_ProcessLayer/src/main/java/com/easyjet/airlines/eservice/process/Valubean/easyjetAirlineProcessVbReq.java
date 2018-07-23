/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Valubean;

import javax.xml.bind.annotation.XmlElement;

import com.easyjet.airlines.eservice.intg.Valubean.Addressreqbeanint;

/**
 * @author :IRFAN
 *TIME:7:45:25 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class easyjetAirlineProcessVbReq {
	    private String clientId;
	    private String channelId;
	    private String requestId;
	    private String tital;
	    private String firstName;
	    private String lastName;
	    private String middelName;
	    private String dob;
	    private String gender;
	    private Addressreqbean address;
	    private String city;
	    private String countery;
	    private String postal;
	    private String cardNumber;
	    private String expiryDate;

	    private String serviceName;
	    private String apiName;
	    private String version;
		/**
		 * @return the clientId
		 */
		public String getClientId() {
			return clientId;
		}
		/**
		 * @param clientId the clientId to set
		 */
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		/**
		 * @return the channelId
		 */
		public String getChannelId() {
			return channelId;
		}
		/**
		 * @param channelId the channelId to set
		 */
		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}
		/**
		 * @return the requestId
		 */
		public String getRequestId() {
			return requestId;
		}
		/**
		 * @param requestId the requestId to set
		 */
		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}
		/**
		 * @return the tital
		 */
		public String getTital() {
			return tital;
		}
		/**
		 * @param tital the tital to set
		 */
		public void setTital(String tital) {
			this.tital = tital;
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
		 * @return the middelName
		 */
		public String getMiddelName() {
			return middelName;
		}
		/**
		 * @param middelName the middelName to set
		 */
		public void setMiddelName(String middelName) {
			this.middelName = middelName;
		}
		/**
		 * @return the dob
		 */
		public String getDob() {
			return dob;
		}
		/**
		 * @param dob the dob to set
		 */
		public void setDob(String dob) {
			this.dob = dob;
		}
		/**
		 * @return the gender
		 */
		public String getGender() {
			return gender;
		}
		/**
		 * @param gender the gender to set
		 */
		public void setGender(String gender) {
			this.gender = gender;
		}
		/**
		 * @return the address
		 */
		public Addressreqbean getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(Addressreqbean address) {
			this.address = address;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the countery
		 */
		public String getCountery() {
			return countery;
		}
		/**
		 * @param countery the countery to set
		 */
		public void setCountery(String countery) {
			this.countery = countery;
		}
		/**
		 * @return the postal
		 */
		public String getPostal() {
			return postal;
		}
		/**
		 * @param postal the postal to set
		 */
		public void setPostal(String postal) {
			this.postal = postal;
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
		 * @return the expiryDate
		 */
		public String getExpiryDate() {
			return expiryDate;
		}
		/**
		 * @param expiryDate the expiryDate to set
		 */
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		/**
		 * @return the serviceName
		 */
		public String getServiceName() {
			return serviceName;
		}
		/**
		 * @param serviceName the serviceName to set
		 */
		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
		/**
		 * @return the apiName
		 */
		public String getApiName() {
			return apiName;
		}
		/**
		 * @param apiName the apiName to set
		 */
		public void setApiName(String apiName) {
			this.apiName = apiName;
		}
		/**
		 * @return the version
		 */
		public String getVersion() {
			return version;
		}
		/**
		 * @param version the version to set
		 */
		public void setVersion(String version) {
			this.version = version;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "easyjetAirlineProcessVbReq [clientId=" + clientId + ", channelId=" + channelId + ", requestId="
					+ requestId + ", tital=" + tital + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", middelName=" + middelName + ", dob=" + dob + ", gender=" + gender + ", address=" + address
					+ ", city=" + city + ", countery=" + countery + ", postal=" + postal + ", cardNumber=" + cardNumber
					+ ", expiryDate=" + expiryDate + ", serviceName=" + serviceName + ", apiName=" + apiName
					+ ", version=" + version + "]";
		}
		/**
		 * @param addd
		 */
		
		

}
