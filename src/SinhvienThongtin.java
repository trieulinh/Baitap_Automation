public class SinhvienThongtin {
    String ten;
    int tuoi;
    static String truong = "ĐH Sư Phạm";
    SinhvienThongtin(String t, int tu, String truong) {
        tuoi = tu;
        ten = t;
    }
    public void Inthongtin () {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Trường: " + truong);
    }

    public static void main(String[] args) {
        SinhvienThongtin sv = new SinhvienThongtin("Nguyễn Thụy Triều Linh", 22, truong);
        sv.Inthongtin();
    }
}
