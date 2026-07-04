public class Armstrong_number{
	public static void main(String[] args){
		long num = 153;
		long temp,temp1;
		temp = temp1 = num;
		long rem;
		long len = 0;
		long sum = 0;

		while(temp!=0){
			len++;
			temp = (long) temp/10;
		}
		// System.out.println(len);
		while(temp1!=0){
			rem = temp1%10;
			sum = sum + (long) Math.pow(rem,len);
			temp1 = (long) temp1/10;
		}
		// System.out.println(sum);
		if(sum == num){
			System.out.println(num + " is an Armstrong Number");
		}
	}
}