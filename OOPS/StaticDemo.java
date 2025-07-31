package OOPS;

class University {

    // 🔹 Static variable
    static String universityName;

    // 🔹 Instance variables
    String studentName;
    int studentId;

    // 🔹 Static block — runs once when class is loaded
    static {
        universityName = "ABC University";
        System.out.println("Static block executed: University name initialized.");
    }

    // 🔹 Constructor
    University(String name, int id) {
        studentName = name;
        studentId = id;
    }

    // 🔹 Static method — can access static variables
    static void showUniversityInfo() {
        System.out.println("University: " + universityName);
    }

    // 🔹 Instance method
    void showStudentInfo() {
        System.out.println("Name: " + studentName + ", ID: " + studentId);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Static block will already have run when class is loaded

        // Calling static method directly using class name
        University.showUniversityInfo();

        // Creating objects
        University s1 = new University("Harshit", 101);
        University s2 = new University("Anjali", 102);

        // Calling instance methods
        s1.showStudentInfo();
        s2.showStudentInfo();
    }
}
