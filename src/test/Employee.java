package test;

public class Employee {
	// new（インスタンス）、static（静的変数）の違い
    public static void main(String[] args) {
    	EmployeeData e1 = new EmployeeData();
    	e1.setId(10001);
    	e1.setName("氏名１");
    	e1.setSplitStr(":");
    	
    	EmployeeData e2 = new EmployeeData();
    	e2.setId(10002);
    	e2.setName("氏名２");
    	e2.setSplitStr("＝");
    	
    	System.out.println(e1.getId() + e1.splitStr + e1.getName());
    	System.out.println(e2.getId() + e2.splitStr + e2.getName());
    }
    
}
