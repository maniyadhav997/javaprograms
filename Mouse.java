import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*</applet code=Mouse width=600 height=500>
</applet>*/
public abstract class Mouse extends Applet implements MouseListener,MouseMotionListener
{
		int X=30,Y=30;
		String msg="MOUSE EVENTS";
		public void inint()
		{
			addMouseListener(this);
			addMouseMotionListener(this);
			setBackground(Color.black);
			setForeground(Color.white);
		}
		public void mouseEntered(MouseEvent me)
		{
			setBackground(Color.black);
			showStatus("MOUSE ENTERED");
			repaint();
		}
		public void mouseExited(MouseEvent me)
		{
			setBackground(Color.yellow);
			showStatus("MOUSE exited");
			repaint();
		}
		public void mousePressed(MouseEvent me)
		{
			setBackground(Color.red);
			showStatus("MOUSE pressed");
			repaint();
		}
		public void mouseRelesed(MouseEvent me)
		{
			setBackground(Color.green);
			showStatus("MOUSE relesed");
			repaint();
		}
		public void mouseMoved(MouseEvent me)
		{
			setBackground(Color.blue);
			showStatus("MOUSE exited");
			repaint();
		}
		public void mouseDragged(MouseEvent me)
		{
			setBackground(Color.pink);
			showStatus("Mouse Dragged at("+me.getX()+","+me.getY()+")");
			repaint();
		}
		public void paint(Graphics g)
		{
			g.drawString(msg,X,Y);
		}
}