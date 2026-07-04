public class Basic_loop{
	public static void main(String[] args){

		/*for(int i = 0 ; i <= 100 ; i++){
			System.out.println(i);
		}*/
		/*for(int i = 100; i >= 0; i--){
			System.out.println(i);
		}*/
		for(int i = 0; i <= 100; i++){
			if(i%2==0){
				System.out.println("Even: " + i);
			}else{
				System.out.println("Odd:  " + i);
			}
		}

	}
}