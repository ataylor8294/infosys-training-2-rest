package com.infosys;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.*;
import org.springframework.context.support.StaticApplicationContext;

import com.infosys.service.FlightServiceImpl;


@SpringBootApplication
public class Main{
	
	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FlightServiceImpl flightService = (FlightServiceImpl)context.getBean(FlightServiceImpl.class);
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Welcome to flight system hub: Please enter one of the menu options below");
			System.out.println("1: Add a flight\t2: Search Flight\t3: Quit");
			choice = sc.nextInt();
			if (choice==1) {
				System.out.println("What is the source");
				String source = sc.next();
				System.out.println("What is the airline");
				String airline = sc.next();
				System.out.println("What is the destination");
				String destination = sc.next();
				System.out.println("What is the fare");
				Double fare = sc.nextDouble();
				System.out.println("What is the Date");
				System.out.println("What is the year?");
				int year = sc.nextInt();
				System.out.println("What is the month?");
				int month = sc.nextInt();
				System.out.println("What is the day");
				int day  = sc.nextInt();
				Date date3;
				System.out.println("What is the seatCount");
				int seatCount = sc.nextInt();

				try {
				date3 = new Date(year, month, day);
				}
				catch( Exception e) {
					System.out.println("invalid date");
					continue;
				}
				flightService.addFlight(airline, source, destination, fare, date3, seatCount);
				//try {
				//Date date = sc.next();
				//}

			}
			else if (choice==2) {
				System.out.println("Do you want to search by source, destination, or date");
				System.out.println("1:source , 2:destination, 3:date");
				int choice2 = sc.nextInt();
				if (choice2==1) {
					System.out.println("What is the source?");
					String source = sc.next();
					 flightService.searchFlightBySource(source);
				}
				else if (choice2==2) {
					System.out.println("What is the destination?");
					String destination = sc.next();
					flightService.searchFlightByDestination(destination);
				}
				else if (choice2==3) {
					System.out.println("What is the journey date?");
					System.out.println("What is the year?");
					int year = sc.nextInt();
					System.out.println("What is the month?");
					int month = sc.nextInt();
					System.out.println("What is the day");
					int day  = sc.nextInt();
					Date date3;
					try {
						date3 = new Date(year, month, day);
					}
					catch (Exception e) {
						System.out.println("invalid date");
						continue;
					}
					flightService.searchFlightByDate(date3);

				}
			}
			else if (choice==3) {
				
			}
			else {
				System.out.println("incorrect choice: please pick again");
			}
			
		}while (choice!=3);
		 
		*/
	}
}