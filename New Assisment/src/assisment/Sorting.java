package assisment;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the size of array:");
	       int n= sc.nextInt();
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=sc.nextInt();
	       }
	       Arrays.sort(a);   
	       for(int i=0;i<a.length;i++)
	       {
		       System.out.println(a[i]);
	       }
	}

}
