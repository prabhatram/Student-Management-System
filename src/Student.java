import java.util.Scanner;

public class Student {
    // When it comes to adding new entries, enums are not really useful or necessary. 
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

    Scanner reader = new Scanner(System.in);
    private String teacherID;
    private String teacherName;
    
    // Adding following variables to adapt to the array requirement
    private String[] studentID;
    private String[] studentName;
    private char[] gender;
    private String[] address;
    private String[] status;

    public Student(int size){
        this.studentID = new String[size];
        this.studentName = new String[size];
        this.gender = new char[size];
        this.address = new String[size];
        this.status = new String[size];
    }

    /* public Student(String teacherID, String teacherName, char gender, String address, String status){
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.gender = gender;
        this.address = address;
        this.status = status;
    } */

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

    public void setStudentID(int i, String id){
        studentID[i] = id;
    }

    public void setStudentName(int i, String name){
        studentName[i] = name;
    }

    public void setGender(int i, char gender){
        this.gender[i] = gender;
    }  

    public void setAddress(int i, String address){
        this.address[i] = address;
    }

    public void setStatus(int i, String status){
        this.status[i] = status;
    }

    public String getStudentID(int i){
        return studentID[i];
    }

    public String getStudentName(int i){
        return studentName[i];
    }

    public char getGender(int i){
        return gender[i];
    }

    public String getAddress(int i){
        return address[i];
    }

    public String getStatus(int i){
        return status[i];
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

    public void addStudents(int size){
        for(int i=0; i<size; i++){
            System.out.println("Enter the new student ID:" + "\n");
            //studentID[i] = reader.nextLine();
            String id = reader.nextLine();
            setStudentID(i, id);
            System.out.println("Enter the new student name:" + "\n");
            //studentName[i] = reader.nextLine();
            String name = reader.nextLine();
            setStudentName(i, name);
            System.out.println("Enter the new student gender:" + "\n");
            //gender[i] = reader.nextLine().charAt(0); // to accept a char variable, we use charAt(0)
            char gender = reader.nextLine().charAt(0);
            setGender(i, gender);
            System.out.println("Enter the new student address:" + "\n");
            //address[i] = reader.nextLine();
            String address = reader.nextLine();
            setAddress(i, address);
            System.out.println("Enter the new student status:" + "\n");
            //status[i] = reader.nextLine();
            String status = reader.nextLine();
            setStatus(i, status);
        }

    }

    public void displayRecentAdditions(int size){
        for(int i=0; i<size; i++){
            System.out.println("Following are the details of Student #" + (i+1) + "\n");
            System.out.println("ID:" + getStudentID(i) + "\n");
            System.out.println("Name:" + getStudentName(i) + "\n");
            System.out.println("Gender:" + getGender(i) + "\n");
            System.out.println("Address:" + getAddress(i) + "\n");
            System.out.println("Status:" + getStatus(i) + "\n" + "\n");
        }
    }

    public String toString(){
        return " Your ID is: " + getTeacherID() + "\n" + " and your name is " + getTeacherName() + "\n";
    }
    
    
}

