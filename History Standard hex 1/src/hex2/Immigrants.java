package hex2;

import java.util.Scanner;

public class Immigrants {
	public void comparison(Scanner scanner){
		boolean continueVar = true;
		while (continueVar){
			System.out.print("Enter the number for the topic you would like to learn about:"
					+ "\n [1] The experience of European immigrants compared to that of Asian immigrants"
					+ "\n [2] Learn about the Chinese Exclusion Act"
					+ "\n [3] Learn about the Gentleman's Agreement with Japan"
					+ "\n [0] Exit Program\n");
		}
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
				break;
			case 3:
				//Gentleman's Agreement with Japan
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
