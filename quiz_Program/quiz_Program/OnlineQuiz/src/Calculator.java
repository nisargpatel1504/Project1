import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		int choice=0;
		System.out.println("1) Sum ");
		System.out.println("2) Subtraction ");
		System.out.println("3) Multiplication ");
		System.out.println("4) Divison ");
		System.out.println("Please select choice [1-4] ");
		
		
		
		Scanner s = new Scanner(System.in);
		choice=s.nextInt();
		 System.out.print("Please input two numbers");
   	  	Scanner n = new Scanner(System.in);
	   float num1 = n.nextFloat();
	   Scanner n1 = new Scanner(System.in);
	   float num2 = n1.nextFloat();
	   

	    switch (choice) {
	      case 1:
	    	  		System.out.println("Addition is : " + (num1+num2));
	        break;

	      case 2:
	    	  System.out.println("Substraction is : " + (num1-num2));
	        break;

	      case 3:
	    	  System.out.println("Multiplication is : " + (num1*num2));
	        break;

	      case 4:
	    	  System.out.println("Division is : " + (num1/num2));
	        break;

	      
	      default:
	        System.out.printf("Please select between [1-4]");
	        return;
	    }

	  }
	
	}



