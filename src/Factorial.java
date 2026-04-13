import java.util.*;

public class Factorial{

	public static long factorial(int n){
		
		int fact=1;
		if(n<=1)
			return 1;
		else
			return n * factorial(n-1);

	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n= sc.nextInt();	

		long fact = factorial(n);

		System.out.println(fact);

		sc.close();

	}
}