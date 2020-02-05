import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lūdzu ievadi savu vārdu: ");
		String name = sc.nextLine();
		
		System.out.print("Lūdzu ievadi savu vecumu: ");
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns!");
	}

}
