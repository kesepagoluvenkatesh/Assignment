package assisment;
public class StaticMethod {
	static String write(int ID)
	{
		System.out.println("Student Id:"+ID);
		System.out.print("Student Name: ");
		return "venky";
	}
	public static void main(String[]args){
		System.out.println(write(1));
	}
}
