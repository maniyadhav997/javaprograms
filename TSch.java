import java.io.*;
class Example
{
  synchronized void display()
   {
     Thread g=new Thread();
     for(int i=0;i<5;i++)
     {
       try
       {
        Thread.sleep(1000);
        System.out.println("NAME IS"+g.getName()+" "+i);
       }
       catch(Exception e)
       {
       }
      }
   }
}
class T extends Thread
{
   Example e;
   T(Example e)
   {
     this.e=e;
   }
   public void run()
   {
     e.display();
   }
}
class TSch
{
  public static void main(String[]args)
  {
     Example ex=new Example();
     T t1=new T(ex);
     T t2=new T(ex);
     T t3=new T(ex);
     t1.start();
     t2.start();
     t3.start();
   } 
}

