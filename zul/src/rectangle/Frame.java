package rectangle;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Frame extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	public static int xval = 0;
	public static int yval = 0;
	public static int strokeval = 20;
	public static int xsizeFrame = 450;
	public static int ysizeFrame = 450;
	public static int xMidFrame = xsizeFrame/2;
	public static int yMidFrame = ysizeFrame/2;
	
	public Frame(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(xsizeFrame,ysizeFrame);

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
        g2.setColor(colors[0]);
        Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        g2.draw(lin2);
        
        g2.setColor(colors[1]);
        Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        g2.draw(lin1);
        
        g2.setColor(colors[2]);
        Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        g2.draw(lin3);
        
        g2.setColor(colors[3]);
        Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
        g2.draw(lin4);
       
    }

    public static void main(String []args){
        Frame s=new Frame();
        s.setVisible(true);
    }
}