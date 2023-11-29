package JavaProject;

public class Student {
    private String name;
    private int id;
    private int uid;
    private char gender;
    private double gpa;
    private int semester;

    // Create a constructor that takes the name, ID, gender, and GPA as parameters

    public Student(String name, int id, int uid, char gender, double gpa, int semester) {
        this.name = name;
        this.id = id;
        this.uid = uid;
        this.gender = gender;
        this.gpa = gpa;
        this.semester = semester;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public boolean isEligible() {

        // Create a method that checks if the student is eligible for registration
        return this.gpa >= 3.00;
    }
//    @Override
    public String toString () {
        // Create a method that returns a string representation of the student
        return "Name: " + name + "\nID: " + id + "\nUID: " + uid + "\nGender: "
                + gender + "\nGPA: " + gpa + "\nSemester: " + semester;
    }

    public String registerCourses() {
        // Logic for registering courses
        System.out.println("Courses registered for this semester: " + semester);
        switch (semester) {
//      For example, the courses for the Software department and the first semester are:
//      English II, Applied Mathematics, Emerging Technology, Civic, Anthropology, and C++. However,
//      these courses can be replaced or swapped with other courses that are relevant or suitable
//      for the Software department and the first semester.
//      Similarly, the courses for the other departments and semesters can also be interchangeable.

            case 1:
                System.out.println("English II");
                System.out.println("Applied Mathematics");
                System.out.println("Emerging technology");
                System.out.println("Civic");
                System.out.println("Anthropology");
                System.out.println("C++");
                System.out.println("Entrepreneurship\n");
                break;
            case 2:
                System.out.println("Python");
                System.out.println("Fundamentals of Database");
                System.out.println("Economics");
                System.out.println("Inclusive");
                System.out.println("Fundamentals of software engineering");
                System.out.println("Discrete Mathematics\n");
                break;
            case 3:
                System.out.println("Networking");
                System.out.println("OOP");
                System.out.println("Data structure and algorithm");
                System.out.println("Operating system");
                System.out.println("Computer organization and architecture");
                System.out.println("Statistic\n");
                break;
            default:
                System.out.println("No courses available for this semester.");
        }

        return null;
    }
}







