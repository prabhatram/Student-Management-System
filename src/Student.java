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

    Scanner reader = new Scanner(System.in);

    private String [] studentID; // 001, 002, 003, 005, 005
    private String [] studentName;
    private char [] studentGender;
    private String [] studentAddress;
    private String [] studentStatus;
    
    
    public Student(int entries){

        studentID = new String[entries]; // null, null
        studentName = new String[entries];
        studentGender = new char[entries];
        studentAddress = new String[entries];
        studentStatus = new String[entries];

    }
    public void setStudentID(String id, int index){
        studentID[index] = id;
    }

    public void setStudentName(String name, int index){
        studentName[index] = name;
    }

    public void setStudentGender(char gender, int index){
        studentGender[index] = gender;
    }

    public void setStudentAddress(String address, int index){
        studentAddress[index] = address;
    }

    public void setStudentStatus(String status, int index){
        studentStatus[index] = status;
    }

    public String getStudentID(int index){
        return studentID[index];
    }

    public String getStudentName(int index){
        return studentName[index];
    }

    public char getStudentGender(int index){
        return studentGender[index];
    }

    public String getStudentAddress(int index){
        return studentAddress[index];
    }

    public String getStudentStatus(int index){
        return studentStatus[index];
    }

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
    
    public void addStudents(int entries){
        for(int i = 0; i <entries; i++){
            
            System.out.println("\n" + "Please enter the ID for Student #:" + (i + 1) + "\n");
            String id = reader.nextLine();
            setStudentID(id, i);
            
            System.out.println("Please enter the name for Student #:" + (i+1) + "\n");
            String name = reader.nextLine();
            setStudentName(name, i);
            
            System.out.println("Please enter the gender for Student #:" + (i+1) + "\n");
            char gender = reader.nextLine().charAt(0);
            setStudentGender(gender, i);
            
            System.out.println("Please enter the address for Student #:" + (i+1) + "\n");
            String address = reader.nextLine();
            setStudentAddress(address, i);
            
            System.out.println("Please enter the status for Student #:" + (i+1) + "\n");
            String status = reader.nextLine();
            setStudentStatus(status, i);
            } 
        
    }

    public void displayStudents(int entries){
        for(int i = 0; i < entries; i++){
            System.out.println("\n" +"ID:" + getStudentID(i) + "\n");
            System.out.println("Name:" + getStudentName(i) + "\n");
            System.out.println("Gender:" + getStudentGender(i) + "\n");
            System.out.println("Address:" + getStudentAddress(i) + "\n");
            System.out.println("Status:" + getStudentStatus(i) + "\n");
        }
    }

    public String toString(){
        return " Your ID is: " + getTeacherID() + "\n" + " and your name is " + getTeacherName() + "\n";
    }
    
}

