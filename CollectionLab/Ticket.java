package collection_lab2;
import java.util.*;
class Ticket1 {
	int ID;
	String description;
	int priority;
	
	public Ticket1(int iD, String description, int priority) {
		super();
		ID = iD;
		this.description = description;
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Ticket1 [ID=" + ID + ", description=" + description + ", priority=" + priority + "]";
	}

}
	class ticketcomp implements Comparator <Ticket1> {
		
		public int compare(Integer t1 , Integer t2) {
			int v = t1.compareTo(t2);
			if(v<0) return -1;
			else if(v>0) return 1;
			else return 0;
		}

		@Override
		public int compare(Ticket1 o1, Ticket1 o2) {
			
			return o1.priority - o2.priority;
		}
	}


public class Ticket {

	public static void main(String[] args) {
		ticketcomp tc = new ticketcomp(); 
		PriorityQueue <Ticket1> pq = new PriorityQueue <Ticket1> (tc);
		pq.add(new Ticket1(12345,"Program is start",3));
		pq.add(new Ticket1(67894,"System not available",2));
		pq.add(new Ticket1(11223,"Char not available",4));
		pq.add(new Ticket1(25635,"first is work",1));
		pq.add(new Ticket1(89456,"System virus efftct",5));
		pq.add(new Ticket1(52341,"Electricity probleum",6));
		pq.add(new Ticket1(78965,"Program is restart",3));
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
