package others;

public class StrCompare {

	public static void main(String[] args) {
		String str1 = new String("ABC");
		// メモリの場所で比較
		System.out.println(str1 == "ABC");
		// 値で比較
		System.out.println(str1.equals("ABC"));

		String str2 = "ABC";
		System.out.println(str2 == "ABC");
		System.out.println(str2.equals("ABC"));
	}

}
