package history;

import java.util.Scanner;

public class Standard3 {

	public Standard3() {

	}
//test
	public static void main(String[] args) {
		boolean continueCode = true;
		Scanner scanner = new Scanner(System.in);

		while (continueCode) {
			System.out.print("Enter the number for the topic you would like to learn about?"
					+ "\n [1] Compare the experience of European immigrants in the east to that of Asian immigrants in the west "
					+ "\n [2] Examine the importance of social change and reform in the late 19th and early 20th centuries"
					+ "\n [3] Examine the labor movement in the late 19th and early 20th centuries"
					+ "\n [4] Analyze the impact of political machines in United States cities in the late 19th and early 20th centuries"
					+ "\n [5] Compare how different nongovernmental organizations and progressives worked"
					+ "\n [6] Exit Program\n");
			String input = scanner.nextLine();
			if ( input.equals("1")){
				System.out.print("Compare the experience of European immigrants in the east to that of Asian immigrants in the west\n"
						+ "Immigration to the west coast mainly consisted of Chinese immigrants. Chinese immigrants worked on the railroad "
						+ "\nand moved somewhat throughout the west. Immigration in the east mainly consisted of southern and eastern European "
						+ "\nimmigrants. They would arrive at Ellis Island and rarely move about the east.\n\n");
				
			}else if ( input.equals("2")){
				System.out.print("2");
			}else if ( input.equals("3")){
				System.out.print("3");
			}else if ( input.equals("4")){
				System.out.print("4");
			}else if ( input.equals("5")){
				System.out.print("5");
			}else if ( input.equals("6")){
				System.out.print("6");
				continueCode = false;
			}



		}

	}

}

