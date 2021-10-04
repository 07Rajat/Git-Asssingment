package Atmpin;
import java.util.Scanner;
public class atmpin {

	public static void main(String[] args) {
		int password;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		for(i=0;i<=3;i++)
				{ 
					System.out.println("Enter Password");
					password=sc.nextInt();
					if (password==1234)
					{
					 	System.out.println("Allow Access");
                        break;
					}
				
				}
                   if(i==4) System.out.println("Card Block");
	}

}
