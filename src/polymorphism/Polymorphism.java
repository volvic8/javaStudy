package polymorphism;

class Polymorphism {
	public static void main(String[] args) {
		//楽器クラス型の箱に、各楽器クラス型を詰めた配列
		Instrumental[] band = { new Piano(), new Guitar(), new Drum() };

		//拡張for文でplayとpauseメソッドを順に呼び出し
		for (Instrumental i : band) {
			i.play();
			i.pause();
		}
	}
}

//楽器クラス
abstract class Instrumental {
	void pause() {
		System.out.println("演奏を止める");
	}

	abstract void play(); //何かしらの音で鳴る
}

//楽器クラスを継承した各楽器クラス
class Piano extends Instrumental {
	void play() {
		System.out.println("チャララーン");
	}
}

class Guitar extends Instrumental {
	void play() {
		System.out.println("ジャカジャーン");
	}
}

class Drum extends Instrumental {
	void play() {
		System.out.println("ドドドン");
	}
}