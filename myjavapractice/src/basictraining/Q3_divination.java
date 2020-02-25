package basictraining;

import java.util.Scanner;

public class Q3_divination {

	public static void main(String[] args) {
		//用生日來占卜
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int M = scanner.nextInt();
			int D = scanner.nextInt();
			int S = (M*2+D)%3;
			switch(S) {
			case 0:
				System.out.println("普通");
			case 1:
				System.out.println("吉");
			case 2:
				System.out.println("大吉");
			}
		}
	}

}
