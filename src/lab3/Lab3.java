package lab3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab3 {

	public static FileReader in = null;
	public static FileWriter out = null;

	public static void main(String args[]) throws IOException {

		System.out.println("PRINTING SAMPLE CODES ----------\n");

		// sample codes
		System.out.println(shape1(9));
		System.out.println(shape2(9));
		
		System.out.println("Writing new patterns with digit 9 to file... \n");
		
		// creating a file

		File file = new File(
				"/Users/karensantos/Dropbox/OttawaU Studies/CEG3185A/Labs/Lab3/lab3.txt");
		file.createNewFile(); // if file already exists it will not be created

		// opening a file in write mode "c:\\lab3.txt"

		try {
			out = new FileWriter(
					"/Users/karensantos/Dropbox/OttawaU Studies/CEG3185A/Labs/Lab3/lab3.txt");

			// append following patterns in a file e.g. "c:\\lab3.txt" one by one
			out.write(shape3(9) + "\n");
			out.write(shape4(9) + "\n");
			out.write(shape5(9) + "\n");
			out.write(shape6(9) + "\n");

			// read the pattern File e.g. "c://lab3.txt" and display to the screen

		} finally {
			if (out != null) {
				out.close();
			}
		}

		System.out.println("Reading the patterns added to the file: \n");
		
		try{
			in = new FileReader(
					"/Users/karensantos/Dropbox/OttawaU Studies/CEG3185A/Labs/Lab3/lab3.txt");
			
			int b;
			String result = "";
			while ((b = in.read()) != -1){
				
				result += (char) b;
				
			}
			in.close();
			System.out.println(result);
			
		} finally {
			if (in != null) {
				in.close();
			}
		}
		

	}

	// PATTERNS WORK FOR EVERY DIGIT FROM 1 TO 9
	
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
				for (int a = 1; a <= j*2 +1; a++){
					if (a == 1 || a == j+1 || a == j*2 + 1){
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
			if (i == 1 || i == j || (j - 2 > 2 && i == j/2 + 1)) {
				for (int k = 1; k <= (j * 2 + 1); k++) {
					result += i;
				}
			} else {
				for (int a = 1; a <= j*2 +1; a++){
					if (a == 1 || a == j+1 || a == j*2 + 1){
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
			if (i == 1 || i == j || (j - 2 > 2 && i == j/2 + 1)) {
				// loop for columns with full digits
				for (int k = 1; k <= (j * 2 + 1); k++) {
					result += "1";
				}
			} else {
				// loop for columns
				for (int a = 1; a <= j*2 + 1; a++){
					// columns with digits
					if (a == 1 || a == j+1 || a == j*2 + 1){
						result += "1";
					// columns with x
					} else {
						if ((j-1) % 3 == 2){ 
							if ((a-1) % 3 == 0) {
								result += "x";
							} else {
								result += ".";
							}
						} else if ((j-1) % 2 == 1){
							if ((a-1) % 2 == 0) {
								result += "x";
							} else {
								result += ".";
							}
						} else {
							if (a == j/2 + 1 || a == 3*j/2 + 1){
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
			for (int k = 1; k <= dots; k++){
				result += ".";
			}
			int dig = (j*2 + 1) - (dots * 2);
			for (int a = 1; a <= dig; a++){
				result += i;
			}
			for (int b = 1; b <= dots; b++){
				result += ".";
			}
			result += "\n";
		}
		return result;
	}

}
