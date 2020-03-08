package behavioural_observer;

public class Youtube {

	public static void main(String[] args) 
	{
		Channel amanjit=new Channel();
		
		Subscriber s1 =new Subscriber("Rohan");
		Subscriber s2 =new Subscriber("Mohan");
		Subscriber s3 =new Subscriber("Sohan");
		Subscriber s4 =new Subscriber("Raman");
		
		amanjit.subscriber(s1);
		amanjit.subscriber(s2);
		amanjit.subscriber(s3);
		amanjit.subscriber(s4);
		
		s1.subscribeChannel(amanjit);
		s4.subscribeChannel(amanjit);
		s3.subscribeChannel(amanjit);
		s2.subscribeChannel(amanjit);
		
		amanjit.upload("My First Video.");
	}

}
