
public class Lecture extends person{
  private String subject;
  
  public Lecture(String name, String email, String subject){
       super(name,email);
       this.subject = subject;
  }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDescription() {
        return "Teaches" +subject;
    }
    
  
}
