package test;

// インスタンス（オブジェクト、new）　vs スタティック（static）
public class EmployeeMain {
    public static void main(String[] args) {
    	EmployeeData emp1 = new EmployeeData();
    	emp1.setId(10001);
    	emp1.setName("氏名１");
    	emp1.setSplitStr(":");

    	EmployeeData emp2 = new EmployeeData();
    	emp2.setId(10002);
    	emp2.setName("氏名２");
    	emp2.setSplitStr("＝"); // ←で上書きされる

    	System.out.println(emp1.getId() + emp1.splitStr + emp1.getName());
    	System.out.println(emp2.getId() + emp2.splitStr + emp2.getName());
    }
}
