import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;

enum Test{
    X{
        @Override
        public String getS() {
            return "X";
        }
    },Y{
        @Override
        public String getS() {
            return "Y";
        }
    };
    public abstract String getS();


}
public class Demo {
    public static void main(String[] args) throws Exception {
       List<D> ds = Arrays.asList(new D("d1"),new D("d2"),new D("d3"),new D("d2"));
       List<D> ds1 = null;
       C c = new C(ds);
       B b = new B(c);
       A a = new A(b);
       A a1 = new A(new B(null));
        //System.out.println(Optional.ofNullable(a1.getB().getC().getD()).isPresent());
        LocalDate l = LocalDate.now();

        System.out.println(Test.valueOf("Z"));

        System.out.println(Optional.ofNullable(Arrays.asList()));

        /*Future<String> future =null;

        if(true) {
            ExecutorService ex = Executors.newSingleThreadExecutor();
            future = ex.submit(() -> {
                Thread.sleep(10000);
                return "future";
            });
            ex.shutdown();

        }
        System.out.println("before get");
        System.out.println(future.get());
        System.out.println("after get");*/

    }
}
class A
{
    B b;

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
class B
{
    C c;

    public B(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
class C
{
    List<D> d;

    public C(List<D> d) {
        this.d = d;
    }

    public List<D> getD() {
        return d;
    }

    public void setD(List<D> d) {
        this.d = d;
    }
}
class D
{
    String s;

    public D(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "D{" +
                "s='" + s + '\'' +
                '}';
    }
}
