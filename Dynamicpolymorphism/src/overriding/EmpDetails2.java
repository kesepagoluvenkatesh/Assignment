package overriding;

public class EmpDetails2 extends EmpDetails{
	String work(int Id)
	{
		System.out.println(super.work(22));
		System.out.print(Id+" ");
		return "Naveen";
	}

}

