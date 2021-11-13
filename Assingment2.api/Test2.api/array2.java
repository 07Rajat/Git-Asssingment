package Project4;
import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		int y[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<y.length;i++)
		{
			System.out.println("Enter number");
			y[i]=sc.nextInt();
		}
		for(int i=0;i<y.length;i++)
       	 System.out.println(y[i]);

	}
               	
}
