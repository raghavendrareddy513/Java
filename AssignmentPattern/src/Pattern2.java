
public class Pattern2 {
	public static void main(String[] args) {
		int size = 5; // Change this value to adjust the size of the square
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i == 1 || i == size || j == 1 || j == size) {
					// Print asterisks for the first and last row, and the first and last column
					System.out.print("* ");
				} else {
					// Print spaces for the interior of the square
					System.out.print("  ");
				}
			}
			System.out.println(); // Move to the next line after each row is printed
		}
	}

}
