public class Test11s21b {

    public static void main(String[] args) {
        new Person1().printPerson();
        new Student1().printPerson();
    }
}

class Student1 extends Person1 {

    private String getInfo() {
        return "Student";
    }
}

class Person1 {

    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}