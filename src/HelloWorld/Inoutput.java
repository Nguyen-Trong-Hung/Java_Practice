package HelloWorld;

public class Inoutput {
	public static void main(String[] args) {
//		// Nhập xuất cơ bản:
//		import java.util.Scanner;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter something: ");
//		String input = scanner.nextLine();
//		System.out.println(input);
//
//		// Biến (String, int, boolean):
//		int a = 45;
//		String b = "HungHa";
//		boolean c = true;
//
//		// Toán tử, so sánh:
//		int x = 2;
//		int y = 3;
//		System.out.println(Math.pow(x, y)); // Lũy thừa x^y
//		System.out.println(a + b);  // Nối chuỗi
//		System.out.println(a == 45);  // So sánh bằng
//		System.out.println(a != 46);  // So sánh không bằng
//		System.out.println(a >= 40);  // So sánh lớn hơn hoặc bằng
//		System.out.println(a <= 50);  // So sánh nhỏ hơn hoặc bằng
//
//		// String:
//		String str_a = String.valueOf(45) + String.valueOf(100);  // Nối chuỗi
//		System.out.println(b.length());  // Độ dài của chuỗi
//		System.out.println(b.toLowerCase());  // Chuyển chuỗi về chữ thường
//		System.out.println(b.toUpperCase());  // Chuyển chuỗi về chữ hoa
//		System.out.println(b.replace("Hung", "NewName"));  // Thay thế chuỗi con
//
//		// Array (List, Map):
//		// ArrayList
//		import java.util.ArrayList;
//		ArrayList<String> a = new ArrayList<>();
//		a.add("lop1");  // Thêm phần tử vào cuối danh sách
//		a.add("lop2");
//		a.add("lop3");
//		a.remove("lop2");  // Xóa phần tử khỏi danh sách
//		System.out.println(a.contains("lop4"));  // Kiểm tra sự tồn tại của phần tử trong danh sách
//		a.addAll(Arrays.asList("lop5", "lop6"));  // Mở rộng danh sách với các phần tử khác
//
//		// Map (Dictionary)
//		import java.util.HashMap;
//		Map<String, String> b = new HashMap<>();
//		b.put("lop1", "thay Hung");
//		b.put("lop2", "co Ha");
//		System.out.println(b.get("lop1"));  // Truy cập giá trị trong Map
//		b.put("lop3", "co Lan");  // Thêm cặp key-value mới
//		b.remove("lop2");  // Xóa cặp key-value
//
//		// List vs Map:
//		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("lop1", "lop2"));
//		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("lop3", "lop4"));
//		list1.addAll(list2);  // Trong List, hai danh sách có thể cộng lại với nhau
//
//		Map<String, String> map1 = new HashMap<>(b);
//		Map<String, String> map2 = new HashMap<>();
//		map2.put("lop4", "thay Nam");
//		map1.putAll(map2);  // Trong Map, hai Map có thể hợp nhất
//
//		// If, else, elif (else if):
//		if (a.size() < 10) {
//		    System.out.println("a nhỏ hơn 10");
//		} else if (a.size() == 10) {
//		    System.out.println("a bằng 10");
//		} else {
//		    System.out.println("a lớn hơn 10");
//		}
//
//		// Loop:
//		// For loop
//		for (String item : a) {
//		    System.out.println(item);
//		}
//
//		for (int i = 0; i < a.size(); i++) {
//		    System.out.println(a.get(i));
//		}
//
//		// While loop
//		int i = 10;
//		while (i > 0) {
//		    System.out.println(i);
//		    i--;  // Giảm giá trị của i
//		}
//
//		// Function:
//		public static void inchuoi(int a, int b, int c) {
//		    System.out.printf("%d, %d, %d%n", a, b, c);
//		}
//
//		inchuoi(1, 2, 3);
//
//		// Exception Handling:
//		try {
//		    System.out.println(10 / 0);
//		} catch (ArithmeticException e) {
//		    System.out.println("Không thể chia cho 0");
//		} finally {
//		    System.out.println("Khối finally luôn được thực hiện");
//		}
//
//		// Import Module:
//		import java.lang.Math;
//		System.out.println(Math.sqrt(16));  // Tính căn bậc hai
//
//		// Lambda Function (Java 8+):
//		import java.util.function.Function;
//
//		Function<Integer, Integer> doubleFunc = x -> x * 2;
//		System.out.println(doubleFunc.apply(5));
//
//		// List Comprehension (Java 8+ streams):
//		List<Integer> squares = IntStream.range(0, 10)
//		                                 .map(x -> x * x)
//		                                 .boxed()
//		                                 .collect(Collectors.toList());
//		System.out.println(squares);
//
//		// File Handling:
//		import java.io.*;
//
//		try (FileWriter writer = new FileWriter("file.txt")) {
//		    writer.write("Hello World");
//		}
//
//		try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
//		    String content;
//		    while ((content = reader.readLine()) != null) {
//		        System.out.println(content);
//		    }
//		}
//
//		// Classes and Objects:
//		class Person {
//		    private String name;
//		    private int age;
//
//		    public Person(String name, int age) {
//		        this.name = name;
//		        this.age = age;
//		    }
//
//		    public void greet() {
//		        System.out.printf("Hello, my name is %s and I am %d years old.%n", name, age);
//		    }
//		}
//
//		Person p1 = new Person("Hung", 30);
//		p1.greet();
//
//		// Generators (Iterable):
//		class MyGenerator implements Iterable<Integer> {
//		    private final List<Integer> numbers = Arrays.asList(1, 2, 3);
//
//		    public Iterator<Integer> iterator() {
//		        return numbers.iterator();
//		    }
//		}
//
//		for (int value : new MyGenerator()) {
//		    System.out.println(value);
//		}
//
//		// Decorators (using Anonymous Class):
//		interface MyFunc {
//		    void call();
//		}
//
//		class MyDecorator implements MyFunc {
//		    private final MyFunc func;
//
//		    public MyDecorator(MyFunc func) {
//		        this.func = func;
//		    }
//
//		    public void call() {
//		        System.out.println("Something is happening before the function is called.");
//		        func.call();
//		        System.out.println("Something is happening after the function is called.");
//		    }
//		}
//
//		MyFunc sayHello = new MyFunc() {
//		    public void call() {
//		        System.out.println("Hello!");
//		    }
//		};
//
//		MyFunc decoratedFunc = new MyDecorator(sayHello);
//		decoratedFunc.call();
//
//		// Context Managers (try-with-resources):
//		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//		    String content;
//		    while ((content = br.readLine()) != null) {
//		        System.out.println(content);
//		    }
//		}
//
//		// Regular Expressions:
//		import java.util.regex.*;
//
//		Pattern pattern = Pattern.compile("\\d+");
//		Matcher matcher = pattern.matcher("There are 2 apples and 5 bananas.");
//		while (matcher.find()) {
//		    System.out.println(matcher.group());
//		}

	}
}
