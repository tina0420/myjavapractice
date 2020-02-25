package basictraining;

import java.util.Scanner;

public class Q1_hello {

	public static void main(String[] args) {
		//跟輸入的名稱說hello
		while(true) {
			System.out.println("請輸入名稱");
			Scanner scanner = new Scanner(System.in);
			String word = scanner.nextLine();
			System.out.println("hello, "+word);
		}
	}

}
