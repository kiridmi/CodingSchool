import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lūdzu ievadi savu vārdu: ");
		String name = sc.next();
		
		System.out.print("Lūdzu ievadi pirmo veselu skaitli : ");
		int a = sc.nextInt();
		
		System.out.print("Lūdzu ievadi otru veselu skaitli : ");
		int b = sc.nextInt();
		
		sc.close();

		if (a < b) {
			System.out.println("Skaitlis " + b + " ir lielāks par skaitli " + a);
		}
		else if (a > b) {
			System.out.println("Skaitlis " + a + " ir lielāks par skaitli " + b);
		}
		else if (a == b) {
			System.out.println("Skaitļi " + a + " un " + b + " ir vienādi");
		}
		
		int summa = a + b;
		if (name.length() > summa) {
			System.out.println("Skaitļu " + a + " un " + b + " summa ir " + summa + " kas ir mazāk nekā burtu Tavā vārdā!");
		}
		else if (name.length() < summa) {
			System.out.println("Skaitļu " + a + " un " + b + " summa ir " + summa + " kas ir vairāk nekā burtu Tavā vārdā!");
		}
		else if (name.length() == summa) {
			System.out.println("Skaitļu " + a + " un " + b + " summa ir " + summa + " kas ir tikpat cik burtu Tavā vārdā!");
		}
	}

}
