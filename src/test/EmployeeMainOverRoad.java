package test;

// メソッドのオーバーロード
public class EmployeeMainOverRoad {
    public static void main(String[] args) {
    	EmployeeBusiness business = new EmployeeBusiness();
    	EmployeeData emp1 = new EmployeeData();
    	emp1.setId(10001);
    	emp1.setName("氏名１");
    	emp1.setSplitStr(":");

    	business.output(emp1.getId(), "=", emp1.getName());
    	business.output(emp1.getId(), emp1.getName());
    }
}
