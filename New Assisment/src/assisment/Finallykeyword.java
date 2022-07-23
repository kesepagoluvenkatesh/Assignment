package assisment;

public class Finallykeyword {
	public static void main(String[] args) {
		int num=10;
		try 
		{
			System.out.print(num/0);
		}
		catch (ArithmeticException e)
			{
			System.out.println(e);
		     }
		finally
		{
			System.out.println("finally block executed");
		}

	}

}
