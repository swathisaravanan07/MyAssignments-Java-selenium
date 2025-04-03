package week1.day2;

public class primeNumberAndPositiveNumber {

	public static void main(String[] args) {
		int number=5;
		boolean isPrime=true;
		primeNumberAndPositiveNumber.positiveNumber(number);
		
		
		 if(number<=1)
	      {
	          isPrime =false;
	      }
		 else
	      {
	        for(int i=2;i<number;i++)
	        {
	            if(number%i==0)
	            {
	                isPrime=false;
	            break;
	            }
	        }
	      }
	        if(isPrime)
	        {System.out.println("Given number "+number+" is a prime number");}
	        else
	        {System.out.println("Given number "+number+" is not a prime number");}
		
		}
	public static void positiveNumber(int number) {
	
		if(number>0) {System.out.println("Given number "+number+" is a positive number");}
		else {System.out.println("Given number "+number+" is not a positive number");}
	}
	}


