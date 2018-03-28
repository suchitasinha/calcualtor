package misc;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		str=sc1.nextLine();
		StringTokenizer strTok=new StringTokenizer(str);
		Stack<Object> stack=new Stack<>();
		while(strTok.hasMoreTokens()){
			stack.push(strTok.nextElement());
		}
StringBuffer strRev=new StringBuffer();
while(!stack.isEmpty()){
	strRev.append(stack.pop());
	strRev.append(" ");
}
System.out.println(strRev);
sc1.close();
	}

}
