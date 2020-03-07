package creation;

public class IOS implements OS
{
	private String make;
	private String series;
	
	
	public IOS(String make, String series) 
	{
		super();
		this.make = make;
		this.series = series;
	}


	@Override
	public String toString() {
		return "IOS [make=" + make + ", series=" + series + "]";
	}
	
	

}
