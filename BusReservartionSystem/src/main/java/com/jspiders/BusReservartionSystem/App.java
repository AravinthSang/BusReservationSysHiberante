package com.jspiders.BusReservartionSystem;

import java.util.List;
import java.util.Scanner;

import com.jspiders.BusReservartionSystem.dto.Bus;
import com.jspiders.BusReservartionSystem.dto.BusTicket;
import com.jspiders.BusReservartionSystem.dto.Ticket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.transaction.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("development");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	private static EntityTransaction transaction = entityManager.getTransaction();

	public static void bookTicket() {
		Scanner scan=new Scanner(System.in);
		int i=1;
		int busId=0;
		String date;
		BusTicket busTicket;
		Bus bus;
		while(i==1) {
			System.out.println("1.Book a bus Ticket\n 2.Exit");
			i=scan.nextInt();
			if(i==1) {
				System.out.println("Enter the bus Id");
				busId=scan.nextInt();
				System.out.println("Enter the date");
				date=scan.next();
				Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM busreservationsys.busticket\r\n"
						+ "Where BusId="+busId+" AND Date="+date+";", BusTicket.class);
				List resultList = nativeQuery.getResultList();
				Object first = resultList.getFirst();
				if(first!=null) {
					busTicket=(BusTicket) first;
					Ticket ticket=new Ticket();
					ticket.setBusId(busId);
					ticket.setDate(date);
					ticket.setSeat(busTicket.getAvailableSeat()-1);
					transaction.begin();
					entityManager.persist(ticket);
					transaction.commit();
				}
				
				
				
				
				
				
	
			}
		}
		
		
		
	}

	public static void main(String[] args) {

		Bus bus = entityManager.find(Bus.class, 1);
		Ticket ticket = entityManager.find(Ticket.class, 1);
		System.out.println(bus.toString());
		System.out.println(ticket.toString());
	}
}
