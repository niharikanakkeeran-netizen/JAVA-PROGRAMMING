class Student
{
    private String name;
    private int rollNo;
    public Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo && this.name.equals(other.name);
    }
}
public class StudentInfo
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Nivetha", 12);
        Student s2 = new Student("Padma", 13);

        System.out.println(s1);
        System.out.println(s1.equals(s2));
    }   
}

OUTPUT
Student@1db9742
false


