package history;

public class inventors {

	public static String[] inventorInfo() {
		String inventor;
		String info;
		int inventorID = (int)((100 * Math.random())/25);

		switch (inventorID) {
		case 0: inventor = "Samuel F. B. Morse";
		info = "Samuel F. B. Morse was the inventor of Morse Code and the Telegraph, which allowed for communication across long distances"
				+ "and laid the groundwork for fax, telephones, and the internet";
		break;
		case 1: inventor = "George Washington Carver";
		info = "George Washington Carver was an African American inventor who found over 300 uses for the peanut and over 100 uses "
				+ "for the sweet potato. He also created methods to create synthetic marble from sawdust, and"
				+ " plastics from woodshavings,";
		break;
		case 2: inventor = "Ada Lovelace";
		info = "Ada Lovelace is considered the first programmer. She is the person who, in 1843, and came up with the concept for"
				+ " using numbers to represent data in all forms, not just quantity and calculations, which is the basis for computers today."
				+ " She wrote a complementory set of notes titled 'Notes', that is considered the first true computer program (an algorithm "
				+ "that is meant to be preformed by a machine.) ";
		break;
		case 3: inventor = "Eli Whitney";
		info = "Eli Whitney is famous for creating the cotton gin, which was supposed to lower the number of slaves used on plantations"
				+ " but actually ended up making in more sustainable, and people started getting more slaves to support the growing business."
				+ " Eli also designed and popularized the use of Interchangable Musket parts, which allowed for mass production and upkeep"
				+ " for muskets. ";
		break;
		default: System.out.println("Error");
		inventor = "error";
		info = "error";

		}
		System.out.println(inventor);
		System.out.println(info);
		String[] retVal = {inventor, info};
		return retVal;
	}
}