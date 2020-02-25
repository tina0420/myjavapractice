package basictraining;

import java.util.Scanner;

public class Q2_addition {

	public static void main(String[] args) {
		//把輸入的兩個字相加
		while(true) {
			System.out.println("請輸入兩個數字");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = a+b;
			System.out.println(sum);
		}
		
	}

}
