
class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

class EmployeeApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 11;
        e1.name = "Anu";

        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2;
        e2 = e1;
        e2.id = 13;
        e2.name = "Raju";

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

    }
}
