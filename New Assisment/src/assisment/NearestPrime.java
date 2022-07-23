package assisment;
import java.util.*;
public class NearestPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int count=0;
		System.out.println("Prime numbers");
		for(int i=1;i<n;i++)
		{
			int j;
			for(j=1;j<=n;j++)
			{
				if(i%j==0)
					count++;	 
			}
			if(count==2)
			{
				i++;
				int temp=i;
			}
			int temp = 0;
			if(temp==i)
			{
				System.out.print("nearest prime"+temp);
			}else
				i--;
			if(temp==i)
			{
				System.out.print("nearest prime"+temp);
			}
			
		}	
	}

}
