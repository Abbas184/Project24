import java.util.ArrayList;
class Main{
    public static void main(String[]args){
        ArrayList<Student> studentList= new ArrayList<Student>();
        studentList.add(new Student("sahil",1));
        studentList.add(new Student("arun",2));
        studentList.add(2,new Student("aman",3));
        studentList.add(new Student("Hari",4));
        studentList.add(new Student("Tricha",5));
        printStudentList(studentList);
        studentList.remove(3);

        printStudentList(studentList);
    }

    public static void printStudentList(ArrayList<Student> students){
        for(Student s : students){
        //    Student s = (Student) o ;
            System.out.println(s.getDetails());
        }
    }
}
class Student{
    private final String name;
    private final int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;


    }
    public String getDetails(){
        return
                "name = "+ this.name+ '\n'+ "rollno = "+ rollno + '\n';
    }
}