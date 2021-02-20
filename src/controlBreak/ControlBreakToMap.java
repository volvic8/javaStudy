package controlBreak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ControlBreakToMap {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src\\data\\input\\ControlBreakData_NoOrder.csv");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			Map<String, Integer> result = new TreeMap<String, Integer>(Comparator.reverseOrder());

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				String code = st.nextToken();
				Integer num = Integer.parseInt(st.nextToken());

				if (result.get(code) != null) {
					result.put(code, result.get(code) + num);
				} else {
					result.put(code, num);
				}
			}

			fr.close();
			br.close();

			for (Map.Entry<String, Integer> r : result.entrySet()) {
				System.out.println(r.getKey() + ":" + r.getValue());
			}

//			result.entrySet()
//				.stream()
//				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが存在しません。");
		} catch (IOException e) {
			System.out.println("ファイル入力中にエラー発生");
		} catch (NoSuchElementException e) {
			System.out.println("データの項目が足りない");
		} catch (NumberFormatException e) {
			System.out.println("数値定数に誤りがある");
		}
	}
}
