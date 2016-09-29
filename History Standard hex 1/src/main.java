import java.util.Scanner;
import history.inventors.*;
public class main {
	public static void main (String[] args){
		boolean continueCode = true;
		Scanner scanner = new Scanner(System.in);

		while (continueCode) {

			System.out.print("\nWould you like to learn about the Civil War, Republicans during Reconstruction,\n Amendments made after the Civil War, Jim Crow laws, Black Codes,\n Inventors, or Reconstruction? : ");
			String input = scanner.nextLine().toLowerCase();
			if ( input.equals("civil war") ){ 
				System.out.print("Would you like to learn about the causes, course, or consequences? : ");
				String civilSelect = scanner.nextLine().toLowerCase();
				switch (civilSelect) {
				case "causes": System.out.println("The cause of the Civil War was slavery.");
				break;
				case "course": System.out.println("The Civil War started in April 1861 when the Confederacy"
						+ " attacked the US Fort\n Sumter and ended on April 9, 1865 when the Confederate army surrendered.");
				break;
				case "consequences": System.out.println("The war ravaged many towns in the north and south and over 700,000 Americans \n"
						+ "lost their lives. That is the greatest number of American casualties in any war\n up to present day.");
				break;
				default: System.out.println("I'm sorry, I didn't understand that");
				break;
				}

			}else if ( input.equals("reconstruction") ){
				System.out.print("\nWould you like to learn about the causes, course, or consequences? : ");
				String reconSelect = scanner.nextLine();
				switch (reconSelect) {
				case "causes": System.out.println("Due to the destruction from the Civil War the country needed time to fix towns as\n well as relations"
						+ " between the divided country.");
				break;
				case "course": System.out.println("Reconstruction lasted for almost 12 years after the Civil War as the Country\n repaired broken"
						+ " infrastructure and society.");
				break;
				case "consequences": System.out.println("Society rebuilt itself in many different ways. The constitution was amended to\n include the rights of"
						+ " African-Americans and other equality movements followed\n like suffrage.");
				break;
				default: System.out.println("I'm sorry, I didn't understand that");
				break;
				}
			}else if ( input.equals("amendments made after the civil war") ){
				System.out.print("Would you like to learn about the 13th, 14th, or 15th amednment? : ");
				String amendSelect = scanner.nextLine();
				switch (amendSelect) {
				case "13th": System.out.println("The thirteenth amendment changed The Constitution to completely abolish slavery\n and involuntary servitude (except as a crime sentence), and effectively ended\n slavery in America.");

				break;
				case "14th": System.out.println("The 14th amendment granted citizenship to everyone born or naturalized in the US,\n which granted freedom to former slaves that were freed.");
				break;
				case "15th": System.out.println("The 15th amendment bans federal and state governments from denying a person’s\n right to vote because of their race, color, or previous condition of servitude.");
				break;
				default: System.out.println("I'm sorry, I didn't understand that");
				break;
				}
			}else if ( input.equals("jim crow laws") ){
				System.out.print("\nJim Crow Laws limited rights of blacks. For example, literacy tests,\n grandfather clauses, and poll taxes limited black voting rights.\n");
			}else if ( input.equals("black codes") ){
				System.out.print("\nThe Black Codes would limit blacks' ability to control their own employment.\n This meant that they could not be owned and forced to do anything they did not want to.\n");
			}else if ( input.equals("republicans during reconstruction") ){
				System.out.print("The Radical Republicans strongly opposed slavery during the war and after\n the war distrusted ex-Confederates, demanding harsh policies for Reconstruction.\n");
			}else if ( input.equals("inventors") ){
				history;




			}else if( input.equals("end") ) {continueCode=false;}
		}
		scanner.close();
	}
}

