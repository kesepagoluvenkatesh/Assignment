package assisment;
import java.util.*;
public class ReverseOfStringcapitalFirstLetter {
 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String input");
        String s=sc.nextLine();
        String newString="";
        String sArray[]=s.split(" ");
        for(int i=0;i<sArray.length;i++)
        {
            String stringRev = "";
            //System.out.println(sArray[i]);
            for(int j=0;j<sArray[i].length();j++)
            {
                char c;
               if(j==sArray[i].length()-1)
                    {
                        c=Character.toUpperCase(sArray[i].charAt(j));
                    }
               else
                {
                c=sArray[i].charAt(j);
                }
                stringRev=c+stringRev;
                //sArray[i]=stringRev;
            }
            
            newString=newString+stringRev+" ";
        }
        System.out.print(newString);

		
	}
}
		