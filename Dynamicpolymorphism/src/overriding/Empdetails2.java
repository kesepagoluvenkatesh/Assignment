package overriding;

public class Empdetails2 extends Empdetails{
	String method1(int EmpId)
	{
		System.out.print(super.method1(1));
		System.out.println("EmpId:"+EmpId);
		System.out.println("Emp Name");
		return "Ramesh";
	}

}
