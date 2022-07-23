package assisment;
import java.util.*;
public class Secondlargest {

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
	    int max = a[0];
	    for (int i = 0; i < a.length; i++)
	      {
	if (max < a[i])
	 {
	   max = a[i];
	 }
	      }
	    System.out.println ("max element:"+max);
	    int max2 = a[0];
	    for (int j = 0; j < a.length; j++)
	      {
	if (a[j] > max2 && a[j]!=max)
	 {
	   max2 = a[j];
	 }
	      }
	    System.out.println("second largest element:"+max2);
	}

}
