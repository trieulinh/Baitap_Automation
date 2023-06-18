public class Calculator {
    int a;
    int b;
    float c;
    float d;
    int TinhTong (int sohang1, int sohang2) {
        a = sohang1;
        b = sohang2;
        return a + b;
    }
    float TinhTich(float thuaso1, float thuaso2) {
        c = thuaso1;
        d = thuaso2;
        return c * d;
    }
    void InKetqua(int TinhTong, float TinhTich){
        System.out.println("Tổng của a và b là: " + TinhTong(a,b));
        System.out.println("Tích của c và d là: " + TinhTich(c,d));
    }

    public static void main(String[] args) {
        Calculator bieuthuc01 = new Calculator();
        bieuthuc01.InKetqua(bieuthuc01.TinhTong(10,20),bieuthuc01.TinhTich(8F, 6F));
    }

}
