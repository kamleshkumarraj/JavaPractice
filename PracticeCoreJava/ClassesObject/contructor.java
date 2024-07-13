package PracticeCoreJava.ClassesObject;

class Student{
    //! Class Variables.
    String name = "Kamlesh Kumar";
    int roll = 12;
    String fatherName = "Vinod Bhagat";

    //! Default constructor
    Student(){
        return;
    }

    //! Parameterized constructor
    Student(String name , int roll , String fatherName){
        this.name = name;
        this.roll = roll;
        this.fatherName = fatherName;
    }

    //! Copy Constructors and Private Constructors.
    private Student(Student st){
        this.name = st.name;
        this.roll = st.roll;
        this.fatherName = st.fatherName;

    }
    public static void main(String[] args) {
        Student st = new Student();

        //* Now we perform task for copy constructor.
        Student st3 = new Student(st);
        System.out.println("After Copy the value from first student");
        System.out.println("Name = "+st3.name);
        System.out.println("Roll number = "+st3.roll);
        System.out.println("Father's name  = "+st3.fatherName);
    }

}
public class contructor {
    public static void main(String[] args) {

        //* code for default constructor.
        Student st1 = new Student();
        System.out.println("Before Initialize the value");
        System.out.println("Name = "+st1.name);
        System.out.println("Roll number = "+st1.roll);
        System.out.println("Father's name  = "+st1.fatherName);

        //* Code for parametarized constructor.
        Student st2 = new Student("Rahul kumar", 13 , "Krishna kumar");
        System.out.println("After Initialize the value");
        System.out.println("Name = "+st2.name);
        System.out.println("Roll number = "+st2.roll);
        System.out.println("Father's name  = "+st2.fatherName);

        
        
    }
}
