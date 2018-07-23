/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.process.Builder;

import com.easyjet.airlines.eservice.intg.Valubean.Addressreqbeanint;
import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbReq;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbReq;

/**
 * @author :IRFAN
 *TIME:7:48:05 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlineSVC_ProcessLayer
 */
public class easyjetAirlineProcessReqBuilder {
	public easyjetAirlineIntgVbReq enroll(easyjetAirlineProcessVbReq vbreq){
		System.out.println("**** entering into req process builder ");
		System.out.println("@@@@@@@@@@ data coming from process req builder"+vbreq);
		
		easyjetAirlineIntgVbReq dao=new easyjetAirlineIntgVbReq();
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
		System.out.println("@@@@@@@@@@ data coming from process req builder"+dao);
		System.out.println("**** departing from process builder ");
		
		return dao;
		
	}
	

}
