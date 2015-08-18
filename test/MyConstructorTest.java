import java.util.*;

/**
 * This program demonstrates object construction.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class MyConstructorTest
{
   public static void main(String[] args)
   {
      Employee e = new Teacher();
   }
}

class Employee  
{
   public Employee()
   {
      System.out.println("Employee construction");
   }
   {
      System.out.println("Employee initail");
   }
   static
   {
      System.out.println("Employee static initail");
   }
}

class Teacher extends Employee
{
   public Teacher()
   {
      System.out.println("Teacher construction");
   }
   {
      System.out.println("Teacher initail");
   }
   static
   {
      System.out.println("Teacher static initail");
   }
}