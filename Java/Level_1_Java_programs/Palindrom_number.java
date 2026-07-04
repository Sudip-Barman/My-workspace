public class Palindrom_number{
	public static void main(String[] args){
		long num = 12121l;
		long  temp = num;
		long rev = 0;
		long rem;
		while(temp!=0){
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = (long) temp/10;
		}
		if(rev == num){
			System.out.println(num + " is a palindrom number!");
		} else {
			System.out.println(num + " is not a palindrom number!");
		}
	}
}