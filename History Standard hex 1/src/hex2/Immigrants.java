package hex2;

import java.util.Scanner;

public class Immigrants {
	public static void comparison(Scanner scanner){
		boolean continueVar = true;
		while (continueVar){
			System.out.print("Enter the number for the topic you would like to learn about:"
					+ "\n [1] The experience of European immigrants compared to that of Asian immigrants"
					+ "\n [2] Learn about the Chinese Exclusion Act"
					+ "\n [3] Learn about the Gentleman's Agreement with Japan"
					+ "\n [0] Exit Program\n");
		
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
	
			switch (inputNumb) {
			case 1:
				//Overall
				System.out.print("Compare the experience of European immigrants in the east to that of Asian immigrants in the west\n"
						+ "Immigration to the west coast mainly consisted of Chinese immigrants. Chinese immigrants worked on the railroad "
						+ "\nand moved somewhat throughout the west. Immigration in the east mainly consisted of southern and eastern European "
						+ "\nimmigrants. They would arrive at Ellis Island and rarely move about the east.\n\n");
				break;
			case 2:
				//Chinese Exclusion Act
				System.out.println("The Chinese Exclusion Act was a law passed by Congress in 1882 that denied U.S. citizenship to people"
						+ "\n born in China and banned immigration from China for 10 years. This act marked the only time in U.S. history"
						+ "\n that a specific nationality was banned from immigrating to the country. For many years, the Chinese"
						+ "\n Exclusion Act limited the Chinese population in the United States. The act also shaped native citizens'"
						+ "\n attitudes about the Chinese.");
	
				break;
			case 3:
				//Gentleman's Agreement with Japan
				System.out.print("The Gentlemen's Agreement was an agreement between the U.S. government and Japan that limited the "
						+ "\n number of Japanese unskilled workers immigrating to the United States in 1907 and prompted the United States"
						+ "\n to end anti-Japanese laws and segregation. For many years, the Gentlemen's Agreement limited the Japanese population"
						+ "\n in the United States.");
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