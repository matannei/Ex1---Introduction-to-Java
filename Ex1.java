package Ex1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int num1, num2;
		if (args.length > 0) {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		} 
		
		else {

			Scanner scanner = new Scanner(System.in);
			//int num1, num2,t=1;
			System.out.println("Enter the first number for max prime GCD: ");
			num1 = scanner.nextInt();
			System.out.println("Enter the second number for max prime GCD: ");
			num2 = scanner.nextInt();

			scanner.close();

		}


		int t = 1;
		if (num2 < num1) {
			int i = num2;

			while (i > 1) {

				if (num1 % i == 0 && num2 % i == 0) {
					t = i;
					boolean prime = true;
					int j = 2;
					while (j <= Math.sqrt(t)) {
						if (t % j == 0) {
							prime = false;
						}
						j = j + 1;

					}
					if (prime) {
						System.out.println("Computes the GPCD("+num1+","+num2+") =");
						System.out.println("Max Prime Common Divider: " + i);
						return;
					}
				}

				i = i - 1;

			}}

		else {
			int i = num1;

			while (i > 1) {

				if (num1 % i == 0 && num2 % i == 0) {
					t = i;
					boolean prime = true;
					int j = 2;
					while (j <= Math.sqrt(t)) {
						if (t % j == 0) {
							prime = false;
						}
						j = j + 1;

					}
					if (prime) {
						System.out.println("Computes the GPCD("+num1+","+num2+") =");
						System.out.println("Max Prime Common Divider: " + i);

						return;
					}
				}

				i = i - 1;

			}

		}
		System.out.println("Computes the GPCD("+num1+","+num2+") =");
		System.out.println("Max Prime Common Divider: " + t);

	}
}


