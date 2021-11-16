package XYZhospital;

import java.io.*;
import java.util.Scanner;
class patientOutputStream extends ObjectOutputStream {
	public patientOutputStream(OutputStream out) throws IOException {
		super(out);
	
	}
	@Override
	protected void writeStreamHeader () {
		
	}

}
public class Hospital {
			//static int count=0;
	public static void main(String[] args) throws IOException {
			patient p =new patient();
			Doctor d= new Doctor();
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a or b");
			System.out.println("a. Patient");
			System.out.println("b. Doctor");
			String s = sc.next();
			char mode = s.charAt(0);
			switch (mode) {
			case 'a':
			System.out.println("1.Add new Patient");
			System.out.println("2.Display all patient");

			int choice11 = sc.nextInt();
			switch (choice11) {
			case 1: //Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter Patient Details");
				p.getdata();	
			try {
			int count=0;
			//p.getdata();
			File fi1 = new File("patient.txt");
			FileOutputStream  fs1 = new FileOutputStream("patient.txt",true);
			if(fi1.length()<=-1) {
			ObjectOutputStream oo1 = new ObjectOutputStream(fs1);
			oo1.writeObject(p);
			}
			else {
			patientOutputStream os1 = new patientOutputStream(fs1);
			os1.writeObject(p);
			}
			System.out.println("Patient details is correct");
		
			FileInputStream fis = new FileInputStream("patient.txt");
			ObjectInputStream op1 = new ObjectInputStream(fis);
			do {
			p = (patient)op1.readObject();
			p.display();
			count++;
			p.countdata(count);
			}while(p!=null);
			
			}catch(Exception e2) {
			System.out.println("Record had written sucessfully");
			}
				//int count = 0;
				
			break;
			case 2: 
			try {
				FileInputStream fi = new FileInputStream("patient.txt");
				ObjectInputStream ob = new ObjectInputStream(fi);
			do {
				p = (patient)ob.readObject();
				p.display();
			//	count++;
				}while(ob!=null);
			
			} catch(Exception e) {}
					
			break;
			default: System.out.println("Enter correct number");
			}
			break;
			case 'b': 	
			System.out.println("1.Display doctor");
			System.out.println("2.Add doctor");
			int choice2=sc.nextInt();
			switch(choice2) {
			case 2: System.out.println("Enter Doctor Details");
			System.out.println("Enter dname");
			String name1=sc.next();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter regno");
			int regno = sc.nextInt();
			System.out.println("Enter speclization");
			String speclization = sc.next();
			//System.out.println(name1+" "+address+" "+regno+" "+speclization);
			try {
			d.show();
			int count1=0;
			File fi = new File("doctor.txt");
			FileOutputStream  fs = new FileOutputStream("doctor.txt",true);
			if(fi.length()<=0) {
			ObjectOutputStream oo = new ObjectOutputStream(fs);
			oo.writeObject(d);
			}
			else {
			DoctorOutputStream os = new DoctorOutputStream(fs);
			os.writeObject(d);
			}
			System.out.println("Doctor details is correct");
			
			FileInputStream fis = new FileInputStream("doctor.txt");
			ObjectInputStream op = new ObjectInputStream(fis);
			
			do {
			
			d = (Doctor)op.readObject();
			count1++;
			d.countdata1(count1);
			}while(fi!=null);
			op.close();
			}catch(Exception e2) {
			System.out.println("Record had written sucessfully");
			}
			
			break;
			case 1: d.getDname();
			d.setDname("Rajat");
		
			d.getAddress();
			d.setAddress("Noida");
		
			d.getspeclization();
			d.setspeclization("MBBS,MD");
		
			d.getRegno();
			d.setRegno(123);
			d.show();
	
			break;
			default: System.out.println("Enter correct number");
			}
			break;
			default: System.out.println("Enter valid choice");
			}
			}
			}
