package master;


public class SpeedConverter {
	
	public static long toMilesPerHours(double kilometersPerHour) {
		if(kilometersPerHour <0) {
			return -1;
		}else {
			//Math.round() -> a built-in math method which returns the closest long to the argument.
			return Math.round(kilometersPerHour);
		}
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour <0) {
			System.out.println("Invalid Value");
		}else {
			long miles = toMilesPerHours(kilometersPerHour);
			System.out.println(kilometersPerHour+" km/h = "+miles+" mi/h");
		}
		
	}
	
	
}
