package org.bimserver.generatedclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-31T16:04:23.847+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "org.buildingsmart.bimsie1", name = "Bimsie1AuthInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface Bimsie1AuthInterface {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "isLoggedIn", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.IsLoggedIn")
    @WebMethod(action = "isLoggedIn")
    @ResponseWrapper(localName = "isLoggedInResponse", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.IsLoggedInResponse")
    public java.lang.Boolean isLoggedIn() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.Login")
    @WebMethod(action = "login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.LoginResponse")
    public java.lang.String login(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    ) throws UserException_Exception, ServerException_Exception;

    @RequestWrapper(localName = "logout", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.Logout")
    @WebMethod(action = "logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.LogoutResponse")
    public void logout() throws UserException_Exception, ServerException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccessMethod", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.GetAccessMethod")
    @WebMethod(action = "getAccessMethod")
    @ResponseWrapper(localName = "getAccessMethodResponse", targetNamespace = "org.buildingsmart.bimsie1", className = "org.bimserver.generatedclient.GetAccessMethodResponse")
    public org.bimserver.generatedclient.SAccessMethod getAccessMethod() throws UserException_Exception, ServerException_Exception;
}
