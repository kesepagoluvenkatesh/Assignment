package assisment;
import java.util.*;
public class FibanocciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enters input: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print("Fibanocci series: ");
		for(int i=1;i<=n;i++) {
			int c=a+b;
		System.out.print(a+" ");
		a=b;
		b=c;
		}
		
	}

}
