
public class Employee extends person {
    
    private String department;
    
    public Employee(String name, String email, String department){
       super(name,email);
       this.department = department;
       
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDescription() {
        return "He is working in " +department + "department";
                
    }
    
    
}
