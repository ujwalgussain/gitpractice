import java.time.LocalDate;
import java.util.Objects;

public class TestImm {
    public static void main(String[] args) {
        Y y = new Y();
        y.m1(1);
       /*y.m2(1,3,5);
       System.out.println(y.c);*/
    }
}

class X {
    X() {
        System.out.println("X called");
        m1(1);
    }

    public void m1(int a) {
        System.out.println("X.m1 called");
    }

}

class Y extends X {
    LocalDate now;

    Y() {
        System.out.println("Y called");
        now = LocalDate.now();
    }

    public void m1(int a) {
        System.out.println("Y.m1 called");
        System.out.println(now);
    }
}