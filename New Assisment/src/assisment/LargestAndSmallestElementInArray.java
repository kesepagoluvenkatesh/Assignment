package assisment;
import java.util.*;
public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	      System.out.print ("enter array size:");
	    int n = sc.nextInt ();
	    int a[] = new int[n];
	      System.out.print ("enter array elements:");
	    for (int i = 0; i < a.length; i++)
	      {
	a[i] = sc.nextInt ();
	      }
    	int smallest = a[0];
  	  int largetst = a[0];
	    for(int i = 0; i < a.length; i++)
	    {
	    	  //for (int j= 1; i < a.length; j++) {
	    	   if (a[i] > largetst)
	    	    largetst = a[i];
	    	   else if (a[i] < smallest)
	    	    smallest = a[i];
	    	  }
	    	  System.out.println("Largest Number is : " + largetst);
	    	  System.out.println("Smallest Number is : " + smallest);
	    	 }
	    	}

