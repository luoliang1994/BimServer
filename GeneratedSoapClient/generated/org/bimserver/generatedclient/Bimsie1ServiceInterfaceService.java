package org.bimserver.generatedclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-31T16:04:19.259+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "Bimsie1ServiceInterfaceService", 
                  wsdlLocation = "generated/Bimsie1ServiceInterface.wsdl",
                  targetNamespace = "org.buildingsmart.bimsie1") 
public class Bimsie1ServiceInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("org.buildingsmart.bimsie1", "Bimsie1ServiceInterfaceService");
    public final static QName Bimsie1ServiceInterfacePort = new QName("org.buildingsmart.bimsie1", "Bimsie1ServiceInterfacePort");
    static {
        URL url = Bimsie1ServiceInterfaceService.class.getResource("generated/Bimsie1ServiceInterface.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Bimsie1ServiceInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "generated/Bimsie1ServiceInterface.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Bimsie1ServiceInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Bimsie1ServiceInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Bimsie1ServiceInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Bimsie1ServiceInterface
     */
    @WebEndpoint(name = "Bimsie1ServiceInterfacePort")
    public Bimsie1ServiceInterface getBimsie1ServiceInterfacePort() {
        return super.getPort(Bimsie1ServiceInterfacePort, Bimsie1ServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Bimsie1ServiceInterface
     */
    @WebEndpoint(name = "Bimsie1ServiceInterfacePort")
    public Bimsie1ServiceInterface getBimsie1ServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(Bimsie1ServiceInterfacePort, Bimsie1ServiceInterface.class, features);
    }

}
