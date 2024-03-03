import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your ID:" + "\n");
        String id = reader.nextLine();

        System.out.println("Enter your name:" + "\n");
        String name = reader.nextLine();
        int choice;

        do{
            System.out.println("Type 1, if you want to search by ID" + "\n");
            System.out.println("Type 2, if you want to search by name" + "\n");
            System.out.println("Type 3, if you want to add new students by name" + "\n"); // Additional chocie for adding students
            System.out.println("Type 4 to exit:" + "\n");
            choice = reader.nextInt();
            reader.nextLine();

            Student student = new Student(id, name);
            System.out.println(student);


            switch(choice){
                case 1:
                System.out.println("Please enter the student ID" + "\n");
                String studentID = reader.nextLine();
                student.searchByID(studentID);
                    break;
                case 2:
                System.out.println("Please enter the student name" + "\n");
                String studentName = reader.nextLine();
                student.searchByName(studentName);
                    break;
                case 3:
                System.out.println("How many student entries do you want to make? " + "\n");
                int studentEntries = reader.nextInt();
                reader.nextLine();
                Student studentsToAdd = new Student(studentEntries);
                studentsToAdd.addStudents(studentEntries);
                studentsToAdd.displayRecentAdditions(studentEntries);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice" + "\n");
            }
        } while(choice != 3);

        reader.close();
        
    }
    
}
