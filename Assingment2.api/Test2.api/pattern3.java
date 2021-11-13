package Project4;

public class pattern3 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=2*i-1;j<=8;j++)
			{
				System.out.print(" ");
			}
			{
				for(k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}

}
