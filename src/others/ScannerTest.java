package others;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		System.out.print("入力回数：");
		Scanner scan = new Scanner(System.in);

		String scanStr = scan.nextLine();
		if (isDigit(scanStr)) {

			Integer num = Integer.parseInt(scanStr);
			ArrayList<String> array = new ArrayList<String>();
			for (int i = 0; i < num; i++) {

				System.out.print(i + 1 + "：");
				String str = scan.nextLine();
				array.add(str);
			}
			System.out.println(array);
		}
	}

	public static boolean isNumber(String num) {

		try {
			Integer.parseInt(num);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDigit(String str) {

		boolean isDigit = true;

		int startIndex = str.charAt(0) == '-' ? 1 : 0;
		for (int i = startIndex; i < str.length(); i++) {
			isDigit = Character.isDigit(str.charAt(i));
			if (!isDigit) {
				break;
			}
		}

		return isDigit;
	}
}
