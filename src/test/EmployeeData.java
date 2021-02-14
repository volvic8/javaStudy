package test;

public class EmployeeData {
	// インスタンスごとに違う値を設定できる
	Integer id = null;
	String name = "";
	// クラスで１つの値
	static String splitStr = " ";

	Integer getId() {
		return id;
	}

	String getName() {
		return name;
	}

	String getSplitStr() {
		return splitStr;
	}

	void setId(Integer id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSplitStr(String splitStr) {
		this.splitStr = splitStr;
	}
}
