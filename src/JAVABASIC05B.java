
import java.util.ArrayList;
public class JAVABASIC05B {
        String name;
        int age;

        public JAVABASIC05B(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge() {
            this.age = age;
        }

        public String toString() {
            return "Sinhvien(name: " + name + ", " + "age: " + age + ")";
        }
        public static void main(String[] args) {
            ArrayList<JAVABASIC05B> sinhvien = new ArrayList<JAVABASIC05B>();
            JAVABASIC05B sinhvien01 = new JAVABASIC05B("Linh", 29);
            JAVABASIC05B sinhvien02 = new JAVABASIC05B("Hải", 29);
            sinhvien.add(sinhvien01);
            sinhvien.add(sinhvien02);
            for (int i =0; i< sinhvien.size(); i++) {
                System.out.println(sinhvien.get(i).toString());
            }
        }
    }

