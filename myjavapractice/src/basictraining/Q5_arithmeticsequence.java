package basictraining;

import java.util.Scanner;

public class Q5_arithmeticsequence {

	public static void main(String[] args) {
		//輸入四個數並判斷第五位等差級數或等比級數
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int n3 = scanner.nextInt();
			int n4 = scanner.nextInt();
			if((n2-n1) == (n3-n2) && (n3-n2) == (n4-n3)) {
				int n5 = n4 + (n4-n3);
				System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
			}else {
				if((n2/n1) == (n3/n2)&&(n3/n2) == (n4/n3)) {
					int n5 = n4 * (n4/n3);
					System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
				}else {
					System.out.println("不是等差/等比級數");
				}
			}
		}
	}

}
