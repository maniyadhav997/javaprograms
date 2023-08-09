import java.awt.*;
import java.applet.*;
/*applet code=GraphicMethod1 width=500 height=500>
</applet>*/
public class GraphicMethod1 extends Applet
{
	public void inint()
     {
		setBackground(Color.black);
		setForeground(Color.white);
     }
     public void paint(Graphics g)
     {
		g.drawString("welcome",40,50);
		g.drawRect(40,70,100,400);
     }
} 