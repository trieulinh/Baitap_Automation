import java.util.ArrayList;
public class JAVABASIC05C {
    String name;
    int age;
    static String company = "Shapee Cloud JSC";

    public JAVABASIC05C(String name, int age, String company) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Nhân viên: " + name + ", " + "tuổi: " + age + ", " + "Công ty: " + company);
    }

    public static void main(String[] args) {
        ArrayList<JAVABASIC05C> listnhanvien = new ArrayList<JAVABASIC05C>();
        JAVABASIC05C nhanvien01 = new JAVABASIC05C("Linh", 29, company);
        JAVABASIC05C nhanvien02 = new JAVABASIC05C("Hải", 29, company);
        listnhanvien.add(nhanvien01);
        listnhanvien.add(nhanvien02);
        for (int i = 0; i < listnhanvien.size(); i++) {
            System.out.println(listnhanvien.get(i).toString());
        }
    }
}
