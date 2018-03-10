package cross;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class StaticCross extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	public static int strokeval = 20;
	public static int xsizeFrame = 450;
	public static int ysizeFrame = 450;
	public static int xMidFrame = xsizeFrame/2;
	public static int yMidFrame = ysizeFrame/2;
	
	public StaticCross(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(xsizeFrame,ysizeFrame);

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
        g2.setColor(colors[0]);
		Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
		g2.draw(lintop);
		
		g2.setColor(colors[1]);
		Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
		g2.draw(linright);
		
		g2.setColor(colors[2]);
		Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
		g2.draw(linbot);
		
		g2.setColor(colors[3]);
		Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
		g2.draw(linleft);
       
       
    }

    public static void main(String []args){
        StaticCross s=new StaticCross();
        s.setVisible(true);
    }
}