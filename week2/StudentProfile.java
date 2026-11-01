package week2;

public class StudentProfile {
    private String name;
    private int age;
    private String university;

    public StudentProfile(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
    }
    public static void main(String[] args) {
        StudentProfile student = new StudentProfile("Nzeh Favour", 20, "Caleb University");
        student.displayProfile();
    }
}
