public class Smallest_value{
	public static void main(String[] args){
		int a = 20;
		int b = 10;
		int c = 30;

		if(a < b && a < c){
			System.out.println(a + " is smallest!");
		} else if(b < a && b < c){
			System.out.println(b + " is smallest!");
		} else if(c < a && c < b){
			System.out.println(c + " is smallest!");
		} else {
			System.out.println("You need to Study Maths!");
		}
	}
}