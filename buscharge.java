package hello;

import java.util.Scanner;

public class buscharge {

	public static void main(String[] args) {
	

	char ch;
	System.out.println("Enter Male or Female");
	Scanner r=new Scanner(System.in);
	ch=r.next().charAt(0);
	
	if(ch=='F')
	{
		System.out.println("The Gov Banglore bus is free");
	}
	
	else if(ch=='M')
	{
		System.out.println("The Gov Banglore bus has charge on Age limit");
		
		int age;
		System.out.println("Please Enter your Age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>=0 && age<=2) 
		{
			System.out.println("Bus charges free for kids");
		}
		
		else if(age>=3 && age<=12)
		{
			System.out.println("You are eligible for Half Ticket");
		}
		
		else if(age>=13 && age<=60)
		{
			System.out.println("You are eligible for Full Ticket");
		}
		
		else if(age>=61 && age<=80)
		{
			System.out.println("You are eligible for 60% of Ticket charge");
		}
		
		else if(age>=81)
		{
			System.out.println("Age should be less thatn 80 to Travel in Gov Bus");
		}
		
		else if(age<=0)
		{
			System.out.println("Invalid Entry");
		}
		
	}
	else
	{
		System.out.println("Invalid Entry");
	}
		
	}
	
}