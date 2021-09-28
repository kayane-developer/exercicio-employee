package aplication;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Employee data= new Employee();
		
		System.out.println("Enter the data of the employee");
		System.out.print("Name: ");
		data.name= sc.nextLine();
		System.out.print("Gross Salary: ");
		data.grossSalary= sc.nextDouble();
		System.out.print("Tax: ");
		data.tax= sc.nextDouble();
		
		System.out.println("Employee: " + data);
		
		System.out.printf("Which percentage to increase salary? ");
		double percentage= sc.nextDouble();
		data.increaseSalary(percentage);
		
		System.out.println("Uptaded data: " + data);
		
		sc.close();
	}

}
