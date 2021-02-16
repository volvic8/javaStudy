package nonePolymorphism;

// https://it-kyujin.jp/article/detail/678/
class NonePolymorphism {
	public static void main(String[] args) {
		//各楽器をそれぞれ生成
		Piano piano = new Piano();
		Guitar guitar = new Guitar();
		Drum drum = new Drum();

		//playとpauseメソッドを各楽器が順におこなう
		piano.play();
		piano.pause();

		guitar.play();
		guitar.pause();

		drum.play();
		drum.pause();
	}
}

// 動物
class Piano {
	void pause() {
		System.out.println("演奏を止める");
	}

	void play() {
		System.out.println("チャララーン");
	}
}

class Guitar {
	void pause() {
		System.out.println("演奏を止める");
	}

	void play() {
		System.out.println("ジャカジャーン");
	}
}

class Drum {
	void pause() {
		System.out.println("演奏を止める");
	}

	void play() {
		System.out.println("ドドドン");
	}
}