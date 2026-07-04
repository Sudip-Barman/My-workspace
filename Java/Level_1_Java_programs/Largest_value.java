public class Largest_value{
	public static void main(String[] args){
		int a,b,c;
		a = 30;
		b = 0;
		c = 50;
		if(a > b && a > c){
			System.out.println(a + " is the largest");
		} else if(b > a && b > c){
			System.out.println(b + " is the largest");
		} else if(c > b && c > a){
			System.out.println(c + " is the largest");
		} else if(a == b || a == c || b == c){
			System.out.println("\nSorry some values are same!");
		}
	}
}