package Atmpin;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
	int x,y;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    x=sc.nextInt();
    if(x%4==0 || x%400==0) System.out.println("Leap Year");
    else System.out.println("Not Leap year");1
	}

}
