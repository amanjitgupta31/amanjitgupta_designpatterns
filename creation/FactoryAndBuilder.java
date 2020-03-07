package creation;

public class FactoryAndBuilder 
{
	private String make;
	private String series;
	
	
	
	public FactoryAndBuilder setMake(String make) {
		this.make = make;
		return this;
	}



	public FactoryAndBuilder setSeries(String series) {
		this.series = series;
		return this;
	}



	public OS getObject(String str)
	{
		if(str.contentEquals("Android"))
			return new Android(make,series);
		else if(str.contentEquals("Windows"))
			return new Windows(make,series);
		else
			return new IOS(make,series);
	}


}
