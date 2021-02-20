package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWriterSample {

	public static void main(String[] args) {
		try{
			File file = new File("src\\data\\output\\output.txt");
			if (checkBeforeWritefile(file)){
				FileWriter filewriter = new FileWriter(file);

				 // 現在日時情報で初期化されたインスタンスの生成
				 Date dateObj = new Date();
				 SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
				 // 日時情報を指定フォーマットの文字列で取得
				 String display = format.format( dateObj );

				filewriter.write("こんにちは" + display);

				filewriter.close();
			}else{
				System.out.println("ファイルに書き込めません");
			}

		}catch(IOException e){
			System.out.println(e);
		}
	}

	private static boolean checkBeforeWritefile(File file){
		if (file.exists()){
			if (file.isFile() && file.canWrite()){
				return true;
			}
		}

		return false;
	}
}
