class Th extends Thread
{
public void run()
{
Thread t=new Thread();
System.out.println("STATUS="+t.isAlive());
for(int i=0;i<5;i++)
{
try
{
t.sleep(1000);
}
catch(Exception e)
{
}
System.out.println(i);
}
}
}
class Tmethod
{
public static void main(String[]args)
{
Th t1=new Th();
Th t2=new Th();
t1.start();
try
{
t1.join();
}
catch(Exception e)
{
}
System.out.println("THREAD 2 IS "+t2.isAlive());
t2.start();
/*System.out.println("ID="+t1.getId());
System.out.println("Name="+t1.getName());
t1.setName("mani");
System.out.println("Name="+t1.getName());
System.out.println("Priority="+t1.getPriority());*/
System.out.println("THREAD 1 IS "+t1.isAlive());
}
}