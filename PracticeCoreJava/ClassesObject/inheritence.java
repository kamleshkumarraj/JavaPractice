package PracticeCoreJava.ClassesObject;

class Employee{
    String name;
    String id;
    String email;
    String address;
    String phoneNo;
    int salary;
    int age;

    Employee(){
        System.out.println("Hii I am Default constructor");
    }

    Employee(String name, String id, String email, String address, String phoneNo, int salary , int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.age = age;
    }


    void printEmployeeDetails(){
        System.out.println("employee name : "+name);
        System.out.println("employee id : "+id);
        System.out.println("employee email : "+email);
        System.out.println("employee address : "+address);
        System.out.println("employee phone number : "+phoneNo);
        System.out.println("employee age : "+age);
        System.out.println("employee salary : "+salary);
    }

}

class Student1 extends Employee{
    String registrationNo;

    Student1(String name , String registrationNo, String email , String address , String phoneNo , int age ){
        super("Amit Kumar" , "912hdbsjbavsg5@1n3#c","amit.employee@544gmail.com","Jodhpur","8965324152",200000,28);
        super.printEmployeeDetails();
        this.name = name;
        this.registrationNo = registrationNo;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    static void printStudentDetails(Student1 employee){
        System.out.println("Student name : "+employee.name);
        System.out.println("Student registration number : "+employee.registrationNo);
        System.out.println("Student email : "+employee.email);
        System.out.println("Student address : "+employee.address);
        System.out.println("Student phone number : "+employee.phoneNo);
        System.out.println("Student age : "+employee.age);
    }
}

public class inheritence {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Kamlesh Kumar", "JIET/CS//22/061", "kamlesh.22jics061@jietjodhpur.ac.in", "Thengpur Bahdinpur Paroo Muz.. Bihar", "8603416388", 20);
        Student1.printStudentDetails(student1);
    }
}
