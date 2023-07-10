public class JAVABASIC03B {
    int number = 100;
    void Inketqua (int n){
        if (n == number){
            System.out.println("2 số bằng nhau");
        } else if (n < 100) {
            System.out.println("n nhỏ hơn 100");
        } else if (n > 100) {
            System.out.println("n lớn hơn 100");
        }
    }

    public static void main(String[] args) {
        JAVABASIC03B bieuthuc = new JAVABASIC03B();
        bieuthuc.Inketqua(99);
        bieuthuc.Inketqua(100);
        bieuthuc.Inketqua(101);
    }
}
