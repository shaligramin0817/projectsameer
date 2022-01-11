import java.util.ArrayList;
import java.util.List;
class LinkListGeneric {
    public static void main(String[] args) {
        List<StudentLink> studentList1 = new ArrayList<StudentLink>();

        studentList1.add(new StudentLink("Sujit", 1));
        studentList1.add(new StudentLink("Siddharth", 2));
        studentList1.add(new StudentLink("Karanpreet", 3));
        studentList1.add(new StudentLink("Hari", 5));

        printStudentList(studentList1);
    }

    public static void printStudentList(List<StudentLink> students) {
        for (StudentLink s : students) {
            System.out.println(s.name);
        }
    }

}
class StudentLink{
    public String name;
    public int rollno;
    public StudentLink (String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
}