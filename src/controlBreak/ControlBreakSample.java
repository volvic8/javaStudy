package controlBreak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/*
・コントロールブレイクとは、同じキー値を持つレコード軍の切れ目のこと。
・キーごとに集計する（合計とか）
	SQLのGroup Byにあたる
	帳票の合計行とかで使う
・キーはソート済みなのが前提
・現在行と次の行を比較して違うキーの場合は、現在行を出力し、次のキーを処理
・次の行が最終行だったら処理終了
 */
public class ControlBreakSample {

	public static void main(String[] args) {
		try {
			// ソートされている前提
			FileReader fr = new FileReader("src\\data\\input\\ControlBreakData.csv");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			int sum = 0;

			// readLineで１行ずつ読み込み
			while ((line = br.readLine()) != null) {
				// カンマで区切る
				StringTokenizer st = new StringTokenizer(line, ",");
				// １列目
				String code = st.nextToken();
				// 2列目
				sum += Integer.parseInt(st.nextToken());;

				// 8196バイトまでは0でもリセット成功
				br.mark(0);

				String nextLine = br.readLine();
				// ファイル最終行以外の場合、次の行と現在行のコードが一致するか確認
				if (nextLine != null) {
					StringTokenizer nextSt = new StringTokenizer(nextLine, ",");
					String nextCode = nextSt.nextToken();
					// 次の行とコードが一致しない場合、合計を出力
					if (!code.equals(nextCode)) {
						System.out.println(code + ":" + sum);
						sum = 0;
					}
					// markに戻る
					br.reset();
				} else {
					// ファイル最終行の場合、合計を出力
					System.out.println(code + ":" + sum);
				}
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが存在しない:" + e);
		} catch (IOException e) {
			System.out.println("ファイル読み込みエラー:" + e);
		} catch (NoSuchElementException e) {
			System.out.println("データの項目が足りない:" + e);
		} catch (NumberFormatException e) {
			System.out.println("数値変換失敗:" + e);
		}
	}

}
