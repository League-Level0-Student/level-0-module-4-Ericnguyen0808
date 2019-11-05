package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.

		for (int i = 0; i < 5; i++) {

			String num = JOptionPane.showInputDialog("Input a number");
			String numb = JOptionPane.showInputDialog("Input another number");

			int n = Integer.parseInt(num);
			int u = Integer.parseInt(numb);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 0) {
				add(n, u);
			}
			if (operation == 1) {
				subtract(n, u);
			}
			if (operation == 2) {
				multiply(n, u);
			} else if (operation == 3) {
				divide(n, u);
			}
		}
	}
	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	public static void add(int n, int u) {
		System.out.println(n + u);
	}

	public static void subtract(int n, int u) {
		System.out.println(n - u);
	}

	public static void multiply(int n, int u) {
		System.out.println(n * u);
	}

	public static void divide(int n, int u) {
		System.out.println(n / u);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}