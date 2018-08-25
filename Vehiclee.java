import java.util.*;
import java.lang.*;
import java.io.*;
 abstract class Vehicle
{
  public abstract void start();
  public abstract void stop();
  public abstract void stops();
}
class Twovehicle extends Vehicle
{
  public void start()
  {
    System.out.println("two Vehicle started");
  }
  public void stop()
  {
    System.out.println("two vehicle stop");
  }
  public  void stops()
  {
    System.out.println("two vehicle is in stop state");
  }
}
class Fourvehicle extends Vehicle
{
  public void start()
  {
    System.out.println("four Vehicle stop");
  }
  public void stop()
  {
    System.out.println("four vehicle stop");
  }
  public  void stops()
  {
    System.out.println("four vehicle is in stop state");
  }
}
class Vehiclee
{
  public static void main (String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    String a,b;
   System.out.println("enter the start to start the vehicle");
   a=ss.nextLine();
   Twovehicle tt=new Twovehicle();
   Fourvehicle ff=new Fourvehicle();
   if(a.equals("start"))
   {
   tt.start();
   ff.start();
   }
   else
   {
     tt.stops();
     ff.stops();
   }
   System.out.println("enter the stop to stop the vehicle");
   b=ss.nextLine();
   if(b.equals("stop"))
   {
     tt.stop();
     ff.stop();
   }
  }

}