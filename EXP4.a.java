import java.util.Scanner;
public class StudentInfo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter student name: ");
String name = sc.nextLine();
System.out.print("Enter roll number: ");
int rollNo = sc.nextInt();
System.out.print("Enter marks: ");
double marks = sc.nextDouble();
System.out.println();
System.out.println("----- Student Details -----");
System.out.println("Name : " + name);
System.out.println("Roll Number: " + rollNo);
System.out.println("Marks : " + marks);
sc.close();
}
}



OUTPUT
Enter student name: VIKAS
Enter roll number: 10
Enter marks: 99

----- Student Details -----
Name : VIKAS
Roll Number: 10
Marks : 99.0
