public class Test11s23 {

    public static void main(String[] args) {
        //new AA();
        new BB();
    }
}

class AA {

    int i = 7;

    public AA() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class BB extends AA {

    public BB() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}