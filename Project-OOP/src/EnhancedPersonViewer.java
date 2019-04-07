
import java.util.Scanner;


public class EnhancedPersonViewer extends PersonViewer{
    
   static Student student[]= new Student[50];
   static Lecture lecture[]= new Lecture[50];
   static Employee employee[]= new Employee[50];
   
   static EnhancedPersonViewer epv = new EnhancedPersonViewer(); 
    
   static int sizeS=0 , sizeL=0 , sizeE=0;
    

    public static void main(String[] args){
        MainMenu();
        
    }
    public void view(person p){
        
        if (p instanceof Student){
            epv.StudentView((Student) p);
        }
        else if (p instanceof Lecture){
             epv.LectureView((Lecture) p);
        }
        else {
           epv.EmployeeView((Employee) p);
        }
     
    }
    public void StudentView(Student s){
        super.view(s);
    }
    
    public void LectureView(Lecture l ){
        super.view(l);
    }
    
    public void EmployeeView(Employee e){
        super.view(e);
    }
    
    public static void MainMenu(){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Main Menu\n" +
                           "1- Student\n" +
                           "2- Lecturer\n" +
                           "3- Employee\n" +
                           "4- Exit");
        
        System.out.println("Enter Choose : ");
        int choose = input.nextInt();
        
        switch(choose){
            case 1:
                StudentMenu();
                break;
            case 2:
                LectureMenu();
                break;
            case 3:
                EmployeeMenu();
                break;
            case 4:
                System.exit(0);
                break;
            }
        }
        
    }
    
     public static void StudentMenu(){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("A) Add Student\n" +
                               "C) Calculate Average\n" +
                               "D) Display Students\n" +
                               "R) Return the Menu");
        
        System.out.println("Enter Choose : ");
        char choose = input.next().toUpperCase().charAt(0);
        
        switch(choose){
            case 'A':
                AddStudent();
                break;
            case 'C':
                CalculateAvg();
                break;
            case 'D':
                DisplayStudent();
                break;
            case 'R':
                return;
            }
        }
        
    }
     
     public static void LectureMenu(){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("A) Add Lecturer\n" +
                               "D) Display Lecturers\n" +
                               "R) Return the Menu");
        
        System.out.println("Enter Choose : ");
        char choose = input.next().toUpperCase().charAt(0);
        
        switch(choose){
            case 'A':
                AddLecture();
                break;
            case 'D':
                DisplayLecture();
                break;
            case 'R':
                return;
            }
        }
        
    }
     
      public static void EmployeeMenu(){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("A) Add Employee\n" +
                               "C) Calculate yearly salary\n" +
                               "D) Display Employees\n" +
                               "R) Return the Menu");
        
        System.out.println("Enter Choose : ");
        char choose = input.next().toUpperCase().charAt(0);
        
        switch(choose){
            case 'A':
                AddEmployee();
                break;
            case 'C': 
                CalculateYearlySalary();
                break;
            case 'D':
                DisplayEmployee();
                break;
            case 'R':
                return;
            }
        }
        
    }
      public static void AddStudent(){
          
          Scanner input = new Scanner(System.in);
         
          System.out.println("\n\n----------AddStudent----------");
          System.out.println("Enter Name");
          String name = input.nextLine();
          
          System.out.println("Enter Email");
          String email = input.nextLine();
          
          System.out.println("Enter course Grade");
          String grade = input.nextLine();
          
          student[sizeS]= new Student(name, email, grade);
          sizeS++;
          
      }
      
       public static void AddLecture(){
          
          Scanner input = new Scanner(System.in);
          
          System.out.println("\n\n----------AddLecture----------");
          System.out.println("Enter Name");
          String name = input.nextLine();
          
          System.out.println("Enter Email");
          String email = input.nextLine();
          
          System.out.println("Enter subject");
          String subject = input.nextLine();
          
          lecture[sizeL]= new Lecture(name, email, subject);
          sizeL++;
          
      }
       
        public static void AddEmployee(){
          
          Scanner input = new Scanner(System.in);
          
          System.out.println("\n\n----------AddEmployee----------");
          System.out.println("Enter Name");
          String name = input.nextLine();
          
          System.out.println("Enter Email");
          String email = input.nextLine();
          
          System.out.println("Enter Department");
          String dep = input.nextLine();
          
          employee[sizeE]= new Employee(name, email, dep);
          sizeE++;
          
      }
        
        public static void DisplayStudent(){
             System.out.println("\n\n----------Display Student----------");
             
             for(int i=0; i<sizeS; i++)
             {
                 epv.view(student [i]);
             }
        }
        
        public static void DisplayLecture(){
             System.out.println("\n\n----------Display Lecture----------");
             for(int i=0; i<sizeL; i++)
             {
                 epv.view(lecture [i]);
             }
        }
        
        public static void DisplayEmployee(){
             System.out.println("\n\n----------Display Employee----------");
             for(int i=0; i<sizeE; i++)
             {
                 epv.view(employee [i]);
             } 
        }
        
        public static void CalculateAvg(){
            System.out.println("\n\n----------Calculate Average----------");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter Number Mark : ");
            int no = input.nextInt();
            double sum =0;
            
            for (int i=1 ; i<no ; i++){
                System.out.println("Enter Mark "+ i + ":");
                sum+= input.nextInt();
            }
            
            System.out.println("Avarage is : " + (sum/no));
        }
        
        public static void CalculateYearlySalary(){
            System.out.println("\n\n----------Calculate Yearly Salary----------");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter Salary of Month :");
            double salary = input.nextDouble();
            
            System.out.println("Yearly Salary : " + (12*salary));
        }
     
    
}
