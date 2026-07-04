// Strong number is also known as Krishnamurty number
public class Strong_number{
	public static void main(String[] args){
		long num = 145;
		long temp = num;
		long strong = 0;
		long rem;
		

		while(temp!=0){
			long fact = 1;
			rem = temp%10;
			for(int i = 1; i <= rem;i++){
				fact = fact * i;
			}
			// System.out.println(fact);
			strong = strong + fact;
			temp = (long) temp/10;
		}
		// System.out.println(strong);
		if(strong == num){
			System.out.println(num + " is a Strong number!");
		} else {
			System.out.println(num + " is not a Super number!");
		}
	}
}