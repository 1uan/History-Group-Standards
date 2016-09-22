import java.util.Scanner;

public class main {
	public static void main (String[] args){
		boolean continueCode = true;
		Scanner scanner = new Scanner(System.in);
		
		while (continueCode) {

			System.out.print("\nWould you like to learn about the Civil War or Reconstruction? : ");
			String input = scanner.nextLine().toLowerCase();
			if ( input.equals("civil war") ){ 
				System.out.print("Would you like to learn about the causes, course, or consequences? : ");
				String civilSelect = scanner.nextLine().toLowerCase();
				switch (civilSelect) {
			    case "causes": System.out.println("The cause of the Civil War was slavery.");
			      break;
			    case "course": System.out.println("The Civil War started in April 1861 when the Confederacy"
			    		+ " attacked the US Fort Sumter and ended on April 9, 1865 when the Confederate army surrendered.");
			      break;
			    case "consequences": System.out.println("The war ravaged many towns in the north and south and over 700,000 Americans "
			    		+ "lost their lives. That is the greatest number of American casualties in any war up to current day.");
			      break;
			    default: System.out.println("I'm sorry, I didn't understand that");
			      break;
				}

			}else if ( input.equals("reconstruction") ){
				String reconSelect = scanner.nextLine();
				switch (reconSelect) {
			    case "causes": System.out.println("Due to the destruction from the Civil War the country needed time to fix towns as well as relations"
							+ " between the divided country..");
			      break;
			    case "course": System.out.println("Reconstruction lasted for almost 12 years after the Civil War as the C repaired broken"
							+ " infrastructure and society.");
			      break;
			    case "consequences": System.out.println("Society rebuilt itself in many different ways. The constitution was amended to include the rights of"
							+ " African-Americans and other equality movements followed like suffrage.");
			      break;
			    default: System.out.println("I'm sorry, I didn't understand that");
			      break;
				}
			}else if( input.equals("end") ) {continueCode=false;}
		}
		scanner.close();
	}
}

