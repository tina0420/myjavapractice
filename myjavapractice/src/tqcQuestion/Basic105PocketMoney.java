package tqcQuestion;

import java.util.Scanner;

//有一位小朋友從小就開始把1元、5元、10元、50元的零用錢，投進自己的存錢筒裡。請計算出存錢筒中金錢的總額。
//程式執行時，首先要求輸入姓名，顯示【請輸入您的姓名：】，顯示如 Screen Dump。
//姓名輸入完畢，要求輸入銅板個數，顯示如 Screen Dump。
//依序要求輸入1元、5元、10元、50元硬幣的數量，待數入完才可再顯示下一列，顯示如 Screen Dump。
//金額輸入完畢，輸出總額，執行結果顯示如 Screen Dump。

public class Basic105PocketMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("請輸入您的姓名 : ");
		System.out.println("Hi, "+name+"請輸入你的銅板個數");
		System.out.println("請輸入1元的數量 : ");
		int onedollar = scanner.nextInt();
		System.out.println("請輸入5元的數量 : ");
		int fivedollars = scanner.nextInt();
		System.out.println("請輸入10元的數量 : ");
		int tendollars = scanner.nextInt();
		System.out.println("請輸入50元的數量 : ");
		int fiftydollars = scanner.nextInt();
		//計算結果
		int total = 1*onedollar + 5*fivedollars + 10*tendollars + 50 * fiftydollars ;
		System.out.println("您的錢總共有 : "+total);
	}

}
