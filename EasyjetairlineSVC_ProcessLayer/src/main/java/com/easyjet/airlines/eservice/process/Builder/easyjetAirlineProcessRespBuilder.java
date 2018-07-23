/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Builder;

import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbResp;
import com.easyjet.airlines.eservice.process.Valubean.ResponceBEAN;
import com.easyjet.airlines.eservice.process.Valubean.StatusBEAN;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbResp;

/**
 * @author :IRFAN
 *TIME:7:47:27 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class easyjetAirlineProcessRespBuilder {
	public easyjetAirlineProcessVbResp enroll(easyjetAirlineIntgVbResp daoresp){
		System.out.println("********************* entering into resp builder class ::: data is"+daoresp);
		easyjetAirlineProcessVbResp resp=new easyjetAirlineProcessVbResp();
		  
		ResponceBEAN b=new ResponceBEAN();
		b.setCampignCode(daoresp.getResponceMessage().getCampignCode());
		b.setCardNumber(daoresp.getResponceMessage().getCardNumber());
		b.setFirstName(daoresp.getResponceMessage().getFirstName());
		b.setLastName(daoresp.getResponceMessage().getLastName());
		b.setPan(daoresp.getResponceMessage().getPan());
		b.setPartnerCode(daoresp.getResponceMessage().getPartnerCode());
		StatusBEAN bb=new StatusBEAN();
		bb.setResopnceCode(daoresp.getStatus().getResopnceCode());
		bb.setRespMessage(daoresp.getStatus().getRespMessage());
		resp.setResponceMessage(b);
		resp.setStatus(bb);
		System.out.println("********************aftre converting dao resp to process resp data is"+resp);
		System.out.println("!!!!!!!!!!departing form responce builder");
		return resp;
	}

}
