package MultiThreading;
import java.util.*;
class Ticket
{
	int total_ticket=10;
	synchronized public void MyTicket(int ticket)
	{
		if(total_ticket >= ticket)
		{
			total_ticket= total_ticket-ticket;
			System.out.println(ticket+" tickets are booked by and remaining tickets are " +total_ticket);
		}
		else {
			if(total_ticket>0)
			{
				System.out.println("Sorry..only "+total_ticket+" tickets are available");
			}
			else
			{
				System.out.println("Tickets not available");
				
			}
		}
	}

}
public class Synchronized extends Thread
{
	Scanner sc= new Scanner(System.in);
	static Ticket t1;
	int tickets;
	
	public void run()
	{
		t1.MyTicket(tickets);;
	}
	public static void main(String[] args)
	{
		
		Synchronized s1= new Synchronized();
		Synchronized s2= new Synchronized();
		Synchronized s3= new Synchronized();
		
		t1= new Ticket();
		
		s1.tickets= 6;
		s1.start();

		s2.tickets= 5;
		s2.start();

		s3.tickets= 4;
		s3.start();
	}
}