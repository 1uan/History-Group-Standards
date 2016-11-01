package hex2;
import java.util.Scanner;
import hex2.Immigrants;

public class Standard3 {

	public static void main(String[] args) {
		boolean continueCode = true;
		Scanner scanner = new Scanner(System.in);

		while (continueCode) {
			System.out.print("Enter the number for the topic you would like to learn about:"
					+ "\n [1] Compare the experience of European immigrants in the east to that of Asian immigrants in the west "
					+ "\n [2] Examine the importance of social change and reform in the late 19th and early 20th centuries"
					+ "\n [3] Examine the labor movement in the late 19th and early 20th centuries"
					+ "\n [4] Analyze the impact of political machines in United States cities in the late 19th and early 20th centuries"
					+ "\n [5] Compare how different nongovernmental organizations and progressives worked"
					+ "\n [0] Exit Program\n");
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
			/**
				System.out.print("Compare the experience of European immigrants in the east to that of Asian immigrants in the west\n"
						+ "Immigration to the west coast mainly consisted of Chinese immigrants. Chinese immigrants worked on the railroad "
						+ "\nand moved somewhat throughout the west. Immigration in the east mainly consisted of southern and eastern European "
						+ "\nimmigrants. They would arrive at Ellis Island and rarely move about the east.\n\n");
			**/
			continueCode = false;
			switch (inputNumb) {
			case 1: 
				Immigrants.comparison(scanner);
				break;
			case 2:
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			case 0:
				break;
			default: 
			System.out.println("Exit");
			}
		scanner.close();
		}
	}

}


