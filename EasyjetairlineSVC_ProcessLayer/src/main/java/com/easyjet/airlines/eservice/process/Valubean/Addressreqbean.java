/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Valubean;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author :IRFAN
 *TIME:3:55:49 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class Addressreqbean {
	    private String addressLine1;
	    private String addressLine2;
	    private String addressline3;
		/**
		 * @return the addressLine1
		 */
		public String getAddressLine1() {
			return addressLine1;
		}
		/**
		 * @param addressLine1 the addressLine1 to set
		 */
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		/**
		 * @return the addressLine2
		 */
		public String getAddressLine2() {
			return addressLine2;
		}
		/**
		 * @param addressLine2 the addressLine2 to set
		 */
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		/**
		 * @return the addressline3
		 */
		public String getAddressline3() {
			return addressline3;
		}
		/**
		 * @param addressline3 the addressline3 to set
		 */
		public void setAddressline3(String addressline3) {
			this.addressline3 = addressline3;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Addressreqbean [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressline3="
					+ addressline3 + "]";
		}

}
