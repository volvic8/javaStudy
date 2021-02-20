package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class BufferdReaderCsvSample {

	public static void main(String[] args) {
		int n = 1; // 入力データの行数
		String line = null; // 入力された行
		try {
			FileReader fr = new FileReader("src\\data\\input\\sampleData.csv");
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				String kenName = st.nextToken();
				String cityName = st.nextToken();
				System.out.println(kenName + "-" + cityName);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが存在しません。");
		} catch (IOException e) {
			System.out.println("ファイル入力中にエラー発生");
		} catch (NoSuchElementException e) {
			System.out.println("\nError " + n + "行目：" + line + "\nデータの項目が足りない");
		} catch (NumberFormatException e) {
			System.out.println("\nError " + n + "行目：" + line + "\n数値定数に誤りがある");
		}
	}

}
