// Fig. 23.7: SharedArrayTest.java
package guoyang_liu_exercise4;
// Executing two Runnables to add elements to a shared SimpleArray.
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
   public static void main(String[] arg) {
	   
	   
	   
	   Random rand = new Random();
      // construct the shared object
      SimpleArray sharedSimpleArray = new SimpleArray(9);

      // create two tasks to write to the shared SimpleArray
      ArrayWriter writer1 = new ArrayWriter(rand.nextInt(11) , sharedSimpleArray);
      ArrayWriter writer2 = new ArrayWriter(rand.nextInt(10)+11, sharedSimpleArray);
      ArrayWriter writer3 = new ArrayWriter(rand.nextInt(10)+21, sharedSimpleArray);

      // execute the tasks with an ExecutorService
      ExecutorService executorService = Executors.newCachedThreadPool();
      executorService.execute(writer1);
      executorService.execute(writer2);
      executorService.execute(writer3);

      executorService.shutdown();

      try {
         // wait 1 minute for both writers to finish executing
         boolean tasksEnded =                                     
            executorService.awaitTermination(1, TimeUnit.MINUTES);

         if (tasksEnded) {
            System.out.printf("%nContents of SimpleArray:%n");
            System.out.println(sharedSimpleArray); // print contents
         }   
         else {
            System.out.println(
               "Timed out while waiting for tasks to finish.");
         } 
      } 
      catch (InterruptedException ex) {
         ex.printStackTrace();
      }
   }
}
