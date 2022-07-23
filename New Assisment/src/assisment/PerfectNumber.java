package assisment;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		{
			int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is Perfect number");
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect number");
	        }    
	    }
	}
}
	    

