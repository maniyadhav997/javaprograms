import java.awt.*;
import java.applet.*;
public class Number extends Applet
{
  public void paint(Graphics g)
{
 int a=1;
int b=21;
int c=a+b;
String s="sum="+String.valueOf(c);

g.drawString(s,100,100);
}
}
