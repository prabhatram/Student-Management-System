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

    public String toString(){
        return " Your ID is: " + getTeacherID() + "\n" + " and your name is " + getTeacherName() + "\n";
    }
    
}

