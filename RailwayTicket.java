package com.edu;

import java.util.Scanner;

public class RailwayTicket {
  String name;
  String coach;
  long mobno;
  int amt;
  int totalamt;
  
    void accept() 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Customer Name: ");
    	name=sc.nextLine();
    	
    	System.out.println("Enter Mobile number: ");
    	mobno=sc.nextLong();
    	
    	System.out.println("Select Coach 'First_AC', 'Second_AC', 'Third_AC' or 'Sleeper': ");
    	coach=sc.next();
    	
    	System.out.println("Enter Amount: ");
    	amt=sc.nextInt();
    }
    
    void update() 
    {
    	if(coach.equals("First_AC")) {
    		totalamt=amt+700;
    	}
    	else if(coach.equals("Second_AC")) {
    		totalamt=amt+500;
    	}
    	else if(coach.equals("Third_AC")) {
    		totalamt=amt+250;
    	}
    	else {
    		totalamt=amt;
    	}
    		
    }
    
    void display() 
    {
    	System.out.println("****CUSTOMER DETAILS****");
    	System.out.println("Customer Name: "+name);
    	System.out.println("Customer Mobile No: "+mobno);
    	System.out.println("Selected Coach: "+coach);
    	System.out.println("Total Amount: "+totalamt);
    }
    
    
	public static void main(String[] args) {
		RailwayTicket rt = new RailwayTicket();
		rt.accept();
		rt.update();
		rt.display();

	}

}
