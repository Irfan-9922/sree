
package com.easyjet.schema.easervice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;
import com.easyjet.airlines.schemas.enroll.responce.EnrollmentResponceType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EasyJetService", targetNamespace = "http://www.easyjet.com/schema/Easervice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.easyjet.airlines.schemas.enroll.request.ObjectFactory.class,
    com.easyjet.airlines.schemas.enroll.responce.ObjectFactory.class
})
public interface EasyJetService {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.easyjet.airlines.schemas.enroll.responce.EnrollmentResponceType
     */
    @WebMethod(operationName = "Enroll", action = "http://www.example.org/Easervice/Enroll")
    @WebResult(name = "EnrollmentResponce", targetNamespace = "http://www.easyjet.com/airlines/schemas/enroll/responce", partName = "parameters")
    public EnrollmentResponceType enroll(
        @WebParam(name = "EnrollmentReq", targetNamespace = "http://www.easyjet.com/airlines/schemas/enroll/request", partName = "parameters")
        EnrollmentReqType parameters);

}