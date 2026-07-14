
public class Pratical1{
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println();

        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name  = "Rahul";

        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("Salary :"+ salary);
        System.out.println("Grade :"+ grade);
        System.out.println("Student :"+ isStudent);

        System.out.println();

        int number = 50;
        double result = number;

        System.out.println("Implicit Type Csting");
        System.out.println("Integer Valu :"+number);
        System.out.println("Converted to Double :"+result);

        System.out.println();

        double marks = 89.75;
        int totalMarks = (int)marks;

        System.out.println("Explicit Type Csting");
        System.out.println("Double Valu :"+marks);
        System.out.println("Converted to Integer :"+totalMarks);

    }
}
