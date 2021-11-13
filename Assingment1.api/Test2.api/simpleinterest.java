package Atmpin;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		System.out.println("Enter Rate");
		System.out.println("Enter Time");
		System.out.println("Simple interest is");
		float  principle,rate,time,simpleinterest;
		principle=sc.nextFloat();
		rate=sc.nextFloat();
		time=sc.nextFloat();
		simpleinterest=(principle*rate*time)/100;
		System.out.println(simpleinterest);

	}

}
