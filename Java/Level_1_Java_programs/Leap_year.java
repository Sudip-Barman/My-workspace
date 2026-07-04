public class Leap_year{
	public static void main(String[] args){
		int year =  2024;

		String result = (year%4==0)? "Leap Year" : "Not a Leap Year";
		System.out.println(result);
	}
}