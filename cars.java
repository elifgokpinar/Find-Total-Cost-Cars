//Elif Gökpınar - Grade 1
import java.util.Scanner ;
public class cars{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner Object
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Welcome to Marmara Cars" + "\n-----------------------" + 
		"\nCompact (C)" + "\nLuxury (L)" + "\nMidsize (M) " + "\nPickup (P)" + "\nSUV (S)" +
		"\nWhat model car do you want? (C, L , M, P, S): ");
		String userChoice = input.nextLine();
		char ch = userChoice.charAt(0);
		
		//Enter a value about information
		double compact =16000;
		double luxury =39000;
		double midsize=26000;
		double pickup =19500;
		double SUV =29000;
		double otv = 35;
		double otv1= 40;
		double kdv = 18;
		double protectiveUndercoating1 = 125;
		double protectiveUndercoating2 = 150;
		double protectiveUndercoating3 = 200;
		double automaticTransmission1 =2000;
		double automaticTransmission2=2500;
		double sunRoof1= 1500;
		double sunRoof2=2300;
		double multimediaPackage1=750;
		double multimediaPackage2=1000;
		double multimediaPackage3=1250;
		double securityPackage1 = 800;
		double securityPackage2=1000;
		double securityPackage3=1350;
		double d2= 5;
		double sportPackage1 = (midsize * d2/100);
		double sportPackage2 = (SUV * (d2/100));
		double salesTax1 = (((compact + protectiveUndercoating1 + securityPackage1)*(1 + otv/100))
		* (kdv/100))+((compact+ protectiveUndercoating1 + securityPackage1)* otv/100);
		double salesTax2=(((compact + protectiveUndercoating1)*(1 + otv/100))
		* (kdv/100))+((compact+protectiveUndercoating1) * otv/100);
		double salesTax3=(((compact + securityPackage1)*(1 + otv/100))
		* (kdv/100))+((compact+securityPackage1) * otv/100);
		double salesTax4=(((compact)*(1 + otv/100))
		* (kdv/100))+(compact * otv/100);
		double total1= salesTax1 + compact + protectiveUndercoating1 + securityPackage1 ;
		double total2= salesTax2 + compact + protectiveUndercoating1 ;
		double total3= salesTax3 + compact + securityPackage1;
		double total4= salesTax4 + compact ;
		double d1 = 5 ;
		double discount1 = (protectiveUndercoating1 + multimediaPackage3)*(1 - d1/100);
		double salesTax5 = (((luxury + discount1 )*(1 + otv1/100))
		*(kdv/100))+ ((luxury + discount1)* (otv1/100));
		double salesTax6 = ((luxury + protectiveUndercoating1)*(1 + otv1/100))
		+ ((luxury + protectiveUndercoating1 )* (otv1/100));
		double salesTax7=(((luxury + multimediaPackage3)*(1 + otv1/100))
		*(kdv/100))+ ((luxury + multimediaPackage3)* (otv1/100));
		double salesTax8=(((luxury )*(1 + otv1/100))
		*(kdv/100))+ ((luxury)* (otv1/100));
		double total5= (salesTax5 + luxury + discount1) ;
		double total6= (salesTax6 + luxury +protectiveUndercoating1);
		double total7= (salesTax7 + luxury +multimediaPackage3);
		double total8= (salesTax8 + luxury);
		double cost= 0;
		double cost1 = 0;
		double cost2= 0;
		 
		switch(Character.toUpperCase(ch)) {
		
		//Compute options for Compact Car
		case 'C' : 
		//Prompt the user enter options
		System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
		String answer1 = input.nextLine();
		System.out.print("Do you want the security package for $800.0 (Y/N)? ");
		String answer2=input.nextLine();
		
		//When user selects two packages
		if(answer1.equalsIgnoreCase("y") &&  answer2.equalsIgnoreCase("y"))
		System.out.println("\nYou ordered a Compact car with a base price of " + "$" + compact
		+ "\nYour additional cost is " + "$" +(protectiveUndercoating1+securityPackage1)+
		"\nSales Tax: "+ "$" + salesTax1 + "\nTotal cost of car & options: "+ "$" +
		total1+("\nProgram ends..."));
		
		//When user selects protective undercoating package 
		else if (answer1.equalsIgnoreCase("y") &&  answer2.equalsIgnoreCase("n"))
		System.out.println("\nYou ordered a Compact car with a base price of " + "$" + compact
		+ "\nYour additional cost is " + "$" +protectiveUndercoating1+
		"\nSales Tax: "+ "$" + salesTax2 + "\nTotal cost of car & options: "+ "$" +
		total2 + "\nProgram ends...");
		
		//When user selects security package 
		else if (answer1.equalsIgnoreCase("n") &&  answer2.equalsIgnoreCase("y"))
		System.out.println("\nYou ordered a Compact car with a base price of " 
		+ "$" + compact+ "\nYour additional cost is " + "$" +securityPackage1+
		"\nSales Tax: "+ "$" + salesTax3 + "\nTotal cost of car & options: "+ "$" +
		total3 + "\nProgram ends...");
		
		//When user selects nothing
		else if (answer1.equalsIgnoreCase("n") &&  answer2.equalsIgnoreCase("n"))
		System.out.println("\nYou ordered a Compact car with a base price of " + "$" + compact
		+ "\nYour additional cost is " + "$0.0" +"\nSales Tax: "+ "$" + 
		salesTax4 + "\nTotal cost of car & options: "+ "$" +
		total4 + "\nProgram ends...");
		break;
		
		//Compute options for Luxury car
		case 'L':
		//Prompt the user enter options
		System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
		String answer3=input.nextLine();
		System.out.print("Do you want the multimedia package for $1250.0 (Y/N)? ");
		String answer4=input.nextLine();
		//When user selects two packages
		if(answer3.equalsIgnoreCase("y") &&  answer4.equalsIgnoreCase("y" ))
		System.out.println("\nYou ordered a Luxury car with a base price of " + "$" + luxury
		+ "\nYour additional cost is " + discount1 +"\nSales Tax: "+ "$" + 
		salesTax5 + "\nTotal cost of car & options: "+ "$" +
		total5  + "\nProgram ends...");
		
		//When user selects protective undercoating package
		else if (answer3.equalsIgnoreCase("y") &&  answer4.equalsIgnoreCase("n"))
		System.out.println("\nYou ordered a Luxury car with a base price of " + "$" + luxury
		+ "\nYour additional cost is " + protectiveUndercoating1 +"\nSales Tax: "+ "$" + 
		salesTax6 + "\nTotal cost of car & options: "+ "$" +
		total6  + "\nProgram ends...");
		
		//When user selects multimedia package
		else if (answer3.equalsIgnoreCase("n") &&  answer4.equalsIgnoreCase("y"))
	    System.out.println("\nYou ordered a Luxury car with a base price of " + "$" + luxury
	    + "\nYour additional cost is " +  multimediaPackage3 +"\nSales Tax: "+ "$" + 
		salesTax7 + "\nTotal cost of car & options: "+ "$" +
		total7 + "\nProgram ends...");
		
		//When user selects nothing
		else if (answer3.equalsIgnoreCase("n") &&  answer4.equalsIgnoreCase("n"))
		System.out.println("\nYou ordered a Luxury car with a base price of " + "$" + luxury
		 + "\nYour additional cost is " + "$0.0" +"\nSales Tax: "+ "$" + 
		salesTax8 + "\nTotal cost of car & options: "+ "$" +
		total8 + "\nProgram ends...");
		break;
		
		//Compute options for Midsize car
		case 'M' :
		//Prompt the user enter options	
		System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
		String answer5=input.nextLine();
	    if (answer5.equalsIgnoreCase("y")) {
			
			cost += protectiveUndercoating1;
		}
	    System.out.print("Do you like to replace the normal transmission by an automatic "
	    + "transmission for $2000.0 (Y/N)? ");	
	    String answer6=input.nextLine();
	    
	    if(answer6.equalsIgnoreCase("y")){
	    	
	    	cost +=automaticTransmission1;
	     }
	    System.out.print("Do you want sunroof for $1500.0 (Y/N)? ");	
	    String answer7=input.nextLine();	
	    if (answer7.equalsIgnoreCase("y"))	{
	    	
	    	cost += sunRoof1 ;
	    
	    }
	    System.out.print("Do you want the multimedia package for $750.0 (Y/N)? ");
	    String answer8=input.nextLine();
	    if(answer8.equalsIgnoreCase("y")) {
	    	
	    	cost += multimediaPackage1;
	    }
	    System.out.print("Do you want the security package for $1000.0 (Y/N)? ");
	    String answer9=input.nextLine();
	    if(answer9.equalsIgnoreCase("y")) {
	    	
	    	cost += securityPackage2;
	    }
	    System.out.print("Do you want the sports package "
	    + "for an increased 5.0% This will increase your cost by $1300.0 (Y/N)? ");
	    String answer10=input.nextLine();
	    if(answer10.equalsIgnoreCase("y")) {
	    	
	    	cost += sportPackage1 ;
	    }
	    //Enter variables
	    double salesTax9 = (((cost + midsize - 250)*(1+ otv/100))*(kdv/100)) 
	    + ((cost+midsize-250)* (otv/100));
	    double salesTax10 = (((cost + midsize )*(1+ otv/100))*(kdv/100)) 
	    + ((cost+midsize)* (otv/100));
	    double discount10= 10 ;
	    double discountmid =( cost * (1 - discount10/100 ));
	    double salesTax11=(((discountmid+ midsize )*(1+ otv/100))*(kdv/100)) 
	    + ((discountmid+midsize)* (otv/100));
	    double discountmid1 = (cost - 250)*(1-discount10/100);
	    double salesTax12=(((discountmid1+ midsize )*(1+ otv/100))*(kdv/100)) 
	     + ((discountmid1+midsize)* (otv/100));
	    
	    //When user selects sunroof and multimedia packages without automatic transmission and security packages together
	    if(answer7.equalsIgnoreCase("y") && answer8.equalsIgnoreCase("y") && 
	    (!(answer6.equalsIgnoreCase("y") && answer9.equalsIgnoreCase("y")))) 
	    System.out.println("\nYou ordered a Midsize car with a base price of " + "$" + midsize
	    + "\nYour additional cost is " +"$" +(cost-250) + "\nSales Tax: " + "$" + 
	    salesTax9 + "\nTotal cost of car & options: "+ "$" +
	   (salesTax9+midsize+cost-250) + "\nProgram ends...");
	    
	    //When user selects automatic transmission and security packages without sunroof and multimedia packages together
	    else if (answer6.equalsIgnoreCase("y") &&  answer9.equalsIgnoreCase("y") 
	    && !(answer7.equalsIgnoreCase("y") && answer8.equalsIgnoreCase("y")))
	    System.out.println("\nYou ordered a Midsize car with a base price of " + "$" + midsize
	     + "\nYour additional cost is " + "$" + discountmid + "\nSales Tax: " + "$" + 
	     salesTax11 + "\nTotal cost of car & options: "+ "$" +
	    (salesTax11 + midsize + discountmid) + "\nProgram ends...");
	    
	   //When user selects automatic transmission,security,sunroof,multimedia packages together
	    else if(answer6.equalsIgnoreCase("y") && answer7.equalsIgnoreCase("y")
	    && answer8.equalsIgnoreCase("y") &&  answer9.equalsIgnoreCase("y"))
	    System.out.println("\nYou ordered a Midsize car with a base price of " + "$" + midsize
	     + "\nYour additional cost is " + "$" + discountmid1 + "\nSales Tax: " + "$" + 
	     salesTax12 + "\nTotal cost of car & options: "+ "$" +
	    (salesTax12 + midsize + discountmid1) + "\nProgram ends...");	
	    
	    else if (answer5.equalsIgnoreCase("y") || answer5.equalsIgnoreCase("n")
	    || answer6.equalsIgnoreCase("y") || answer6.equalsIgnoreCase("n")
	    || answer7.equalsIgnoreCase("y") || answer7.equalsIgnoreCase("n")
	    || answer8.equalsIgnoreCase("y") || answer8.equalsIgnoreCase("n")
	    || answer9.equalsIgnoreCase("y") || answer9.equalsIgnoreCase("n")
	    || answer10.equalsIgnoreCase("y") || answer10.equalsIgnoreCase("n"))
	   
	    //Display result
	    System.out.println("\nYou ordered a Midsize car with a base price of " + "$" + midsize
	   	+ "\nYour additional cost is " + cost +"\nSales Tax: "+ "$" + 
	   	salesTax10 + "\nTotal cost of car & options: "+ "$" +
	   	(salesTax10+midsize+cost) + "\nProgram ends...");
	   	break;
	    
		
	   	//Compute options for Pickup car
		case 'P' :
		//Prompt the user enter options
		System.out.print("Do you want protective undercoating for $150.0 (Y/N)? ");
		String answer11 = input.nextLine();
		if (answer11.equalsIgnoreCase("y")) {
			
			cost1 += protectiveUndercoating2 ;
		}
	   	
	    System.out.print("Do you want the multimedia package for $750.0 (Y/N)? ");
	    String answer12 =input.nextLine();
	    if(answer12.equalsIgnoreCase("y")) {
	    	cost1 += multimediaPackage1;
	    }
	    
	    double salesTax13 =(((cost1 + pickup )*(1+ otv/100))*(kdv/100)) 
	    + ((cost1+pickup)* (otv/100));
	   
	    //Display result
	    System.out.print("\nYou ordered a Pickup car with a base price of " + "$" + pickup
	    + "\nYour additional cost is " + "$"+cost1 + "\nSales Tax: " + "$" + 
	    salesTax13 + "\nTotal cost of car & options: "+ "$" +
	   (salesTax13 + pickup +cost1) + "\nProgram ends...");
	    break ;
	    
	    //Compute options for SUV car
		case 'S' :
		//Prompt the user enter options
			System.out.print("Do you want protective undercoating for $200.0 (Y/N)? ");
			String answer13 =input.nextLine();
			if(answer13.equalsIgnoreCase("y")) {
				
				cost2 += protectiveUndercoating3 ;
			}
			
			System.out.print("Do you like to replace the normal transmission by an automatic transmission " + 
			"for $2500.0 (Y/N)? ");
			String answer14 = input.nextLine();
			if(answer14.equalsIgnoreCase("y")) {
				
				cost2 +=automaticTransmission2;
			}
			System.out.print("Do you want sunroof for $2300.0 (Y/N)? ");	
			String answer15=input.nextLine();
			if(answer15.equalsIgnoreCase("y")) {
				
				cost2 +=sunRoof2;
			}
			System.out.print("Do you want the multimedia package for $1000.0 (Y/N)? ");	
			String answer16=input.nextLine();
			if(answer16.equalsIgnoreCase("y")) {
				
				cost2 +=multimediaPackage2;
			}
	   
			System.out.print("Do you want the security package for $1350.0 (Y/N)? ");	
			String answer17=input.nextLine();
			if(answer17.equalsIgnoreCase("y")) {
	    	
				cost2  +=securityPackage3;
				
			}
			
			System.out.print("Do you want the sports package for an increased 5.0% This will increase your " + 
			"cost by $1450.0 (Y/N)? ");
			String answer18=input.nextLine();
			if(answer18.equalsIgnoreCase("y")) {
				 
				cost2 += sportPackage2 ;
			}
		   //Enter variables
		   double total10=cost2 + SUV ;
		   double salesTax14=(((cost2 + SUV )*(1+ otv/100))*(kdv/100)) 
					    + ((cost2+SUV)* (otv/100));
		   double salesTax15=(((cost2 + SUV )*(1+ otv1/100))*(kdv/100)) 
				    + ((cost2+SUV)* (otv1/100));
				   
				   
			if(total10 <= 35000) {//when total money of additional packages and base price of car is lower than 35000
			System.out.println("\nYou ordered an SUV with a base price of " + "$" + SUV
			+ "\nYour additional cost is " +"$" +cost2 + "\nSales Tax: " + "$" + 
			salesTax14 + "\nTotal cost of car & options: "+ "$" +
		   (salesTax14 + SUV +cost2) + "\nProgram ends...");
				
			}
			if (total10 >= 35000) {//when total money of additional packages and base price of car is greater than 35000
				if(answer14.equalsIgnoreCase("y") && answer15.equalsIgnoreCase("y")
			    &&answer16.equalsIgnoreCase("y") && answer17.equalsIgnoreCase("y")) {
				System.out.println("You won protective undercoating for free!" + "\n  " +
			    "\nYou ordered an SUV with a base price of " + "$" + SUV
				+ "\nYour additional cost is " + "$" + cost2 + "\nSales Tax: " + "$" + 
				salesTax15 + "\nTotal cost of car & options: "+ "$" +
				(salesTax15 + SUV +cost2) + "\nProgram ends...");	}
				
				else if (answer13.equalsIgnoreCase("y") || answer13.equalsIgnoreCase("n")
				|| answer14.equalsIgnoreCase("y")|| answer14.equalsIgnoreCase("n")
				|| answer15.equalsIgnoreCase("y")|| answer15.equalsIgnoreCase("n")
				|| answer16.equalsIgnoreCase("y")|| answer16.equalsIgnoreCase("n")
				|| answer17.equalsIgnoreCase("y")|| answer17.equalsIgnoreCase("n")
				|| answer18.equalsIgnoreCase("y")|| answer18.equalsIgnoreCase("n"))
			
			//Display result
		    System.out.println("\nYoau ordered an SUV with a base price of " + "$" + SUV
			+ "\nYour additional cost is " + "$" + cost2 + "\nSales Tax: " + "$" + 
		    salesTax15 + "\nTotal cost of car & options: "+ "$" +
		    (salesTax15 + SUV +cost2) + "\nProgram ends...");
				break;
				}
		}
	}
}
