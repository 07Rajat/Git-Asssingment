package Atmpin;
import java.util.Scanner;
public class vovelorconsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char r='p';
		char p=sc.next().charAt(0);
		if(r=='a' || r=='e' || r=='i' || r=='o' || r=='u') System.out.println("Alphabet is Vovels");
		else System.out.println("Alphabet is Consonant");

	}

}
