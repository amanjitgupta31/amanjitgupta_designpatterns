package creation;

public class Android implements OS
{
	private String make;
	private String series;
	
	
	public Android(String make, String series) 
	{
		super();
		this.make = make;
		this.series = series;
	}


	@Override
	public String toString() {
		return "Android [make=" + make + ", series=" + series + "]";
	}

	
	


	

}
