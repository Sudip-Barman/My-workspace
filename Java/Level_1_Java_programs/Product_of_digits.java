public class Product_of_digits{
	public static void main(String[] args){
		long num = 1234;
		long temp = num;
		long product = 1;
		long rem;

		while(temp!=0){
			rem = temp%10;
			product *= rem;
			temp = (long) temp/10;
		}
		System.out.println("Product of " + num + " is = " + product);
	}
}