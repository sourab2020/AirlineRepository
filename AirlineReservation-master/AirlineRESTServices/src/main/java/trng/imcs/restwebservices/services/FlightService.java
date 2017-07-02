package trng.imcs.restwebservices.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import trng.imcs.restwebservices.beans.FlightInformation;


@Service
public class FlightService {
	private final AtomicLong empIdGen = new AtomicLong();

	List<FlightInformation> flightInformations = new ArrayList<FlightInformation>();

	public FlightInformation getFlightInfo(Integer flightID) {
		FlightInformation flightInformation = new FlightInformation();
		flightInformation.setAirlineId(100);
		flightInformation.setAirlineName("BA");
		flightInformation.setArrivalTime("20:00");
		flightInformation.setDuration("13");
		flightInformation.setDepartureTime("00:00");
		flightInformation.setAvailableSeats(50);
		flightInformation.setDestination("INDIA");
		flightInformation.setOrigin("USA");
		flightInformation.setPrice(500.0);
		flightInformation.setTotalSeats(100);
		flightInformation.setFlightId(flightID);
		
		return flightInformation;
	}

	public FlightInformation saveFlightDetails(FlightInformation flightInfo) {
		//flightInfo.setEmpNo("" + empIdGen.incrementAndGet());
		//flightInfo.add(employee);
		return flightInfo;
	}

/*	public FliInghtService() {
		FlightInformation employee = new FlightInformation();
		employee.setEmpNo("1001");
		employee.setName("Gautham");
		employee.setAge(24);
		employee.setSalary(6000.00);
		employees.add(employee);

		Employee employee1 = new Employee();
		employee1.setEmpNo("1002");
		employee1.setName("Dinesh");
		employee1.setAge(26);
		employee1.setSalary(6400.00);
		employees.add(employee);
	}

	public Employee getEmployee(String empId) {

		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				return employee;
			}
		}
		return null;
	}

	public Employee saveEmployee(Employee employee) {

		employee.setEmpNo("" + empIdGen.incrementAndGet());
		employees.add(employee);
		return employee;
	}

	public Employee updateEmployee(Employee source) {
		Employee employee = getEmployee(source.getEmpNo());
		employee.setName(source.getName());
		employee.setAge(source.getAge());
		employee.setSalary(source.getSalary());

		return employee;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	public String deleteEmployee(String empId) {

		for (Employee employee : employees) {
			if (employee.getEmpNo().equals(empId)) {
				employees.remove(employee);
				return empId;
			}
		}
		return null;
	}*/

}
