public class Reverse_number{
	public static void main(String[] args){

		long num = 123456l;

		long temp = num;
		long rem;
		long rev = 0;
		while(temp!=0){
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = (long) temp/10;
		}
		System.out.println("Original: " + num);
		System.out.println("Reversed: " + rev);
	}
}