package trng.imcs.restwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.imcs.restwebservices.beans.FlightInformation;
import trng.imcs.restwebservices.services.FlightService;

@RestController
@RequestMapping("/rest")
public class RestServiceController {

	@Autowired
	FlightService flightService;

	@RequestMapping(value = "/{flightID}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> getEmployee(@PathVariable String flightID) {

		FlightInformation flightInfo = flightService.getFlightInfo(Integer.parseInt(flightID));
		if (flightInfo == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(flightInfo, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> createEmployee(@RequestBody FlightInformation flightInfo) {

		FlightInformation newFlightInfo = flightService.saveFlightDetails(flightInfo);
		return new ResponseEntity<>(newFlightInfo, HttpStatus.CREATED);
	}

	/*@RequestMapping(value = "/{empId}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEmployee(@PathVariable String empId) {
		String employeeId = empService.deleteEmployee(empId);
		if (employeeId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {

			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}

	}

	@RequestMapping(method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Employee updateEmployee(@RequestBody Employee employee) {

		return empService.updateEmployee(employee);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees() {

		List<Employee> employees = empService.getEmployees();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);

	}*/
}
