package java;

import java.util.Scanner;

public class UAP {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     
	     UapCSE emp=new UapCSE();
	     int n=0;
	     do {
	    	 
	    	
	    	 System.out.println("Enter 1 :Add a new Employee");
	    	 System.out.println("Enter 2 :Get Salary info of a specific Employee ");
	    	 System.out.println("Enter 3 :Increase the salary of an Employee");
	    	 System.out.println("Enter 4 :Display the list of the Employees");
	    	 System.out.println("Enter 0 :exist");
	    	 
	    	 System.out.println("enter your choice :");
	    	 n=scan.nextInt();
	    	 
	    	 switch(n)
	    	 {
	    	   case 1:
	    	   {
	    		   int choice=0;
	    		   do {
	    			   System.out.println();
	    			   System.out.println("Enter 1:Salaried");
	    			   System.out.println("Enter 2:Hourly");
	    			   System.out.println("Enter 3:Commission");
	    			   System.out.println("Enter 0:Exist");
	    			   
	    			   System.out.println("Enter choice :");
	    			   choice=scan.nextInt();
	    			   
	    			   if(choice==1)
	    			   {
	    				   scan.nextLine();
	    				   System.out.println("To add a Salaried employee,Give name, id, designation, monthly salary");
	    				   String name = scan.nextLine();
	    				   String i = scan.nextLine();
	    				   String d = scan.nextLine();
	    				   double ms= scan.nextDouble();
	    				   emp.addNewEmployee(name, i, d, ms);
	    				   
	    			   }
	    			   
	    			   else if(choice==2)
	    			   {
	    				   scan.nextLine();
	    				   System.out.println("To add a hourly employee,Give name, id, designation, hourlyRate,hourworked");
	    				   String name = scan.nextLine();
	    				   String i = scan.nextLine();
	    				   String d = scan.nextLine();
	    				   double hr= scan.nextDouble();
	    				   int hw = scan.nextInt();
	    				   emp.addNewEmployee(name, i, d, hr, hw);
	    				   
	    			   }
	    			   else if(choice==3)
	    			   {
	    				   scan.nextLine();
	    				   System.out.println("To add a commission employee,Give name, id, designation, commission, sale");
	    				   String name = scan.nextLine();
	    				   String i = scan.nextLine();
	    				   String d = scan.nextLine();
	    				   double c= scan.nextDouble();
	    				   double s= scan.nextDouble();
	    				   
	    				   emp.addNewEmployee(name, i, d, c, s);
	    			   }
	    			   
	    			  
	    			   
	    		   }while(choice!=0);
	    		   
	    		   break;   
	    		   
	    		   
	    	   }
	    	   case 2:{
	    		     System.out.println("Enter id to get employees Salary :");
	            	 String id=scan.next();
	            	 System.out.println(emp.getSalary(id));
	    		     break;
	    	   }
	    	 
	    	   case 3:{
	    		   System.out.println("Enter emloyees id and incresing Amount :");
	               String ID=scan.next();
	               double amnt=scan.nextDouble();
	               emp.increaseSalary(ID, amnt);
	    		   
	               break; 
	    	   }
	    	   
	    	   case 4:{
	    		   emp.display();
	    		   break;
	    	   }
	    	   
	    	   default :{
	    		   System.out.println("Try again");
	    	   }
	    	 }
	    	 
	    	 
	    	 
	     }while(n!=0);
	     

	}

}
