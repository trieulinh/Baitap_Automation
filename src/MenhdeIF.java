public class MenhdeIF {
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
        MenhdeIF bieuthuc = new MenhdeIF();
        bieuthuc.Inketqua(99);
        bieuthuc.Inketqua(100);
        bieuthuc.Inketqua(101);
    }
}
