package assisment;
import java.util.*;
public class FactorialOfInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enters input: ");
		int n=sc.nextInt();
		int factorial=1;
		System.out.print("factorial of given number: ");
		for(int i=1;i<=n;i++) {
	    factorial = factorial*i;
		}
	  System.out.print(factorial);
	}

}
