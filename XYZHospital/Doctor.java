package XYZhospital;
import java.io.*;
import java.util.Scanner;
public class Doctor implements Serializable {
	String dname;
	String address,speclization;
	int regno;
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getspeclization() {
		return speclization;
	}

	public void setspeclization(String speclization){
	this.speclization = speclization;
	}
	void show() {
		//Hospital h = new Hospital();
		System.out.println("dname = " + dname);
		System.out.println("address = " +address);
		System.out.println("speclization = "+speclization);
		System.out.println("regno = " + regno);
	}
	void countdata1(int x) {
		System.out.println("The total record is "+x);
	}
	public static void main(String[] args) throws Exception {

	}
}
