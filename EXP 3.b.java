import java.util.ArrayList;
public class StudentRecordManagement
{
    public static void main(String[] args)
    {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Amit");
        studentNames.add("Dharsu");
        studentNames.add("Vikas");
        studentNames.add("Niha");
        System.out.println("List of the Students:");

        for (String name : studentNames)
        {
            System.out.println(name);
        }
        System.out.println("\nTotal number of students: " + studentNames.size());
    }
}

OUTPUT

List of the Students:
Amit
Dharsu
Vikas
Niha
