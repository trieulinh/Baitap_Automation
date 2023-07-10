import java.util.ArrayList;
import java.util.Iterator;
public class JAVABASIC05A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <= 50; i++) {
            if (i%2 == 0) {
                list.add(i);
            };
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        };
    }
}


