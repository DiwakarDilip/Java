package program.com;

public class revNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=341;
		int rev, res=0;
		while(num!=0)
		{
			rev=num%10;
			res=(res*10)+rev;
			num/=10;
			
		}
		System.out.println(res);
	}

}
