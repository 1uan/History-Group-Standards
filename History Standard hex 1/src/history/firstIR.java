package history;

public class firstIR {

	public static String[] EcoInfo() {
		String Economic_Challenges;
		String info;
		double idInit = Math.random();
		System.out.println(idInit);
		int inventorID = (int) Math.round(idInit);
		System.out.println(inventorID);
		switch (inventorID) {
		case 0: Economic_Challenges = "Economic_Challenges";
		info = "Due to economic challenges American farmers faced agricultural colleges were created and Morrill Land Grant Act helped create these colleges, gold standard and Bimetallism, and the Populist Party was created as a coalition of poor farmers who together had political power.";
		
		switch (inventorID) {
		case 1: Economic_Challenges = "Industrial Revolution";
		info = "The American Industrial Revolution involved development of chemical, electrical, oil, and steel industries. Mass production of consumer goods also developed at this time through the mechanization of the manufacture of food and clothing. It provided widespread employment and increased production and helped the US economy.";

		break;
		default: System.out.println("Error");
		Economic_Challenges = "error";
		info = "error";

		}
		System.out.println(Economic_Challenges);
		System.out.println(info);
		String[] retVal = {Economic_Challenges, info};
		return retVal;
	}
		return null;
}
}
	