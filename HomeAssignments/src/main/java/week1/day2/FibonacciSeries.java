package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5
		
		int n=10;
		int first=0;
		int second=1;
		
		System.out.println("Fibonacci serious upto "+n+" terms");
		
		for(int i=0;i<n;i++) 
		{
			int next=first+second;
			System.out.print(first+" ");
			first=second;
			second=next;
		}
		
		}
	}
