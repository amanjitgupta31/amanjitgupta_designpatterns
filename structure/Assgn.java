package structure;

public class Assgn 
{
	private Pen p;
	
	public Pen getP() 
	{
		return p;
	}

	public void setP(Pen p) 
	{
		this.p = p;
	}

	public void writeAssgn(String str)
	{
		p.write(str);
	}

}
