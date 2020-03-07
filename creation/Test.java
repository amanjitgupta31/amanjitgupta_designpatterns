package creation;

public class Test 
{
	public static void main(String args[])
	{
		
		
		
		FactoryAndBuilder obj1=new FactoryAndBuilder();
		
		OS obj=obj1.setMake("microsoft").getObject("Windows");
		System.out.println(obj);;
		obj=obj1.setSeries("galaxy").getObject("Android");
		System.out.println(obj);
	}

}
