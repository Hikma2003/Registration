package JavaProject;

import java.util.Scanner;

public class RegistrationSystem {
        public static class InvalidUIDException extends Exception {
            public InvalidUIDException(String message) {
                super(message);
            }
        }

        public static class InvalidIDException extends Exception {
            public InvalidIDException(String message) {
                super(message);
            }
        }
// create the main method that runs the program
        public static void main(String[] args) {
            // Declare a scanner object to read the user input
            Scanner scanner = new Scanner(System.in);

            // Prompt for Haramaya University student
            System.out.println("*--------------------------------------------------------------*");
            System.out.println("   Welcome to Haramaya  CCI COLLAGE Registration System!   ");
            System.out.println("*--------------------------------------------------------------*");

            // check if the student is from the haramaya university
            System.out.println("Are you a Haramaya University student? (yes or no)");
            String isHaramayaStudent = scanner.nextLine();

            if (isHaramayaStudent.equalsIgnoreCase("yes")) {
                System.out.println("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your gender (M/F): ");
                char gender = scanner.next().charAt(0);

                int id = getValidID(scanner);

                int uid = getValidUID(scanner);


// check if the student is eligible for CCI registration
                System.out.print("Enter your GPA: ");
                double gpa = scanner.nextDouble();

                int semester = 0;
                Student student = new Student(name, id,uid, gender, gpa, semester);

                if (student.isEligible()) {

                    // prints the available departments and their courses
                    System.out.println("Department Selection");
                    System.out.println("Please select a department:");
                    System.out.println("1. Software Engineering");
                    System.out.println("2. Computer Science");
                    System.out.println("3. Information Technology");
                    System.out.println("4. Information Systems");
                    System.out.println("5. Information Science");
                    System.out.println("6. statistics");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    Department departmentSelection = new Department();
                    departmentSelection.setChoice(choice);
                    departmentSelection.displayCourses();

                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter the department name: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter the semester you are going to start now: ");
                    //i'm  making it clear that the user has to choose one of
                   //the three semesters that are available for each department,
                   //and that they have to enter a number. i'm also avoiding
                   //the confusion that might arise from using the word “start”,
                    //since the user might think that they are starting from the first semester.
                    // there maybe a student who may readmit(add) some courses from that semester.
                    semester = scanner.nextInt();

                    student = new Student(name, id, uid, gender,gpa, semester);
                    System.out.println("\nStudent information:");
                    System.out.println(student);
                    student.registerCourses();


                    System.out.println("\nWELCOME TO CCI COLLAGE the world of technology :) ");
                    System.out.println(new StringBuilder().append("\nSuccessfully registered! Take your slip from your: department")
                            .append(  department).toString());

                }
            }
        }

        private static int getValidID(Scanner scanner) {
            // Helper method to validate ID

            int id;
            while (true) {
                try {
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    if (id < 1000 || id > 9999) {
                        throw new InvalidIDException("Invalid ID. ID must be a 4-digit number.");
                    }
                    break;
                } catch (InvalidIDException e) {
                    System.out.println(e.getMessage());
                }
            }
            return id;
        }

        private static int getValidUID(Scanner scanner) {
            // Helper method to validate UID
            int uid;
            while (true) {
                try {
                    System.out.print("Enter student UID: ");
                    uid = scanner.nextInt();
                    if (uid < 100000 || uid > 999999) {
                        throw new InvalidUIDException("Invalid UID. UID must be a 6-digit number.");
                    }
                    break;
                } catch (InvalidUIDException e) {
                    System.out.println(e.getMessage());
                }
            }
            return uid;
        }
    }

