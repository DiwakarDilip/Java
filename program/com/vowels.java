package program.com;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HELLO WORLD";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			System.out.println(ch+" ");
			}
			
		}
		System.out.print(count);
	}

}
