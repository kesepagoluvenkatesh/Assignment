package assisment;

import java.util.Scanner;

public class SortingWIthoutSplMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the size of array:");
	       int n= sc.nextInt();
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=sc.nextInt();
	       }
	       for(int i=0;i<a.length;i++)
	       {
		       for(int j=i+1;j<a.length;j++)
		       {
		    	   if(a[i]>a[j])
		    	   {
		    		   a[i]=a[i]+a[j]-(a[j]=a[i]); 
		    	   }
		       }
	       }
	       for(int i=0;i<a.length;i++)
		       System.out.print(a[i]+" ");

	       }

	}

