package basictraining;

import java.util.Scanner;

public class Q8_identity {

	public static void main(String[] args) {
		//身分證有固定算法，輸入身分證，判斷T/F
		Scanner scanner = new Scanner(System.in);
		String place = scanner.nextLine();
        String english[] = {"A","B","C","D","E","F","G","H","I","J","K",
        		  			"L","M","N","O","P","Q","R","S","T","U","V",
        		  			"W","X","Y","Z"}; 
        for(int i=0; i<=english.length; i++) {
        	if(english[0] == place) {
        		System.out.print(english[i]);
        	}
        
        }
		
	}

}
