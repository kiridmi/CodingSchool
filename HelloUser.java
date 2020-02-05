import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// metode saņem ievadu no lietotāja un pārbauda vai ievade nav tukša.
		// Ja nav - atgriež String
		String input = nameInput("Please enter your name and surname: ", sc);

		sc.close();

		int spaceIndex = input.indexOf(' ');

		if (spaceIndex < 0) {
			String name = input.substring(0, 1).toUpperCase();
			name = name + input.substring(1);
			System.out.println("Name: '" + name + "'");
		} else {
			String name = input.substring(0, 1).toUpperCase();
			name = name + input.substring(1, spaceIndex);
			String surname = input.substring(spaceIndex).trim().toUpperCase();

			System.out.println("Name: '" + name + "'");
			System.out.println("Surname: '" + surname + "'");
		}
	}

	public static String nameInput(String message, Scanner sc) {
		boolean incorrectInput = true;
		String input = "";
		do {
			System.out.print(message);
			input = sc.nextLine();

			if (input.isEmpty()) {
				System.out.println("Entered value cannot be empty!");
			} else {
				incorrectInput = false;
			}

		} while (incorrectInput);

		input = input.trim();

		return input;
	}
}
