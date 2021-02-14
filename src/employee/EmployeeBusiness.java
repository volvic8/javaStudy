package employee;

public class EmployeeBusiness {
    void output(Integer id, String splitStr, String name) {
    	System.out.println(id + splitStr + name);
    }

    // メソッドのオーバーロード
    void output(Integer id, String name) {
    	output(id, ":", name);
    }
}
