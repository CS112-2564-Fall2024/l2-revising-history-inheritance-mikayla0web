/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String circumstancesofDeath = "Billie Holiday died in Metropolitan Hospital, New York, on Friday, July 17, 1959, in the bed in which she had been arrested for illegal possession of narcotics a little more than a month before, as she lay mortally ill.";
		Date deathDay = new Date(5, 31, 1921);
		HistoricalEvent deathOfHoldiay = new HistoricalEvent(circumstancesofDeath, deathDay);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// System.out.println(deathOfHoldiay);
		deathOfHoldiay.teach();
		
		
		 String circumstancesRevised = "When Holiday relapsed and began using heroin again, she checked into a New York hospital in 1959. This is where she learned her liver was failing and cancerous. She was emaciated, and her heart and lungs were compromised. Despite her condition, she didn't want to stay there. \"They're going to kill me. They're going to kill me in there. Don't let them\", she presciently told friends and family. Indeed, Anslinger's men, sensing a macabre opportunity, showed up at her hospital bedside, handcuffed her to the bed, took mugshots, removed gifts that people had brought to the room — flowers, radio, record player, chocolates, magazines — and stationed two cops at the door. Even so, as doctors began methadone treatment, Holiday began to improve, gaining some weight and improving slowly. But then Anslinger's men prevented hospital staff from administering any further methadone. She succumbed to death within days.";
			String holidayCitation = "https://progressive.org/latest/strange-fruit-caused-the-murder-of-billie-holiday-180220/";
		RevisedEvent deathOfHoliday = new RevisedEvent(circumstancesofDeath, deathDay,
			circumstancesRevised, holidayCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		deathOfHoliday.teach();

		//int[] array = { 4, 5, 6, 7, 8, 9 };
		//Bubble Sort
		// for (int j = 0; j < array.length; j++) {
		// 	for (int i = 0; i < array.length - 1; i++) {
		// 		if (array[i] > array[i + 1]) {
		// 			int temp = array[i];
		// 			array[i] = array[i + 1];
		// 			array[i + 1] = temp;
		// 		}
		// 	}
		// }

	// 	for (int i = 0; i < array.length; i++) {
	// 		System.out.print(array[i] + ", ");
	// 	}
	 }
}