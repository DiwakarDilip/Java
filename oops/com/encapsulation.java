package oops.com;

//Data is Secure

public class encapsulation {
	String bf;
	private String gf;
	
	public encapsulation(String bf,String gf)
	{
		this.bf=bf;
		this.gf=gf;
	}
	
	public String getgf() {
		return gf;
	}
	
	public void setgf(String gf) {
		this.gf=gf;
	}
	public static void main(String[] args) {
		encapsulation obj=new encapsulation("Dilip","unknown");
		System.out.println(obj.getgf());
		obj.setgf("laila");
		System.out.println(obj.getgf());
	}

}
