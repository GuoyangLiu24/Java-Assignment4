package guoyang_liu_exercise1;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class FirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstName = {"Oliver", "Jack", "Oliver", "Harry", "Oliver", "Jacob", "Jack", "James", "William"
				, "Oscar", "Jack", "Thomas", "Jack", "Charliek", "George"};
		
		List<String> firstNameList = Arrays.asList(firstName);
		
		
		
		System.out.printf("First names list has: %s%n",  firstNameList);
		printNonDuplicates(firstNameList);
		
		
		// output List contents
		   //private static void printList(List<String> firstNameList) {
		      //System.out.printf("%nlist:%n");
		   
		      //for (String name : firstNameList) {
		        // System.out.printf("%s ", name);
		      //}

		      //System.out.println();
		   //}        

		 printSearchResults(firstNameList, "Jack"); //  exist
	     printSearchResults(firstNameList, "Frank"); // does not exist
		
	}
	 private static void printNonDuplicates(Collection<String> values) {
	      // create a HashSet 
	      Set<String> set = new HashSet<>(values);
	      System.out.printf("%nNon-duplicates are: ");

	      for (String value : set) {
	         System.out.printf("%s, ", value);
	      }

	      System.out.println();
	   } 
	 
	 
     
	 private static void printSearchResults(List<String> firstNameList, String key) {

	      System.out.printf("%nSearching for: %s%n", key);
	      int result = Collections.binarySearch(firstNameList, key);
	      
	      if (result >= 0) {
	         System.out.printf("Found at index %d%n", result);
	      } 
	      else {
	         System.out.printf("Not Found (%d)%n",result);
	      } 

	 }	    
}
