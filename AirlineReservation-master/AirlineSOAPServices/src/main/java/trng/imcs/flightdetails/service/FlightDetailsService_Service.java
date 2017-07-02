
package trng.imcs.flightdetails.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FlightDetailsService", targetNamespace = "http://www.example.org/FlightDetailsService/", wsdlLocation = "file:/C:/IMCS/workspace-sts-3.8.4.RELEASE/AirlineReservation/AirlineSOAPServices/src/main/resources/FlightDetailsService.wsdl")
public class FlightDetailsService_Service
    extends Service
{

    private final static URL FLIGHTDETAILSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(trng.imcs.flightdetails.service.FlightDetailsService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = trng.imcs.flightdetails.service.FlightDetailsService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/IMCS/workspace-sts-3.8.4.RELEASE/AirlineReservation/AirlineSOAPServices/src/main/resources/FlightDetailsService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/IMCS/workspace-sts-3.8.4.RELEASE/AirlineReservation/AirlineSOAPServices/src/main/resources/FlightDetailsService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        FLIGHTDETAILSSERVICE_WSDL_LOCATION = url;
    }

    public FlightDetailsService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightDetailsService_Service() {
        super(FLIGHTDETAILSSERVICE_WSDL_LOCATION, new QName("http://www.example.org/FlightDetailsService/", "FlightDetailsService"));
    }

    /**
     * 
     * @return
     *     returns FlightDetailsService
     */
    @WebEndpoint(name = "FlightDetailsServiceSOAP")
    public FlightDetailsService getFlightDetailsServiceSOAP() {
        return super.getPort(new QName("http://www.example.org/FlightDetailsService/", "FlightDetailsServiceSOAP"), FlightDetailsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightDetailsService
     */
    @WebEndpoint(name = "FlightDetailsServiceSOAP")
    public FlightDetailsService getFlightDetailsServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/FlightDetailsService/", "FlightDetailsServiceSOAP"), FlightDetailsService.class, features);
    }

}