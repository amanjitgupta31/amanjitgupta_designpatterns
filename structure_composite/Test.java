package structure_composite;

public class Test {

	public static void main(String[] args)
	{
		Leaf hd=new Leaf(4000,"HDD");
		Leaf mouse=new Leaf(500,"MOUSE");
		Leaf monitor=new Leaf(8000,"MONITOR");
		Leaf ram=new Leaf(3000,"RAM");
		Leaf cpu=new Leaf(9000,"CPU");
		
		Composite ph=new Composite("PERIPHERAL");
		Composite cabinet=new Composite("CABINET");
		Composite mb=new Composite("MOTHERBOARD");
		Composite computer=new Composite("COMPUTER");
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}

}
