
public class JAVABASIC04 {
    public static void main(String[] args) {
        int A[] = new int[27];
        int x = 0;
        for (int i = 0; i <=50; i++){
            if (i%2 ==0){
                x++;
                A[x] = i;
                System.out.println(A[x]);
            }
        }
    }
}
