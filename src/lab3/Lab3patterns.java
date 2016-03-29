package lab3;

import java.io.IOException;
import java.util.Scanner;

public class Lab3patterns {

	public static void main(String[] args) {

		int j;

		if (args.length > 0) {
			j = Integer.parseInt(args[0]);
		} else {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("You need to enter a number from 1 to 9");
				j = sc.nextInt();
			} while (j < 1 || j > 9);
			sc.close();
		}

		System.out.println("\n ----- PATTERNS WITH " + j + " DIGITS -----");
		System.out.println(shape1(j));
		System.out.println(shape2(j));
		System.out.println(shape3(j));
		System.out.println(shape4(j));
		System.out.println(shape5(j));
		System.out.println(shape6(j));

	}

	public static String shape1(int j) {
		String result = "";
		for (int i = 1; i <= j; i++) {
			for (int k = 1; k <= i; k++) {
				result += i;
			}
			result += "\n";
		}
		return result;
	}

	public static String shape2(int j) {
		String result = "";
		for (int i = 1; i <= j; i++) {
			for (int k = 1; k <= (j * 2 + 1); k++) {
				result += i;
			}
			result += "\n";
		}
		return result;
	}

	public static String shape3(int j) {
		String result = "";
		for (int i = 1; i <= j; i++) {
			if (i == 1 || i == j) {
				for (int k = 1; k <= (j * 2 + 1); k++) {
					result += i;
				}
			} else {
				for (int a = 1; a <= j * 2 + 1; a++) {
					if (a == 1 || a == j + 1 || a == j * 2 + 1) {
						result += i;
					} else {
						result += ".";
					}

				}
			}
			result += "\n";
		}
		return result;
	}

	public static String shape4(int j) {
		String result = "";
		for (int i = 1; i <= j; i++) {
			if (i == 1 || i == j || (j - 2 > 2 && i == j / 2 + 1)) {
				for (int k = 1; k <= (j * 2 + 1); k++) {
					result += i;
				}
			} else {
				for (int a = 1; a <= j * 2 + 1; a++) {
					if (a == 1 || a == j + 1 || a == j * 2 + 1) {
						result += i;
					} else {
						result += ".";
					}
				}
			}
			result += "\n";
		}
		return result;
	}

	public static String shape5(int j) {
		String result = "";
		// loop for lines
		for (int i = 1; i <= j; i++) {
			// lines with full digits
			if (i == 1 || i == j || (j - 2 > 2 && i == j / 2 + 1)) {
				// loop for columns with full digits
				for (int k = 1; k <= (j * 2 + 1); k++) {
					result += "1";
				}
			} else {
				// loop for columns
				for (int a = 1; a <= j * 2 + 1; a++) {
					// columns with digits
					if (a == 1 || a == j + 1 || a == j * 2 + 1) {
						result += "1";
						// columns with x
					} else {
						if ((j - 1) % 3 == 2) {
							if ((a - 1) % 3 == 0) {
								result += "x";
							} else {
								result += ".";
							}
						} else if ((j - 1) % 2 == 1) {
							if ((a - 1) % 2 == 0) {
								result += "x";
							} else {
								result += ".";
							}
						} else {
							if (a == j / 2 + 1 || a == 3 * j / 2 + 1) {
								result += "x";
							} else {
								result += ".";
							}
						}
					}
				}
			}
			result += "\n";
		}
		return result;

	}

	public static String shape6(int j) {
		String result = "";
		for (int i = 1; i <= j; i++) {
			int dots = j - (i - 1);
			for (int k = 1; k <= dots; k++) {
				result += ".";
			}
			int dig = (j * 2 + 1) - (dots * 2);
			for (int a = 1; a <= dig; a++) {
				result += i;
			}
			for (int b = 1; b <= dots; b++) {
				result += ".";
			}
			result += "\n";
		}
		return result;
	}

}
