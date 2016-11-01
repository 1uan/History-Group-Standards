package hex2;

import java.util.Scanner;

public class Political_Machines {
	public static void comparison(Scanner scanner){
		boolean continueVar = true;
		while (continueVar){
			System.out.print("\nEnter the number for the topic you would like to learn about:"
					+ "\n [1] General Political Machines"
					+ "\n [2] Tammy Hall"
					+ "\n [0] Exit Program\n");
		
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
	
			switch (inputNumb) {
			case 1:
				//General Political Machines
				System.out.print("A Political Machine is a political organization, headed by a single boss or small group,"
						+ " \n that commands enough votes to maintain political and administrative control of a city, county,"
						+ "\n or state. Political machines had a big influence on cities, Political machines did work to help"
						+ "\n immigrants settle in the country and offered some public services. However, the bosses and supporters"
						+ "\n used their position for their own personal gain. Bosses often received bribes and money from the "
						+ "\n government officials they helped elect.\n");
				break;
			case 2:
				//Chinese Exclusion Act
				System.out.println("The most famous political machine was the one that ran New York City. It was called Tammany Hall,"
						+ "\n or just Tammany. Originally a social club, Tammany became associated with the Democratic Party in New York"
						+ "\n early in the 19th century. For several decades it expanded its power by finding jobs and housing for immigrants."
						+ "\n Tammany leaders then helped immigrants attain citizenship so they could vote. It was not unusual for "
						+ "\n them to give the poorest families a few dollars for food and fuel. With the power gained from this neighborhood"
						+ "\n level of involvement, Tammany leaders were able to get elected to office at city and sometimes state governments.\n");
	
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