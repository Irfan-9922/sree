/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package service;

import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;
import com.easyjet.airlines.schemas.enroll.responce.EnrollmentResponceType;
import com.easyjet.schema.easervice.EasyJetService;

import Intigretion.dao;
import Intigretion.vbreq;

/**
 * @author :IRFAN
 *TIME:4:04:45 am
 * DATE:13-May-2017
 *PROJECTNAME:irfan_jax_ws_example
 */
public class easyjetImpl implements EasyJetService{

	/* (non-Javadoc)
	 * @see com.easyjet.schema.easervice.EasyJetService#enroll(com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType)
	 */
	public EnrollmentResponceType enroll(EnrollmentReqType w) {
		// TODO Auto-generated method stub
		vbreq re=new vbreq();
		re.setChannelId(w.getClientDetails().getChannelId());
		re.setClientId(w.getClientDetails().getClientId());
		re.setReqId(w.getClientDetails().getRequestId());
		dao d=new dao();
		
		return null;
	}

}
