package assisment;
public class InstanceMethod {
	 String write(int ID)
	{
		System.out.println("Student Id:"+ID);
		System.out.print("Student Name: ");
		return "naveen";
	}
	public static void main(String[]args){
		InstanceMethod im=new InstanceMethod();
		System.out.println(im.write(2));
	}

// TODO Auto-generated method stub

	}

