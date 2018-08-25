import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Animal
{
  String breed ,color;
  Animal(String a,String b)
  {
    this.breed=a;
    this.color=b;
  } 
  public String getbreed()
  {
    return breed;
  }
  public String getcolor()
  {
    return color;
  }
  public abstract void speak();
}
class Dog extends Animal
{
  Dog(String a,String b)
  {
    super(a,b);
  }
 public void speak()
  {
    System.out.println("the breed of dog is :- "+getbreed());
    System.out.println("the color of dog is :- "+getcolor());
  }
}
class Cat extends Animal
{
  Cat(String a,String b)
  {
    super(a,b);
  }
  public void speak()
  {
     System.out.println("the breed of cat is :- "+getbreed());
    System.out.println("the color of cat is :- "+getcolor());
  }
}
class Animall
{
  public static void main(String [] aa)
  {
    Dog dd=new Dog("Bulldog","white");
    Cat cc=new Cat("ragdoll","white");
    dd.speak();
    cc.speak();
  }
}