import java.awt.*;
import java.applet.*;
/*applet code=GraphicMethods width=500 height=500>
</applet>*/
public class GraphicMethods extends Applet
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