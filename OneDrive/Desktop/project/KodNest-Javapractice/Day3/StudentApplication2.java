
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

class StudentApplication2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll = 12;
        s1.name = "shiva";
        s1.height = 6.0;

        s2.roll = 11;
        s2.name = "Ramesh";
        s2.height = 6.1;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);

        s1.run();
        s1.sleep();

        s2.run();
        s2.sleep();

    }
}
