package controlBreak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ControlBreakByCityToMap {

	public static void main(String[] args) {
		String line = null;

		try {
			FileReader fr = new FileReader("src\\data\\input\\ControlBreakData_City.csv");
			BufferedReader br = new BufferedReader(fr);
			Map<String, Integer> result = new LinkedHashMap<String, Integer>();

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				String currentKey1 = st.nextToken();
				String currentKey2 = currentKey1 + "-" + st.nextToken();
				Integer num = Integer.parseInt(st.nextToken());

				Integer value1 = result.get(currentKey1);
				if (value1 != null) {
					result.put(currentKey1, value1 + num);
				} else {
					result.put(currentKey1, num);
				}

				Integer value2 = result.get(currentKey2);
				if (value2 != null) {
					result.put(currentKey2, value2 + num);
				} else {
					result.put(currentKey2, num);
				}
			}

			fr.close();
			br.close();

			for (Map.Entry<String, Integer> r : result.entrySet()) {
				System.out.println(r.getKey() + ":" + r.getValue());
			}
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
