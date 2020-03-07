package creation;

public class Windows implements OS
{
	private String make;
	private String series;
	
	
	public Windows(String make, String series) 
	{
		super();
		this.make = make;
		this.series = series;
	}


	@Override
	public String toString() {
		return "Windows [make=" + make + ", series=" + series + "]";
	}
	
	

}
