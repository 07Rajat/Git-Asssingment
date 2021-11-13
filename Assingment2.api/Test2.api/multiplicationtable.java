package Project4;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int i;
		i=sc.nextInt();
		for(int j=1;j<=10;j++)
			System.out.print(i*j+" ");
		
	}
         
}
