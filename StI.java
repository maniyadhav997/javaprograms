import java.util.*;
class St implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(i);
}
}
}
class StI
{
public static void main(String[]args)
{
St s=new St();
Thread t=new Thread(s);
t.run();
}
}
