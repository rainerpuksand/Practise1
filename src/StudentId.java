import java.util.Scanner;

public class StudentId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT REGISTRATION");

        String ans="yes";
        do{
            System.out.println("Please Enter Name:");
            String name = sc.next();
            System.out.println("Please Enter Age:");
            int age = sc.nextInt();

            System.out.println("Your RollNumber is "  );

            System.out.println("==============Need More Registrations?");
            ans = sc.next();
        }while(ans.equals("yes"));

    }
}

class Student{
    String name;
    int age;
    String id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
