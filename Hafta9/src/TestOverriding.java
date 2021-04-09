public class TestOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.p(10);
        a.p(10.0);
        System.out.println(a.toString());
        
        B b=new B();
        b.p(10);
        b.p(10.0);
    }
}

class B{
    public void p(double i){
        System.out.println(i*2);
    }
}

class A extends B{
    @Override
    public void p(double i){
        System.out.println(i);
    }
}