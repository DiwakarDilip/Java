package inheritance.com;

public class inheritance {

	String model;
	int ram;
	double price;
		
	public static void main(String[] args) 
	{
		samsung s= new samsung("ultra",8,100000);
		redmi r=new redmi("k20",4,2200);
		r.details();
		s.details();
	}
	public void details()
	{
		System.out.println(model+" "+price+" "+ram);
	}
}