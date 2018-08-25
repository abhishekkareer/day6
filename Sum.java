import java.lang.*;
import java.util.*;
import java.io.*;
class Sum
{
  static int a,b;
  static void printt()
  {
    System.out.println("enter the data");
  }
  void add()
  {
    System.out.println(a+b);
  }
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    printt();
    a=ss.nextInt();
    b=ss.nextInt();
    Sum mm=new Sum();
    mm.add();
  }
}