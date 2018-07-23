/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Valubean;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author :IRFAN
 *TIME:5:11:50 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class StatusBEAN {
	    private String resopnceCode;
	    private String respMessage;
		/**
		 * @return the resopnceCode
		 */
		public String getResopnceCode() {
			return resopnceCode;
		}
		/**
		 * @param resopnceCode the resopnceCode to set
		 */
		public void setResopnceCode(String resopnceCode) {
			this.resopnceCode = resopnceCode;
		}
		/**
		 * @return the respMessage
		 */
		public String getRespMessage() {
			return respMessage;
		}
		/**
		 * @param respMessage the respMessage to set
		 */
		public void setRespMessage(String respMessage) {
			this.respMessage = respMessage;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "StatusBEAN [resopnceCode=" + resopnceCode + ", respMessage=" + respMessage + "]";
		}

}
