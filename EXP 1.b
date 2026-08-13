public class StudentResult
{
    public static void main(String[] args)
    {
        int[] marks = {85, 90, 78, 92, 88};
        int total = 0;
        for (int i=0; i< marks. length; i++)

             
        {
            total += marks[i];
        }

        double average = (double) total / marks.length;

        System.out.println("Marks:");
        for (int m : marks)
        {
            System.out.println(m);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

OUTPUT

Marks:
85
90
78
92
88
Total Marks: 433
Average Marks: 86.6
