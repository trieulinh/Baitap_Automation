public class ToantuQuanhe {
    int songuyen01;
    int songuyen02;
    String chuoi;
    float sothuc01;
    float sothuc02;
     boolean Sosanh01 (int x, int y){
         songuyen01 = x;
         songuyen02 = y;
         return x < y;
     }
     void Inchuoi (String chuoi){
         System.out.println("Kết quả của dòng in là: " +chuoi);
     }
     boolean Sosanh02 (float a, float b){
         sothuc01 = a;
         sothuc02 = b;
         return a == b;
     }

    public static void main(String[] args) {
        ToantuQuanhe bieuthuc01 = new ToantuQuanhe();
        System.out.println(bieuthuc01.Sosanh01(10,20));
        System.out.println(bieuthuc01.Sosanh02(10F,10F));
        bieuthuc01.Inchuoi("Tôi tên là Nguyễn thụy Triều Linh");
    }
}
