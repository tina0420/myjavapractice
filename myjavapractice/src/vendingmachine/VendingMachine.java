package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("請輸入尋找方式 : ");
		Scanner scanner = new Scanner(System.in);
		int method = scanner.nextInt();
		if(method == 1) {
			//用編號查詢
			System.out.println("請輸入飲料編號 ! ");
			int number = scanner.nextInt();
			switch(number) {
			case 1:
				System.out.println();
			case 2:
			}
		}else {
			if(method == 2) {
				//用價格查詢
				System.out.println("請輸入價格範圍 ! ");
				int rangesmall = scanner.nextInt();
				int rangebig = scanner.nextInt();
			}
		}
	}

}
