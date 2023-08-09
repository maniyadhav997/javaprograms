import java.applet.*;
import java.awt.*;
/*<applet code=Applet1 width=400 height=600>
</applet> */
public class Applet1 extends Applet
{
    public void init()
    {
      setBackground(Color.black);
      setForeground(Color.white);
     }
     public void paint(Graphics g)
     {

             g.drawString("WELCOME TO APPLET",40,40);
		   g.drawRect(40,70,100,400);
		   g.fillRect(40,120,100,40);
		   g.drawOval(40,50,60,30);
      }

}
