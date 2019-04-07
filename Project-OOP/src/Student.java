
public class Student extends person {
 private String courseGrade;
 
 public Student(String name, String email, String courseGrade){
       super(name,email);
       this.courseGrade= courseGrade;
   }
    public String getCourseGrade() {
        return courseGrade;
    }

    @Override
    public String getDescription() {
        return "the grade of student is " +courseGrade;
    }
 
 
}
