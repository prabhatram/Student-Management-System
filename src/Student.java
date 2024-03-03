import java.util.Scanner;

public class Student {
    enum Students{
        HENRY("001", "Henry", 'M', "123 Pine Street", "Active"),
        MARTHA("002", "Martha", 'F', "Pine Street", "Graduated"),
        RACHEL("003", "Rachel", 'F', "Pine Avenue", "Active"),
        JOHN("004", "John", 'M', "Hogwart", "Suspended");

        private String id;
        private String name;
        private char gender;
        private String address;
        private String status;
        
        private Students(String id, String name, char gender, String address, String status){
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.address = address;
            this.status = status;
        }

        public String getID(){
            return id;
        }

        public String getName(){
            return name;
        }

        public char getGender(){
            return gender;
        }

        public String getAddress(){
            return address;
        }

        public String getStatus(){
            return status;
        }

    }

    private String teacherID;
    private String teacherName;
    private String studentID;
    private String studentName;
    private char studentGender;
    private String studentAddress;
    private String studentStatus;

    Scanner reader = new Scanner(System.in);

    public Student(){}

    public Student(String teacherID, String teacherName){
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    public String getTeacherID(){
        return teacherID;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public void setStudentID(String id){
        this.studentID = id;
    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentAddress(String address){
        this.studentAddress = address;
    }

    public String getStudentAddress(){
        return studentAddress;
    }

    public void setStudentGender(char studentGender){
        this.studentGender = studentGender;
    }

    public char getStudentGender(){
        return studentGender;
    }

    public void setStudentStatus(String status){
        this.studentStatus = status;
    }

    public String getStudentStatus(){
        return studentStatus;
    }

    public void searchByID(String id){
        for(Students student : Students.values()){
            if(student.getID().equals(id)){
                System.out.println("The student was found:" + "\n");
                System.out.println("Name:" + student.getName() + "\n");
                System.out.println("Gender:" + student.getGender() + "\n");
                System.out.println("Address:" + student.getAddress() + "\n");
                System.out.println("Status:" + student.getStatus() + "\n");
                break;
            } else {
                System.out.println("Sorry, no such ID found" + "\n");
                break;
            }
        }    
    }

    public void searchByName(String name){
        for(Students student : Students.values()){
            if(student.getName().equals(name)){
                System.out.println("The student was found:" + "\n");
                System.out.println("ID:" + student.getID() + "\n");
                System.out.println("Gender:" + student.getGender() + "\n");
                System.out.println("Address:" + student.getAddress() + "\n");
                System.out.println("Status:" + student.getStatus() + "\n");
                break;
            } else {
                System.out.println("Sorry, no such name found" + "\n");
            }
        }    
    }

    public void addStudents(int entry){
        
        System.out.println("Enter the ID for the student #" + entry + ":" + "\n");
        String id = reader.nextLine();
        setStudentID(id);

        System.out.println("Enter the name for the student #" + entry + ":" + "\n");
        String name = reader.nextLine();
        setStudentName(name);

        System.out.println("Enter the gender for the student #" + entry + ":" + "\n");
        char gender = reader.nextLine().charAt(0);
        setStudentGender(gender);

        System.out.println("Enter the address for the student #" + entry + ":" + "\n");
        String address = reader.nextLine();
        setStudentAddress(address);

        System.out.println("Enter the status for the student #" + entry + ":" + "\n" + "\n");
        String status = reader.nextLine(); 
        setStudentStatus(status);
    }
    
    public void displayStudents(int entry){
        System.out.println("Student #" + entry + ":" + "\n");
        System.out.println("ID:" + getStudentID() + "\n");
        System.out.println("Name:" + getStudentName() + "\n");
        System.out.println("Gender:" + getStudentGender() + "\n");
        System.out.println("Address:" + getStudentAddress() + "\n");
        System.out.println("Status:" + getStudentStatus() + "\n" + "\n");
    }
    

    public String toString(){
        return " Your ID is: " + getTeacherID() + "\n" + " and your name is " + getTeacherName() + "\n";
    }
    
}

