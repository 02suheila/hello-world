package example;

import java.util.Scanner;

public class revere {

	public static void main(String[] args) {
		//reverse of a tring
		Scanner sc = new Scanner(system.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		string rev = " ";
		for(int i = ch.length-1; i>=0; i--)
		{
			rev = rev +ch[i];
		}
		System.out.print("reversed string=" +rev );
	}

}
