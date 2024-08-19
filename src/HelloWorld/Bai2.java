package HelloWorld;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		double chieurong, chieudai, chuvi, dientich;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều rộng: ");
		chieurong = scanner.nextDouble();
		System.out.print("Nhập chiều dài: ");
		chieudai = scanner.nextDouble();
		
		chuvi = (chieurong + chieudai)*2;
		dientich = chieurong * chieudai;
		
		System.out.println("Chu vi của hình chữ nhật: " + chuvi);
        System.out.println("Diện tích của hình chữ nhật: " + dientich);
        System.out.println("Cạnh nhỏ hơn là " + Math.min(chieudai, chieurong));
        
        scanner.close();
	}
}
