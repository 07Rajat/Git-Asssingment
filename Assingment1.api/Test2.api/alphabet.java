package Atmpin;
import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		char r='a';
		char a=sc.next().charAt(0);
		if(r>=97 && r<=122) System.out.println("Character is in Lower case");
		else if(r>=68 && r<=90) System.out.println("Character is in Upper case");
	}

}
