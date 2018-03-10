package cross;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class cross extends JFrame{

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
	
	public cross(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(xsizeFrame,ysizeFrame);

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
        g2.setColor(colors[0]);
		Line2D lintop = new Line2D.Float(xMidFrame-(strokeval/2),yMidFrame-100,xMidFrame-(strokeval/2),yMidFrame);
		g2.draw(lintop);
       
    }

    public static void main(String []args){
        Frame f=new Frame();
        f.setVisible(true);
    }
}
