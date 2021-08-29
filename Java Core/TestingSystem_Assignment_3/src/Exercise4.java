import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// question1();
		 //question3();
		question6();
	}
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Mời bạn nhập vào một chuỗi:");
		input = scanner.nextLine();
				
		input = input.trim();
		
		String[] words = input.split("\\s+");
		
		System.out.println("Số lượng từ trong chuỗi:"+ words.length);
		
	}
	
	public static String question3(String input) {
		Scanner scanner = new Scanner(System.in);
		String fullName;
		
		System.out.println("Mời bạn nhập vào 1 chuỗi:");
		input = scanner.nextLine();
		
		input= input.trim();
		Character firstLetter = input.charAt(0);
		if (Character.isUpperCase(firstLetter)== false) {
			firstLetter = Character.toUpperCase(firstLetter);
		}
		
	//	String output = firstLetter.toString() + input.substring(1);
		String output = firstLetter.toString().concat(input.substring(1)); // dùng hàm concat
		
		System.out.println("Output:"+ output);
		 return output;
		
	}
	
	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		String fullName;

		System.out.println("Mời bạn nhập vào họ tên đầy đủ:");
		fullName = scanner.nextLine();

		// Buoc 1: Chuan hoa xau (xoa khoang trang o dau va o cuoi chuoi)
		fullName = fullName.trim();

		// Buoc 2: Tách chuỗi thành mảng các từ
		// \\s+: đại diện cho 1 hoặc nhiều khoảng trắng
		String[] words = fullName.split("\\s+");

		String ho = words[0];
		ho = question3(ho);

		String ten = words[words.length - 1];
		ten = question3(ten);

		String tenDem = "";

		for (int i = 1; i <= words.length - 2; i++) {
			words[i] = question3(words[i]);
		}

		for (int i = 1; i <= words.length - 2; i++) {
			tenDem = tenDem + words[i];
			// tenDem += words[i];
		}

		tenDem = question3(tenDem);

		System.out.println("Họ là: " + ho);
		System.out.println("Tên đệm là: " + tenDem);
		System.out.println("Tên là: " + ten);
	}

}
