package exceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		

		int numr = 10;
		int deno = 0;
		int result;

		try {

			result = numr / deno;
			System.out.println("Result : " + result);

		} catch (ArithmeticException e) {

			System.out.println("An error occured : " + e.getMessage());

		}

		System.out.println("Program continue after the try-catch block.");

	}

}
