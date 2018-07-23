/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Valubean;

import javax.xml.bind.annotation.XmlElement;


/**
 * @author :IRFAN
 *TIME:7:45:03 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class easyjetAirlineProcessVbResp {
	    private StatusBEAN status;
	    private ResponceBEAN responceMessage;
		/**
		 * @return the status
		 */
		public StatusBEAN getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(StatusBEAN status) {
			this.status = status;
		}
		/**
		 * @return the responceMessage
		 */
		public ResponceBEAN getResponceMessage() {
			return responceMessage;
		}
		/**
		 * @param responceMessage the responceMessage to set
		 */
		public void setResponceMessage(ResponceBEAN responceMessage) {
			this.responceMessage = responceMessage;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "easyjetAirlineProcessVbResp [status=" + status + ", responceMessage=" + responceMessage + "]";
		}
	

}
