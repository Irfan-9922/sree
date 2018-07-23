/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.intg.Valubean;


/**
 * @author :IRFAN
 *TIME:4:29:17 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlineSVC_IntgrLayera
 */
public class easyjetAirlineIntgVbResp {
	   private StatusdaoBEAN status;
	    private ResponcedaoBEAN responceMessage;
		/**
		 * @return the status
		 */
		public StatusdaoBEAN getStatus() {
			return status;
		}
		/**
		 * @param status the status to set
		 */
		public void setStatus(StatusdaoBEAN status) {
			this.status = status;
		}
		/**
		 * @return the responceMessage
		 */
		public ResponcedaoBEAN getResponceMessage() {
			return responceMessage;
		}
		/**
		 * @param responceMessage the responceMessage to set
		 */
		public void setResponceMessage(ResponcedaoBEAN responceMessage) {
			this.responceMessage = responceMessage;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "easyjetAirlineIntgVbResp [status=" + status + ", responceMessage=" + responceMessage + "]";
		}
	

}
