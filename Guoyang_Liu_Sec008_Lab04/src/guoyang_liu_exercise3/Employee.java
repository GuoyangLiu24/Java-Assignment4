package guoyang_liu_exercise3;

public class Employee {
	int ID;
	String name ;
    int salary ;
    
    Employee(int ID,String name , int salary)
    {
        this.ID=ID;
        this.name = name ;
        this.salary = salary ;
    }
    
    public void setID(int ID) {
        if (ID <= 0 ) {
           throw new IllegalArgumentException("ID must be over 0");
        }

        this.ID = ID;
     } 

     // validate and set name 
     public void setName(String name) {
       
        this.name = name; 
     } 

     // validate and set second 
     public void setSalary(int salary) {
        if (salary <= 0 ) {
           throw new IllegalArgumentException("salary must be more than 0");
        }

        this.salary = salary;
     } 

     // Get Methods         
     // get ID value      
     public int getID() {return ID;}

     // get name value      
     public String getName() {return name;} 

     // get salary value      
     public int getSalary() {return salary;} 
     
     public String toString() {
         return String.format(
            "%d %s %d %n", getID(), getName(), getSalary());
      } 
    
}
