import java.util.*;

class even extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<=20){
            System.out.println("EVEN :"+i);
            i+=2;
        }
    }
}

class odd extends Thread{
    int i=1;
    @Override
    public void run(){
        while(i<=20){
            System.out.println("ODD :"+i);
            i+=2;
        }
    }
}

public class OddEven {
  public static void main(String args[]) throws Exception
  {
     Scanner in = new Scanner(System.in);
     System.out.println(); 
     
     even e = new even();
     odd o = new odd();
     
     e.start();
 //    e.join();   This is option if asked for sycn
     o.start();
  }

}
