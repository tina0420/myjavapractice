package master;


public class Method {

	public static void main(String[] args) {
		int studentposition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tina",studentposition);
		
		studentposition = calculateHighScorePosition(900);
		displayHighScorePosition("Jackson",studentposition);
		
		studentposition = calculateHighScorePosition(350);
		displayHighScorePosition("Bob",studentposition);
		
		studentposition = calculateHighScorePosition(30);
		displayHighScorePosition("Tiffany",studentposition);
	}
	
	//method1
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name+" managed to get into position "+position+" on the high score table.");
		
	}
	
	//method2 (have to return data(with data type: int))
	public static int calculateHighScorePosition(int score) {
		if(score >=1000) {
			return 1;
		}else {
			if(score>=500) {
				return 2;
			}else{
				if(score >=100) {
					return 3;
				}else {
					return 4;
				}
			}
		}
	}

}
