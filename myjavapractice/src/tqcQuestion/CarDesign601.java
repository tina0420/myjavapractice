package tqcQuestion;
/*
1.請寫一個 Engine(引擊) 類別。1600cc引擎的成本是20000元, 2000cc引擎的成本是25000元。
    請製造一個1600CC的引擎及一個2000cc的引擎呼叫其getCost(成本)方法，印出其傳回值。
2.請寫一個 Aircond(空調) 類別。Auto空調的成本是12000元，Manual空調的成本是10000元。
    請製造一個Auto的空調及一個Manual的空調，呼叫其getCost(成本)方法，印出其傳回值。
3.請撰寫一個Sound(音響) 類別。
    一個音響的成本是2000，請製造一個Sound物件、呼叫其getCost方法，並將其傳回值印出。
*/

public class CarDesign601 {

	public static void main(String[] args) {
		Engine e1 = new Engine(1600);
		Engine e2 = new Engine(2000);
		Aircon a1 = new Aircon(1600);
		Aircon a2 = new Aircon(2000);
		Sound sound = new Sound();
		System.out.println("1600 cost :  "+e1.getCost);
		System.out.println("");
	}

		
	class Cost{
		int cost;
		public int getCost() {
			return cost;
		}
	}
	class Engine extends Cost{
		public Engine(int cc) {
			if(cc == 1600) {
				cost = 20000;
			}else {
				if(cc == 2000) {
					cost = 25000;
				}
			}	
		}	
	}
	class Aircon extends Cost{
		public Aircon(int cc) {
			if (cc == 1600) {
				cost = 10000; 
			}else {
				if(cc == 2000) {
					cost = 12000;
				}
			}
		}
	}
	class Sound extends Cost{
		
	}
	
}
