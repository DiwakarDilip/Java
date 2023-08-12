package program.com;

public class pattern1 {

	public static void main(String[] args) {		
		for(int i=1;i<=5;i++) 
		{
			int num=1;						//		12345
			for(int j=i;j<=5;j++) 			//		1234
			{								//		123
				System.out.print(num);		//		12		
				num++;						//		1
			}	
			System.out.println();	
		}
//**********************************************
		for(int a=1;a<=5;a++)
		{									//		11111
			for(int b=a;b<=5;b++) {			//		2222
				System.out.print(a);		//		333
			}								//		44
			System.out.println();			//		5
		}
		
//***********************************************
		for(int x=1;x<=5;x++)
		{									//		*****
			for(int y=x;y<=5;y++)			//		****
			{								//		***
				System.out.print("*");		//		**
			}								//		*
			System.out.println();
		}
}
}