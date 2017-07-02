package org.AirlineRepository;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.RollbackException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.SystemException;

import org.AirlineRepository.entity.Flight;
import org.AirlineRepository.service.FlightInterfaceImpl;
import org.AirlineRepository.utils.EmployeeUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	private FlightInterfaceImpl imp;
	public App(){
		imp=new FlightInterfaceImpl();
	}
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException, Exception {
		App app = new App();

	


		int choice = 0;
		@SuppressWarnings("unused")
		int operations=0;

		switch (choice) {
		case 1:

			try {
				app.add();
			} catch (Exception e) {
				e.printStackTrace();
			}
			operations=1;

			break;
		case 2:
			operations=1;
			app.display();
			break;

		case 4:


			app.update();

			break;
		case 5:

			app.delete();

			break;
		default:
			System.out.println("Invalid Choice");
		}
	} 




	private void delete() throws SQLException, Exception, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
		System.out.println("Enter the employee id to delete :");
		try{
			int flight_id = scanner.nextInt();

			boolean flag = imp.deletedetails(flight_id);
			if (flag) {
				System.out.println("Deleted successfully");
			} else {
				System.out.println("No employee found with given number : " + flight_id);
			}
		}
		catch(InputMismatchException e){
			System.out.println(e + " Please enter the valid id");
		}
	}

	private void update() throws  Exception {
		System.out.println("Enter Employees data for update:");
		Flight flight = EmployeeUtil.readPassanger();
		imp.updatedetails(flight);
	}



	private void display() throws SQLException {
		System.out.println("Enter the employee id to view employee info :");
		try{
			int flightid = scanner.nextInt();
			Flight flight = imp.finddetails(flightid);
			System.out.println(flight);
		}
		catch(InputMismatchException e){
			System.out.println(e + " Please enter valid data");
		}
	}

	private void add() throws Exception  {
		Flight flight = EmployeeUtil.readPassanger();
		boolean flag=imp.createdetails(flight);
		if(flag==true){
			System.out.println(" created successfully");
		}

	}
}
