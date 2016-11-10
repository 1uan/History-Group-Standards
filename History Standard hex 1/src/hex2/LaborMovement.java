package hex2;

import java.util.Scanner;

public class LaborMovement {
	public static void laborMove(Scanner scanner){
		boolean continueVar = true;
		while (continueVar){
			System.out.print("Enter the number for the topic you would like to learn about:"
					+ "\n [1] The labor movement in the late 19th and early 20th centuries"
					+ "\n [2] Learn about the causes of the Labor Movement"
					+ "\n [3] Learn about Organizations and Bills created during the Labor Movement"
					+ "\n [4] Learn about the results of the Labor Movement"
					+ "\n [0] Exit Program\n");
		
			String input = scanner.nextLine();
			int inputNumb = Integer.parseInt(input);
	
			switch (inputNumb) {
			case 1:
				//Overall
				System.out.print("Industrialization necessitated the creation of an entirely new type of economic system, capitalism, "
						+ "and in the process totally transformed social, cultural, and economic life. The IWW set out on a mission"
						+ " to organize the unskilled industrial workers, attempting to give one voice to the plethora of ethnic groups"
						+ " working together in factories, as well as organizing strikes to gain better working conditions, shorter hours,"
						+ " and better wages for their members. The AFL fought for better working conditions and better pay for its "
						+ "members. The movement cut costs dramatically for businesses and therefore increased their profit.");
				break;
			case 2:
				//Causes
				System.out.println("The movement stared because companies began cutting wages, bringing in new machinery to replace workers,"
						+ " and generally dehumanizing workers, placing them in harmful situations without proper compensation.");
	
				break;
			case 3:
				//Orgs & Bills/Acts
				int x = 0;
				String[] Orgs = {"The Knights of Labor\n", "The American Federation of Labor (AFL)\n", "The National Labor Relations Board (NLRB)\n"};
				String[] Acts = {"The Sherman Antitrust Act of 1890\n", "The Clayton Antitrust Act of 1914\n", "The Adamson Act of 1916\n", "The National Industrial Recovery Act of 1933\n", "The Wagner Act (1935)\n", "The Fair Labor Standards Act (1938)\n\n"};
				System.out.print("\nStrikes began in 1892 with Steel workers in Pennsylvania. The movement gave rise the following organizations:\n");
				while (x < Orgs.length){
					System.out.print("[" + String.valueOf(x) + "] " + Orgs[x]);
					x++;
				}
				System.out.print("\nThe Movement also helped get the following Bills Passed:\n");
				x = 0;
				while (x < Acts.length){
					System.out.print("[" + String.valueOf(x) + "] " + Acts[x]);
					x++;
				}
				break;
			case 0:
				continueVar = false;
				System.out.println("Labor Movements");
				break;
			default: 
				break;
			}
		}
		
	}
	private void organizations(Scanner scanner) {
		
	}
}
