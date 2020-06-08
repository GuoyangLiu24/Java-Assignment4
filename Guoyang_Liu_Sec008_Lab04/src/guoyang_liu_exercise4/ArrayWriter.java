// Fig. 23.6: ArrayWriter.java
package guoyang_liu_exercise4;
// Adds integers to an array shared with other Runnables
import java.lang.Runnable;
import java.util.Random;

public class ArrayWriter implements Runnable {
   private final SimpleArray sharedSimpleArray;
   private  int startValue;

   public ArrayWriter(int value, SimpleArray array) {
      startValue = value;
      sharedSimpleArray = array;
   }

   String threadNumber = Thread.currentThread().toString();
   
   @Override
   public void run() {
      for (int i = 0; i <  3; i++) {
    	  Random rand1 = new Random();
    	
         sharedSimpleArray.add(startValue); // add an element to the shared array
         Thread t = Thread.currentThread();
        
    	   
         if (t.getId()-10 == 1)
         {
        	 startValue=rand1.nextInt(11);
         }else if (t.getId()-10 == 2)
         {
        	 startValue=rand1.nextInt(10)+11;
         }else if (t.getId()-10 == 3)
         {
        	 startValue=rand1.nextInt(10)+21;
         }
       
         
      } 
   }
} 


