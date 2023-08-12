package program.com;

public class reverse {
public static void main(String[] args) {
	
	String name="hi hello world";
	String rev="";
	int count=0;
	for(int i=name.length();i>0;i--) {
		rev+=name.charAt(i-1);
		count++;
	}
	System.out.println(rev);
	System.out.println(count);
	

}
}