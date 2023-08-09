import java.awt.*;
import java.applet.*;
/*<applet code="Codedemo" width=400 height=500>
</applet>*/ 
public class Codedemo extends Applet 
{
    int X=30,Y=30;
    String msg="Mouse events";
    public void inint()
    {
        setBackground(Color.black);
        setForeground(Color.white);
     }
    public void paint(Graphics g)
    {
        Color c=new Color(255,0,0);
        g.setColor(c);
        g.drawString("welcome to world",30,40);
     }
}