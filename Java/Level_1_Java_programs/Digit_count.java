public class Digit_count{
	public static void main(String[] args){

		long num = 64354987685l;

		// Digit count using type casting
		
		String string_num = "" + num;
		System.out.println("with type casting: " + string_num.length());
		

		// Digit count using loop
		long temp = num;
		int count = 0;
		long rem;
		while(temp!=0){
			rem = temp%10;
			count++;
			temp = (long) temp/10; 
		} 
		System.out.println("with loop: " + count);
	}
}