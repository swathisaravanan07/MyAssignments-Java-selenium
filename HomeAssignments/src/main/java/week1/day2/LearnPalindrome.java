package week1.day2;

public class LearnPalindrome {

	public static void main(String[] args) {
		int number=141;
		int reversedNumber=0;
		int temp = number;
	
		
		while(temp>0) 
		{
			int reminder =temp%10;
			
			reversedNumber= reversedNumber*10+reminder;
			temp=temp/10;
		}
		
		if(number==reversedNumber) {System.out.println("Given number is a palindrome");}
		else {System.out.println("Given number is not palindrome");}

	}

}
