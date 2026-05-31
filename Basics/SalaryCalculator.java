import java.util.Scanner;

public class SalaryCalculator{
public static void main(String[] args){
//give CONSTANTS
final double OVERTIME_RATE = 1.5;
final double TAX_DEDUCTION = 0.20;

//create a scanner object 
Scanner scanner = new Scanner(System.in);

//prompt the user for hourlyWage
System.out.print("Enter your hourly wage : ");
double hourlyWage = scanner.nextDouble();

// Prompt the user for regular hours worked
 System.out.print("Enter hours worked in a week: ");
 double regularHours = scanner.nextDouble();

 // Prompt the user for overtime hours worked
 System.out.print("Enter overtime hours worked: ");
 double overtimeHours = scanner.nextDouble();

 // Calculate gross pay
 double regularPay = hourlyWage * regularHours;
 double overtimePay = overtimeHours * hourlyWage * OVERTIME_RATE;
double grossPay = regularPay + overtimePay;

 // Calculate tax deduction
 double taxDeduction = grossPay * TAX_DEDUCTION;

 // Calculate net pay
 double netPay = grossPay - taxDeduction;

 // Display the results
 System.out.println("\n--- Salary Breakdown ---");
 System.out.printf("Hourly Wage: $%.2f\n", hourlyWage);
 System.out.printf("Regular Hours Worked: %.2f\n", regularHours);
 System.out.printf("Overtime Hours Worked: %.2f\n", overtimeHours);
 System.out.printf("Regular Pay: $%.2f\n", regularPay);
 System.out.printf("Overtime Pay: $%.2f\n", overtimePay);
System.out.printf("Gross Pay: $%.2f\n", grossPay);
 System.out.printf("Tax Deduction (20%%): $%.2f\n", taxDeduction);
 System.out.printf("Net Pay: $%.2f\n", netPay);

 // Close the scanner
 scanner.close();
 }
}