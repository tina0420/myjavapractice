package basictraining;

import java.util.Scanner;

public class Q4_year {

	public static void main(String[] args) {
		//計算年分為閏年或平年
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			if(year%4 == 0 && year%100 != 0) {
				System.out.println("閏年");
			}else {
				if(year%400 == 0) {
					System.out.println("閏年");
				}else {
					System.out.println("平年");
				}
			}
		}
	}

}
