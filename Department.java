package JavaProject;

public class Department {

        private int choice;
        private String departmentName;

        public Department() {
        }

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setChoice(int choice) {
            this.choice = choice;
        }

        public void displayCourses() {
            switch (choice) {
                case 1:
                    System.out.println("You have selected Software Engineering.");
                    break;
                case 2:
                    System.out.println("You have selected Computer Science.");
                    break;
                case 3:
                    System.out.println("You have selected Information Technology.");
                    break;
                case 4:
                    System.out.println("You have selected Information Systems.");
                    break;
                case 5:
                    System.out.println("You have selected Information Science.");
                    break;
                case 6:
                    System.out.println("You have selected statistics.");
                    break;

                default:
                    System.out.println("Registration failed!");
                    System.out.println("Your GPA is below the required.");
            }
            System.out.println("Generating course list...");
        }
    }


