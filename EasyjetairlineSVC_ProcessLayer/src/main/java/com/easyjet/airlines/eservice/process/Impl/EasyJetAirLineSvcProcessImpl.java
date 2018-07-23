/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Impl;

import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbReq;
import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbResp;
import com.easyjet.airlines.eservice.intg.impl.EasyJetAirLineSvcDao;
import com.easyjet.airlines.eservice.intg.impl.EasyJetAirLineSvcDaoImpl;
import com.easyjet.airlines.eservice.process.Builder.easyjetAirlineProcessReqBuilder;
import com.easyjet.airlines.eservice.process.Builder.easyjetAirlineProcessRespBuilder;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbReq;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbResp;

/**
 * @author :IRFAN
 *TIME:7:41:53 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class EasyJetAirLineSvcProcessImpl implements EasyJetAirLineSvcProcess {
	public easyjetAirlineProcessVbResp enroll(easyjetAirlineProcessVbReq vbreq){
		System.out.println("process laye rstarted here"+vbreq);
		/*easyjetAirlineIntgVbReq dao=new easyjetAirlineIntgVbReq();
		Addressreqbeanint addd=new Addressreqbeanint();
		
		addd.setAddressLine1(vbreq.getAddress().getAddressLine1());
		addd.setAddressLine2(vbreq.getAddress().getAddressLine2());
		addd.setAddressline3(vbreq.getAddress().getAddressline3());
		dao.setAddress(addd);
		dao.setClientId(vbreq.getClientId());
		dao.setChannelId(vbreq.getChannelId());
		dao.setRequestId(vbreq.getRequestId());
		dao.setApiName(vbreq.getApiName());
		dao.setServiceName(vbreq.getServiceName());
		dao.setVersion(vbreq.getVersion());
		dao.setCardNumber(vbreq.getCardNumber());
		dao.setCity(vbreq.getCity());
		dao.setCountery(vbreq.getCountery());
		dao.setDob(vbreq.getDob());
		dao.setExpiryDate(vbreq.getExpiryDate());
		dao.setFirstName(vbreq.getFirstName());
		dao.setGender(vbreq.getGender());
		dao.setLastName(vbreq.getLastName());
		dao.setMiddelName(vbreq.getMiddelName());
		dao.setPostal(vbreq.getPostal());
		dao.setTital(vbreq.getTital());
		*/
		
		/*EasyJetAirLineSvcDao datacontroll=new  EasyJetAirLineSvcDaoImpl();
		
		easyjetAirlineIntgVbResp res=datacontroll.enroll(dao);
		*/
		EasyJetAirLineSvcDao datacontroll=new  EasyJetAirLineSvcDaoImpl();
		/**
		 * getting req from builder class
		 */
		easyjetAirlineProcessReqBuilder reb=new easyjetAirlineProcessReqBuilder();
		easyjetAirlineIntgVbReq d=reb.enroll(vbreq);
		easyjetAirlineIntgVbResp res=datacontroll.enroll(d);
    /**
     * commmenting code is use alternative for without builder classes
     */
		/*easyjetAirlineProcessVbResp resp=new easyjetAirlineProcessVbResp();
	  
		ResponceBEAN b=new ResponceBEAN();
		b.setCampignCode(res.getResponceMessage().getCampignCode());
		b.setCardNumber(res.getResponceMessage().getCardNumber());
		b.setFirstName(res.getResponceMessage().getFirstName());
		b.setLastName(res.getResponceMessage().getLastName());
		b.setPan(res.getResponceMessage().getPan());
		b.setPartnerCode(res.getResponceMessage().getPartnerCode());
		StatusBEAN bb=new StatusBEAN();
		bb.setResopnceCode(res.getStatus().getResopnceCode());
		bb.setRespMessage(res.getStatus().getRespMessage());
		resp.setResponceMessage(b);
		resp.setStatus(bb);*/
		/**
		 * getting responce from responce builder
		 */
		easyjetAirlineProcessRespBuilder builderresp=new easyjetAirlineProcessRespBuilder();
		easyjetAirlineProcessVbResp resp=builderresp.enroll(res);
		System.out.println("succesfull responce is comming from intigretion to process"+resp);
		
		return resp;
	}

}
