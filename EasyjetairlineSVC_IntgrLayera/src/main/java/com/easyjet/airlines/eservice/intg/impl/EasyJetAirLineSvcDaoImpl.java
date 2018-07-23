/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.intg.impl;

import com.easyjet.airlines.eservice.intg.Valubean.ResponcedaoBEAN;
import com.easyjet.airlines.eservice.intg.Valubean.StatusdaoBEAN;
import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbReq;
import com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbResp;

/**
 * @author :IRFAN
 *TIME:4:26:49 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlineSVC_IntgrLayera
 */
public class EasyJetAirLineSvcDaoImpl implements EasyJetAirLineSvcDao {

	/* (non-Javadoc)
	 * @see com.easyjet.airlines.eservice.intg.impl.EasyJetAirLineSvcDao#enroll(com.easyjet.airlines.eservice.intg.Valubean.easyjetAirlineIntgVbReq)
	 */
	public easyjetAirlineIntgVbResp enroll(easyjetAirlineIntgVbReq dao) {
		System.out.println("from inINTIGRETION LAYER"+dao);
		// TODO Auto-generated method stub
		easyjetAirlineIntgVbResp res=new easyjetAirlineIntgVbResp();
		StatusdaoBEAN status=new StatusdaoBEAN();
		ResponcedaoBEAN respbean=new ResponcedaoBEAN();
		
		status.setResopnceCode("9304");
		status.setRespMessage("deliverd");
		respbean.setCampignCode("1234");
		respbean.setCardNumber("433");
		respbean.setFirstName(dao.getFirstName());
		respbean.setLastName(dao.getLastName());
		respbean.setPartnerCode("8374");
		respbean.setPan("8373");
		res.setResponceMessage(respbean);
		res.setStatus(status);
		
		System.out.println("responce from intigrtion layer*****************************"+res);
		
		return res;
	}

}
