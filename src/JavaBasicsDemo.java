public class JavaBasicsDemo {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        char grade = 'A';
        String name = "John";
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is a student? " + isStudent);

        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }
    }
}
