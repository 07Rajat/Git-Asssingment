package XYZhospital;

import java.io.*;
import java.util.Scanner;

public class patient implements Serializable{
	 String pname;
	 int pid;
	 int mobilenum;
	 void getdata() {
		// Hospital h = new Hospital();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter pname");
		 String pname = sc.next();
		 System.out.println("Enter pid");
		 int pid = sc.nextInt();
		 System.out.println("Enter mobilenum");
		 int mobilenum = sc.nextInt(); 
		 //System.out.println(pname+" "+pid+" "+mobilenum);
		// h.count++;
	 }
	public void countdata(int y) {
		 System.out.println("Total record is "+y);
	 }

	public void display() {
		 System.out.println("pname = "+pname);
		 System.out.println("pid = "+pid);
		 System.out.println("Mobilenum = "+mobilenum);
		 
	 }
	
}
