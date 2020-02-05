import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Lūdzu ievadi veselu skaitli: ");
		int A = sc.nextInt();
		
		System.out.print("Lūdzu ievadi decimālskaitli: ");
		float B = sc.nextFloat();
		
		sc.close();
		
		System.out.println("Skaitļu " + A + " un " + B + " summa: " + (A + B));
		System.out.println("Skaitļu " + A + " un " + B + " starpība: " + (A - B));
		System.out.println("Skaitļu " + A + " un " + B + " dalījums: " + (A / B));
		System.out.println("Skaitļu " + A + " un " + B + " reizinājums: " + (A * B));
		System.out.println("Skaitļu " + A + " un " + B + " summas kvadrāts: " + ((A + B)*(A + B)));
	}

}
