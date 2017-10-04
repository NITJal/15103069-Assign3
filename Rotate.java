import java.util.*;
public class Rotate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter a string:");
		str=sc.nextLine();
		String str1=new String();
	    int len=0;
	    while(len!=str.length())
		{
			str1+=str.substring(1, str.length());
			str1+=str.substring(0,1);
			str=str1;
			str1="";
			System.out.println(str);
			len++;
		}
	}

}
