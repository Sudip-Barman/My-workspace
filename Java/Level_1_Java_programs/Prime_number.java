public class Prime_number{
	public static void main(String[] args){
		/*long num = 47;
		int count = 0;
		for(int i = 2; i < num; i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.println(num + " is a prime number!");
		} else {
			System.out.println(num + " is not a prime number!");
		}*/

		for(int j = 1;j <= 100; j++){
			int count = 0;
			for(int i= 2; i < j; i++){
				if(j%i==0){
					count++;
				}
			}
			if(j == 1){
				System.out.println("1 is a special number");
			} else if(count==0){
				System.out.println(j + " is a prime number!");
			}else {
				System.out.println(j + " is not a prime number!");
			}
		}
	}
}