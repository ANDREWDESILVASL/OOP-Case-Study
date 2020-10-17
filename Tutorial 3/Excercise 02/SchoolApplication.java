public class SchoolApplication {
    public static void main(String[] args) {
        // Creating the Person object
        Person jack = new Person("Jack Broole", 27, "M");
        System.out.println(jack);
        // Creating the Student object
        Student beth = new Student("Elisabeth Smith", 16, "F", 122233);
        System.out.println(beth);
        // Creating the Teacher Object
        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 5000);
        System.out.println(sam);

        /*
        Person p = new Teacher ("Sam Hamilton", 34, "M", "Computer Science", 50000);
        Person s = new Student ("Elisabeth Smith", 16, "F", 122233);
        Person p1 = new Teacher ("Sam Hamilton", 34, "M", "Computer Science", 5000);
        */


    }
}
