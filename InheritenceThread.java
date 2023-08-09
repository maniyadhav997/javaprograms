import java.util.*;
class SingleThread extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}
class InheritenceThread
{
public static void main(String[]args)
{
SingleThread s=new SingleThread();
s.run();
}
}
