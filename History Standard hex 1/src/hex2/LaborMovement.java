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
				String[] Orgs = {"The Knights of Labor\n", "The American Federation of Labor (AFL)\n", "The National Labor Relations Board (NLRB)\n", "Women's Christian Temperance Union\n", "National Association for the Advancement of Colored People\n", "National Women's Suffrage Association\n"};
				String[] Acts = {"The Sherman Antitrust Act of 1890\n", "The Clayton Antitrust Act of 1914\n", "The Adamson Act of 1916\n", "The National Industrial Recovery Act of 1933\n", "The Wagner Act (1935)\n", "The Fair Labor Standards Act (1938)\n\n"};
				String KoL = "A labor grew that rapidly because of a combination of their open-membership policy, the continuing industrialization of the American economy, and the growth of urban population. They welcomed unskilled and semiskilled workers, including women, immigratns, and African Americans, and believed they could eliminate conflict between labor and managements. Their goal was to create a cooperative society in which laborers owned the industries in which they worked.";
				String AFL = "Led by Samuel Gompers, the federation was an alliance of skilled workers in craft unions. They concentrated on issues such as higher wages, shorter hours, and better working conditions.";
				String NLRB = "An agency created by The Wagner Act which monitored the conduct of the employer or union during an election, prevented or remediated unfair labor practices by employers or unions, and established rules.";
				String WCTU = "The Women's Christian Temperance Union was one of the largest and most powerful temperance organizations in the country who was able to lobby legeslatures and helped pass the 18th ammendment. Gifford Pinchot was the first director of the national forest service which promoted policies to protect land for managed development, and even coined word conservation.";
				String NAACP = "The National Association for the Advancement of Colored People (NAACP), founded in 1909 to work for racial equality, led by W.E.B. Debois, founded in 1909 to abolish segregation and discrimination, to oppose racism and to gain civil rights for African Americans. ";
				String NWSA = "The National Women's Suffrage Association also was founded by Elizabeth Cady Stanton and Susan B. Anthony. It was a group that worked for a constituional amendment to give women the right to vote.";
				String Sherman = "The Sherman Antitrust Act was the first Federal act that outlawed monopolistic business practices and prohibited trusts.";
				String Clayton = "This act did this";
				String Adamson = "This did act this";
				String Industrial = "Did this act this";
				String Wagner = "Act this did this";
				String Fair = "Did this this act";
				String Other = "Robert LaFollette wrestled control out of the hands of corrupt corporations and perfected a way for regulating public utilities. \nIda Tarbell wrote about the oil industry in a paper that ran from November 1902 to October 1904, and was collected and published as The History of the Standard Oil Company in 1904, exposing the big oil company. \nEugene Debs led the American Railway Union, he voted to aid workers in the Pullman strike.";
				String[] orgactInfo = {KoL, AFL, NLRB,WCTU,NAACP,NWSA,Sherman,Clayton,Adamson,Industrial,Wagner,Fair, Other};
				System.out.print("\nA few of the organizations the movement gave rise to include:\n");
				while (x < Orgs.length) {
					System.out.print("[" + String.valueOf(x+1) + "] " + Orgs[x]);
					x++;
				}
				System.out.print("\nThe Movement also helped get the following Bills Passed:\n");
				int m = x;
				while (x < Acts.length + m){
					System.out.print("[" + String.valueOf(x+1) + "] " + Acts[x-m]);
					x++;
				}
				System.out.print("[" + String.valueOf(x+1) + "] Notable People \n");
				
				System.out.print("\n[0] Exit");
				while (inputNumb != 0){
					input = scanner.nextLine();
					inputNumb = Integer.parseInt(input);
					if (inputNumb != 0) {System.out.print(orgactInfo[inputNumb-1]);}
				}
				break;
			case 4:
				System.out.print("Regulations on child labor, higher wages, health benefits for workers such as aid for workers who were injured or retired.");
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
