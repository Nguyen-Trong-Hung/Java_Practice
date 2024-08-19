package HelloWorld;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		
		System.out.println("Nhập điểm: ");
		int score = scanner.nextInt();
		
		System.out.println(name + " có điểm là " + score);
		scanner.close();
	}
}
