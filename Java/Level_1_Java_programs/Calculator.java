public class Calculator{
	public static void main(String[] args){
		float num1 = 54.2f;
		float num2 = 12.8f;

		char oparation = '+';

		switch (oparation){
		case '+':
			System.out.println("add = " + (num1 + num2));
			break;
		case '-':
			System.out.println("sub = " + (num1 - num2));
			break;
		case '/':
			System.out.println("div = " + (num1 / num2));
			break;
		case '*':
			System.out.println("mul = " + (num1 * num2));
			break;
		case '%':
			System.out.println("mordulo = " + (num1 % num2));
			break;
		default:
			System.out.println("Enter a valid Operation");

		}
	}
}