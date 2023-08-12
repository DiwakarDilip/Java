package program.com;

public class pattern4 {

	public static void main(String[] args) {
	int num=5;	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(" ");
		}
		num--;
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	int num1=5;
	for(int m=1;m<=5;m++)
	{
		for(int n=1;n<=m;n++)
		{
			System.out.print(" ");
		}
		

		for(int o=1;o<=num1;o++)
		{
		 System.out.print("* ");	
		}
		num1--;
		System.out.println();
		
	}
	}
}
					//    * 
					//   * * 
					//  * * * 
					// * * * * 
					//* * * * * 
					//* * * * * 
					// * * * * 
					//  * * *
                    			//   * *
                    			//    *
