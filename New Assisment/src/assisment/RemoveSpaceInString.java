package assisment;

import java.util.Scanner;
public class RemoveSpaceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("enter string: ");
		String str=sc.nextLine();
		str=str.replaceAll(" ", "");
        System.out.println(str);
		 	    }
}
