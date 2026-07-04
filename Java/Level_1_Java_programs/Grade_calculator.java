public class Grade_calculator{
	public static void main(String[] args){
		int mark = -89;

		if(mark >= 90){
			System.out.println('A');
		} else if(mark >= 80){
			System.out.println('B');
		} else if(mark >= 70){
			System.out.println('C');
		} else if(mark >= 60){
			System.out.println('D');
		} else if(mark < 60 && mark >= 0){
			System.out.println('F');
		} else {
			System.out.println("You are Extra ordinary!");
		}
	}
}