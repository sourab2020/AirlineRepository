package trng.imcs.flightdetails.service;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "FlightDetailsService", targetNamespace = "http://www.example.org/FlightDetailsService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public class FlightDetailsServiceImpl implements FlightDetailsService {

	@Override
	public FlightDetailsGetResponseType getFlightDetails(FlightDetailsGetRequestType flightDetailsGetRequest) {
		FlightDetailsGetResponseType value = new FlightDetailsGetResponseType();
		value.setAvailableSeats(5);
		value.setFlightDepartureDate("20:00");
		value.setFlightId(1);
		value.setPrice(600.0);
		return value;
		
	}

	@Override
	public FlightDetailsCreateResponseType createFlightDetails(
			FlightDetailsCreateRequestType flightDetailsCreateRequest) {
		FlightDetailsCreateResponseType value = new FlightDetailsCreateResponseType();
		value.setMessage("Success");
		return value;
	}

	@Override
	public FlightDetailsDeleteResponseType deleteFlightDetails(
			FlightDetailsDeleteRequestType flightDetailsDeleteRequest) {
		FlightDetailsDeleteResponseType value = new FlightDetailsDeleteResponseType();
		value.setMessage("success");
		return value;
	}

	@Override
	public FlightDetailsUpdateResponseType updateFlightDetails(
			FlightDetailsUpdateRequestType flightDetailsUpdateRequest) {
		FlightDetailsUpdateResponseType value = new FlightDetailsUpdateResponseType();
		value.setMessage("Success");
		return value;
	}

}
