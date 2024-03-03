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
            System.out.println("Type 3, if you want to add students:" + "\n");
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
                System.out.println("How many students do you want to add?" + "\n");
                int entries = reader.nextInt();
                reader.nextLine();
                Student[] students = new Student[entries];
                for(int i=0; i<entries; i++){
                    students[i] = new Student();
                    students[i].addStudents(i+1);
                }
                System.out.println("\n" + "Here are the new students you added" + "\n");
                for(int i=0; i<entries; i++){
                    students[i].displayStudents(i+1);
                }

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
