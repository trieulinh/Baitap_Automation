public class JAVABASIC01 {
    String ten;
    int tuoi;
    static String truong = "ĐH Sư Phạm";
    JAVABASIC01(String t, int tu, String truong) {
        tuoi = tu;
        ten = t;
    }
    public void Inthongtin () {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Trường: " + truong);
    }

    public static void main(String[] args) {
        JAVABASIC01 sv = new JAVABASIC01("Nguyễn Thụy Triều Linh", 22, truong);
        sv.Inthongtin();
    }
}
