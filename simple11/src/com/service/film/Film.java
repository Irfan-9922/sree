
package com.service.film;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "film", targetNamespace = "http://www.service.com/film/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Film {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.service.com/film/NewOperation")
    @WebResult(name = "sayhelloreturn", targetNamespace = "http://www.service.com/film/", partName = "sayhelloreturn")
    public String getname(
        @WebParam(name = "name", targetNamespace = "http://www.service.com/film/", partName = "name")
        String name);

}
