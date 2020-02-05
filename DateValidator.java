import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean incorrectInput = true;
		int dayInput = 0;
		int monthInput = 0;
		int yearInput = 0;

		do {
			dayInput = userInput("Please enter day number: ", sc);
			if (dayInput > 31) {
				System.out.println("Invalid date! Try again.");
				continue;
			}
			
			monthInput = userInput("Please enter month number: ", sc);
			if (monthInput > 12) {
				System.out.println("Invalid month! Try again.");
				continue;
			}
			
			if (dayInput > 30 && monthInput == 4 || dayInput > 30 && monthInput == 6 || dayInput > 30 && monthInput == 9 || dayInput > 30 && monthInput == 11) {
				System.out.println("Invalid date! Try again.");
				continue;
			} 

			yearInput = userInput("Please enter year: ", sc);
			
			if (dayInput > 28 && monthInput == 2 && (yearInput % 4) != 0) {
				System.out.println("Invalid date! Try again.");
			} else {
				incorrectInput = false;
			}

		} while (incorrectInput);
		sc.close();

		DateOutput(dayInput, monthInput);

	}

	public static int userInput(String message, Scanner sc) {
		boolean incorrectInput = true;
		int input = 0;

		do {
			System.out.print(message);
			input = sc.nextInt();

			if (input < 1) {
				System.out.println("Value must be above 0!");
			} else {
				incorrectInput = false;
			}

		} while (incorrectInput);

		return input;
	}

	public static void DateOutput(int day, int month) {

		String[] monthArray = { "", "Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Aprīlis", "Maijs", "Jūnijs",
				"Jūlijs", "Augusts", "Septembris", "Oktobris", "Novembris", "Decembris" };
		System.out.println(day + ". " + monthArray[month]);

	}
}
