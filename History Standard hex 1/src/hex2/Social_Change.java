package hex2;

import java.util.Scanner;

public class Social_Change {
	public static void comparison(Scanner scanner){
		boolean continueVar = true;
		while (continueVar){
			System.out.print("Enter the number for the topic you would like to learn about:"
					+ "\n [1] The Class System"
					+ "\n [2] Migration From Farms to Cities"
					+ "\n [3] The Social Gospel Movement"
					+ "\n [4] The Role of Settlement Houses"
					+ "\n [5] Churches Providing Services to the Poor"
					+ "\n [0] Exit Program\n");
		
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
	
			switch (inputNumb) {
			case 1:
				//Class System
				System.out.print("\nPeople moved to the United States in large numbers to work in industries "
						+ "\n New social classes, upper, middle, and lower, developed in cities.\n");
						
				break;
			case 2:
				//Migration From Farms to Cities
				System.out.println("\n Farm production increased as new farm technology developed,"
						+ "\n and fewer farmers were needed to produce enough food for the country's population."
						+ "\n The U.S. economy shifted from an agricultural-based economy to an industrial-based economy\n.");
	
				break;
			case 3:
				//The Social Gospel Movement
				System.out.print("\nThe Social Gospel movement was based on the belief that the gap between the rich"
						+ "\n and the poor was too great in American society. This movement encouraged the wealthy and"
						+ "\n the upper middle class to help less fortunate people. At that time, there were no"
						+ "\n  government programs to help people in poverty.\n");
				break;
			case 4:
				//The Role of Settlement Houses
				System.out.print("The Hull House in Chicago, Illinois, founded by Jane Addams and Ellen Gates Starr"
						+ "\n in 1889, was the best-known settlement house in the United States. Residents of"
						+ "\n Hull House worked for political reform, the creation of schools, and better living"
						+ "\n conditions in the city. As settlement houses matured, they targeted areas for legislative"
						+ "\n reform in local, state, and federal government.\n");
				break;
			case 5:
				//Churches Providing Services to the Poor
				System.out.print("For some reformers helping the urban poor was linked to their Christian beliefs."
						+ "\n Ministers such as Washington Gladden linked service to the poor to heavenly salvation."
						+ "\n Gladden and other reformers who shared his point of view began the Social Gospel movement.\n");
			break;
			case 0:
				continueVar = false;
				System.out.println("Exiting Immigrants");
				break;
			default: 
				break;
			}
		}
	}
}