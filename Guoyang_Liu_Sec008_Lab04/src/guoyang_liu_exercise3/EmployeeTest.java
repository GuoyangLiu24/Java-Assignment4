package guoyang_liu_exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1,"Harry", 15000);
		Employee employee2 = new Employee(2,"Olive", 5000);
		Employee employee3 = new Employee(3,"Jack", 10000);
		
		
		Employee[] employees = {employee1,employee2,employee3};
		
		List<Employee> employeeList = Arrays.asList(employees);
		
		System.out.printf("Employee list has:  %n",  employeeList.toString());
		
		
		for (int i = 0; i < employeeList.size(); i++) {
	         System.out.printf("%s", employeeList.get(i));
	      } 
		
		System.out.printf("Ascending order based on salary: %n");
		Collections.sort(employeeList,new Comparator<Object>(){
            public int compare(Object a , Object b)
            {
            	Employee employee1 = (Employee)a ;
            	Employee employee2 = (Employee)b ;
                int n = employee1.salary - employee2.salary ;
                if(n == 0) return employee1.ID - employee2.ID ;
                else
                    return n ;
            }
        });
		
		for(int i = 0 ; i < employeeList.size() ; i ++)
        {
            System.out.printf("%d",employeeList.get(i).ID);
            System.out.println(" "+employeeList.get(i).name+" "+employeeList.get(i).salary);
        }

	}

}
