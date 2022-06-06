import java.util.List;

public class RegistrationPortal {

	private static RegistrationPortal registrationPortalInstance = null;
	  
    
    List<Student> registeredeStudents;
  
    // private constructor restricted to this class itself
    private RegistrationPortal()
    {
        
    }
  
    // static method to create instance of Singleton class
    public static RegistrationPortal getRegistrationPortal()
    {
        if (registrationPortalInstance == null)
        	registrationPortalInstance = new RegistrationPortal();
  
        return registrationPortalInstance;
    }
    
    
    void register(Student student) {
    	new Thread(() -> { registeredeStudents.add(student); }).run();
    	
    }
    
    List<Student> getRegisteredeStudents(){
    	
    return	this.registeredeStudents;
    }
    
    class Student{
    	private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    	
    	
    }
}
