package hex2;
import java.util.Scanner;
import hex2.Immigrants;

public class Standard3 {

	public static void main(String[] args) {
		boolean continueCode = true;
		Scanner scanner = new Scanner(System.in);

		while (continueCode = true) {
			System.out.print("\nEnter the number for the topic you would like to learn about:"
					+ "\n [1] Compare the experience of European immigrants in the east to that of Asian immigrants in the west "
					+ "\n [2] Examine the importance of social change and reform in the late 19th and early 20th centuries"
					+ "\n [3] Examine the labor movement in the late 19th and early 20th centuries"
					+ "\n [4] Analyze the impact of political machines in United States cities in the late 19th and early 20th centuries"
					+ "\n [5] Compare how different nongovernmental organizations and progressives worked"
					+ "\n [0] Exit Program\n");
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
		
			continueCode = true;
			switch (inputNumb) {
			case 1: 
				Immigrants.comparison(scanner);
				break;
			case 2:
				Social_Change.comparison(scanner);
				break;
			case 3: 
				LaborMovement.laborMove(scanner);
				break;
			case 4: 
				Political_Machines.comparison(scanner);
				break;
			case 5: 
				break;
			case 0:
				boolean continuecode = false;
				break;
			default: 
				System.out.println("Exit");
			}
		}
		scanner.close();
		
	}

}


