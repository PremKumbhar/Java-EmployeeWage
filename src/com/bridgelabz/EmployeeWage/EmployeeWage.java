package com.bridgelabz.EmployeeWage;

public class EmployeeWage 
{
	public static void main(String[] args) {
		{
			 System.out.println("Welcome to employee wage computation");
	
		int isPresent = 1;
		int salary;
		int empRatePerHr=20;
	    int workinghr;
		
	    double randomCheck=Math.floor(Math.random() * 10) % 2;
           if ( isPresent == randomCheck )
           {
		       System.out.println("Employee is present");
		        workinghr = 8;
           }
        else
        {
			 System.out.println("Employee is Absent");
			 workinghr =0;
        }  
           
           salary = empRatePerHr * workinghr ;
           System.out.println("Employee daily wage" + salary);
           
		}
	}
}
