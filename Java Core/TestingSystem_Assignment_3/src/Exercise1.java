import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Moi ban nhap vao so chia:");
		int soChia = scanner.nextInt();

		System.out.println("Moi ban nhap vao so bi chia:");
		int soBiChia = scanner.nextInt();

		float thuong = divide(soChia, soBiChia);

		System.out.println("Ket qua phep chia: " + thuong);

	}

	public static void q1() {
		float account1;
		float account2;

		account1 = (float) 5240.5;
		account2 = (float) 10970.055;

		short roundaccount1 = (short) account1;
		short roundaccount2 = (short) account2;

		System.out.println(roundaccount1 + roundaccount2);

	}

	// Question 4
	public static float divide(int a, int b) {
		return (float) a / b;
	}

	// Question 2
	public static void randomNumber() {
		Random random = new Random();
		int i = random.nextInt(99999 - 0 + 1) + 0;
		System.out.printf("%05d\n", i);
	}

	// Question 3
	public static void lay2socuoi() {
		Random random = new Random();
		int i = random.nextInt(99999 - 0 +1) + 0;
		String s = Integer.toString(i);
		System.out.println(s.substring(3));
	}

}
