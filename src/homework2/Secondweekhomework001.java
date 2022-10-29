package homework2;

import java.util.Scanner;

public class Secondweekhomework001 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime giriniz=");
		String name = scanner.nextLine();

		if (name.startsWith("a")) {
			System.out.println(+name.length() - 1);

		} else if (name.startsWith("b")) {
			System.out.println(name.replace("b", "@"));
		} else
			System.out.println("Kelimenin ilk harfi=" +name.charAt(0));
	}

}
