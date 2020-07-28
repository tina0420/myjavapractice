package tqcQuestion;

//為某冰店設計其冰品的計價系統
//請為冰品的每個原料Apple(蘋果)、Banana(香蕉)、Pudding(布丁)、
//Strawberry(草莓)、Mango(芒果)設計類別及繼承的架構，並提供getCost, getPrice二個方法。
//請各產生一Apple, Banana, Pudding之物件，並印出它們的cost及 price。

public class IcePrice603 {	
	class thing {
		double cost;
		double price;
		
		//單純讀取cost和price，之後拿來做物件繼承
		public thing(double cost,double price) {
			cost = this.cost;
			price = this.price;
		}
		double getCost(){
			return cost;
		}
		double getPrice() {
			return price;
		}
	}
	//不同商品的class
	class Apple extends thing{
		Apple(){
			super(6.0,10.0);
		}	
	}
	class Banana extends thing{
		Banana(){
			super(2.0,5.0);
		}
	}
	class Pudding extends thing{
		Pudding(){
			super(3.0,5.0);
		}
	}
	class Strawberry extends thing{
		Strawberry(){
			super(1.0,5.0);
		}
	}
	class Mango extends thing{
		Mango(){
			super(2.0,5.0);
		}
	}
	public static void main(String[] args) {
		IcePrice603 things = new IcePrice603();
		Apple apple = things.new Apple();
		Banana banana = things.new Banana();
//		Banana banana = new Banana();    這會出錯
		Mango mango = things.new Mango();
//		Mango mango = new Mango();       這會出錯
		System.out.println("Apple's cost :" + apple.getCost());
		System.out.println("Apple's price :" + apple.getPrice());
		System.out.println("Mango's cost :" + mango.getCost());
		System.out.println("Mango's price :" + mango.getPrice());
	}
	
}
