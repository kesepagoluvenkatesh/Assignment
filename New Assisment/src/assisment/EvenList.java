package assisment;
import java.util.*;
public class EvenList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the size of list:");
	       int n= sc.nextInt();
	       List<Integer> arr= new ArrayList<>();
	       System.out.println("Enter array elements:");
	       for(int i=0;i<n;i++){
	           arr.add(sc.nextInt());
	       }
		   System.out.println("even numbers:");
	       for(int i:arr) 
	       {
	    	   if(i%2==0)
	    		   System.out.println(i);
	       }
		   System.out.println("odd numbers:");
	       for(int i:arr) 
	    	   if(i%2!=0)
    		   System.out.println(i);  
	       }
}
