package structure;

public class School 
{
	public static void main(String args[])
	{
		Pen p=new Adapter();
		Assgn obj=new Assgn();
		obj.setP(p);
		obj.writeAssgn("my assignment");
	}

}
