package collection_lab2;
import java.util.*;
public class Book {
	String name;
	int price;
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Book b = new Book("java",100);
		Book b1 = new Book("php",200);
		Book b2 = new Book("C++",300);
		Book b3 = new Book("python",400);
		Book b4 = new Book("apache",500);
		Book b5 = new Book("Kali",600);
		ArrayList <Book> ab = new ArrayList <Book> ();
		ab.add(b);
		ab.add(b1);
		ab.add(b2);
		ab.add(b3);
		ab.add(b4);
		ab.add(b5);
		Iterator <Book> l = ab.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}

}
