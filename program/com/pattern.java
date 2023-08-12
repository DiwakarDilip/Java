package program.com;

public class pattern {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)		  //*
		{							  //**
			System.out.print("*");	  //***
		}							  //****
		System.out.println();		  //*****
	}
//**********************************************	

	for(int i=1;i<=5;i++)			//	1
	{								//	22
		for(int j=1;j<=i;j++)		//	333
		{							//	4444
			System.out.print(i);	//	55555
		}
		System.out.println();
	}
//**************************************************	
	
	for(int x=1;x<=5;x++) 
	{								//	1
		int num=1;					//	12
		for(int y=1;y<=x;y++)		//	123
		{							//	1234
			System.out.print(num);	//	12345
			num++;
		}
		System.out.println();
	}
}
}
//*****************************************************
