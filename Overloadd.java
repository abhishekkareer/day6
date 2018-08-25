import java.lang.*;
import java.util.*;
import java.io.*;
class Overloadd
{
   static void print()
  {
    System.out.println("NULL value passed");
  }
  static void print(int a)
  {
   System.out.println("integer value passed"+a);
  }
  public void print(float b)
  {
    System.out.println("float value passed"+b);
  }
  public static void main(String [] aa)
  {
    print();
    print(10);
    Overloadd oo=new Overloadd();
    oo.print(10.1f);
  }
}