package test;

public class EmployeeBusiness {
    static void output(Integer id, String splitStr, String name) {
    	System.out.println(id + splitStr + name);
    }

    // メソッドのオーバーロード
    static void output(Integer id, String name) {
    	output(id, ":", name);
    }
}
