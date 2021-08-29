import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		System.out.println("Chào mừng bạn đến với chương trình");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Kết thúc chương trình");
	}
}
