    // Ek simple class banate hain
    class Student7 {
        String name;
        int age;

        // Constructor
        Student7(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // toString method ko override karte hain
        @Override
        public String toString() {
            return "Student Name: " + name + ", Age: " + age;
        }
    }

    public class ToStringMethod {
        public static void main(String[] args) {
            Student7 student1 = new Student7("Rahul", 20);

            // Jab hum object ko print karenge, toString method automatically call hota hai
            System.out.println(student1);
        }
    }


