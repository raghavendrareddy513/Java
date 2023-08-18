
public class ArithmeticOperation {
	public static void main(String[] args) {
		int res1 =subtractNumbers(20, 5);
		System.out.println("Subtract num2 from num1: "+res1);
		int res2=multiplyNumbers(4, 5);
		System.out.println("multiply num2 and num1: "+res2);
		double res3=divideNumbers(20, 4);
		System.out.println("Divide num2 and num1: "+res3);
		int res4=findRemainder(10, 3);
		System.out.println("Remainder num2 and num1: "+res4);
	}
		public static int subtractNumbers(int num1, int num2)
		{
			return (num1-num2);
		}

		public static int multiplyNumbers(int num1, int num2)
		{
			return num1*num2;
		}

		public static double divideNumbers(int num1, int num2)
		{
			return num1/num2;
		}

		public static int findRemainder(int num1, int num2)
		{
			return num1%num2;
		}
}
