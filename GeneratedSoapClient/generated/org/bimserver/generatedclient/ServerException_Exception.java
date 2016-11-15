
package org.bimserver.generatedclient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-31T16:04:26.755+02:00
 * Generated source version: 2.7.3
 */

@WebFault(name = "ServerException", targetNamespace = "bimserver")
public class ServerException_Exception extends Exception {
    
	private static final long serialVersionUID = -2636825072827753165L;
	private org.bimserver.generatedclient.ServerException serverException;

    public ServerException_Exception() {
        super();
    }
    
    public ServerException_Exception(String message) {
        super(message);
    }
    
    public ServerException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException_Exception(String message, org.bimserver.generatedclient.ServerException serverException) {
        super(message);
        this.serverException = serverException;
    }

    public ServerException_Exception(String message, org.bimserver.generatedclient.ServerException serverException, Throwable cause) {
        super(message, cause);
        this.serverException = serverException;
    }

    public org.bimserver.generatedclient.ServerException getFaultInfo() {
        return this.serverException;
    }
}
