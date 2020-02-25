package basictraining;

import java.util.Scanner;

public class Q6_equation {

	public static void main(String[] args) {
		//計算一元二次方程式ax^2+bx+c，輸入abc然後計算方程式的解
		while(true){
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			//b^2-4ac開根號(kgh)
			double kgh = Math.sqrt(b*b-4*a*c);
			if((b*b-4*a*c)>0) {
				double solution1 = (-b)+kgh/(2*a);
				double solution2 = (-b)-kgh/(2*a);
				System.out.println("兩相異解 x= "+solution1+","+solution2);
			}else {
				if((b*b-4*a*c) == 0) {
					double onlysolution = (-b)/(2*a);
					System.out.println("重根: "+onlysolution);
				}else {
					if((b*b-4*a*c) < 0) {
						System.out.println("沒有實根");
					}
				}
			}
		}
	}

}
