package oops.com;

public class encapsulation2 {
	String bank;
	String branch;
	private long accNo; //readable access
	private double bal; //both modifiable and readable access
	
	public encapsulation2(String bank,String branch,long accNo,double bal)
	{
		this.bank=bank;
		this.branch=branch;
		this.accNo=accNo;
		this.bal=bal;
	}
	
	public long getaccNo() 			//readable access
	{
	return accNo;	
	}
	public void setbal(double bal)  //both modifiable 
	{
		this.bal=bal;
	}
	public double getbal()          //readable access
	{
		return bal;
	}
	public void details() {
		System.out.println(bank +" is located in "+branch+" and ur accNo "+accNo+" total balance is "+bal);
	}

	public static void main(String[] args) {
		encapsulation2 obj=new encapsulation2("Indian","Salem",7845994566l,50000.638);
		encapsulation2 obj1=new encapsulation2("SBI","chennai",123456789l,20000);
		obj.details();
		obj1.details();
		System.out.println();
		System.out.println("after setting new values");
		System.out.println();
		obj.setbal(2000);
		obj1.setbal(10000);
		obj.details();
		obj1.details();
		
	}

}
