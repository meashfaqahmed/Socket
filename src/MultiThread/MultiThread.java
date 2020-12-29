package MultiThread;

class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } //end of run
    
    
    
}

  
// Main Class 
public class MultiThread 
{ 
    public static void main(String[] args) 
    { 
        //int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            MultithreadingDemo thread = new MultithreadingDemo(); 
            thread.start(); //it will run the "run method"
        } 
    } 
} 