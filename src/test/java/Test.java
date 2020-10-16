import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void test1() {
        int length = 488;
        int a = 1;
        int b = length / 2 + 1;
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < length / 2; i++) {
            ints.add(a);
            ints.add(b);
            a++;
            b++;
        }
        System.out.println(ints);
    }

    @org.junit.Test
    public void test2() {
        int length = 488;
        int a = 1;
        int b = length / 2 + 1;
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = a;
            i++;
            ints[i] = b;
            a++;
            b++;
            System.out.print(ints[i-1]+",");
            System.out.println(ints[i]);
        }
    }
}
