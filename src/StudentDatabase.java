public class StudentDatabase {
    public static void main(String[] args){

    }

}

class Student{

    private String name;
    private String SSN;
    private static int ID;
    private String userID;
    private String email;

    public Student(String SSN) {
        this.SSN = SSN;
        ID++;
    }

    public void setEmail() {
        this.email = name +"@gmail.com";
    }

    public static void setID(int ID) {
        Student.ID = 100;
    }


    public void setUserID() {
        int random = (int) (Math.random()*100);
        this.userID = ID +""+ random + SSN.substring(0,3);
    }
}
