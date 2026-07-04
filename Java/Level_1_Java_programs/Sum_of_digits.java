public class Sum_of_digits{
	public static void main(String[] args){
		long num = 12345l;
		long temp = num;
		long sum = 0;
		long rem;
		while(temp!=0){
			rem = temp%10;
			sum += rem;
			temp = (long) temp/10;
		}
		System.out.println("Sum of digits: " + sum);
	}
}