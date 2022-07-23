package assisment;
import java.util.*;
public class RevereofString {

	public static void main(String[] args) {				
		Scanner sc=new Scanner(System.in);
				System.out.print("Enter input: ");
				String value=sc.nextLine();
				System.out.print("Rev of number: ");
				for(int i=value.length()-1;i>=0;i--)
				{
					System.out.print(value.charAt(i));
				}
			}

		}
