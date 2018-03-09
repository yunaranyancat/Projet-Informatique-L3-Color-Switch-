package rectangle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class obsrectangle extends JPanel implements ActionListener {

	private static final int MAX_STATE = 4;
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	public static int xval = 0;
	public static int yval = 0;
	public static int strokeval = 20;
	public static int xsizeFrame = 450;
	public static int ysizeFrame = 450;
	public static int xMidFrame = xsizeFrame/2;
	public static int yMidFrame = ysizeFrame/2;
	
	private int state;
	
	public obsrectangle() {
		//start the timer to provide state change and repaint
		Timer t = new Timer(300,this);
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
		if (state == 0) {
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
		}else if(state == 1) {
		g2.setColor(colors[3]);
        Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        g2.draw(lin2);
        
        g2.setColor(colors[0]);
        Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        g2.draw(lin1);
        
        g2.setColor(colors[1]);
        Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        g2.draw(lin3);
        
        g2.setColor(colors[2]);
        Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
        g2.draw(lin4);
		}else if(state == 2) {
		g2.setColor(colors[2]);
        Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        g2.draw(lin2);
        
        g2.setColor(colors[3]);
        Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        g2.draw(lin1);
        
        g2.setColor(colors[0]);
        Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        g2.draw(lin3);
        
        g2.setColor(colors[1]);
        Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
        g2.draw(lin4);
		}else if (state == 3) {
		g2.setColor(colors[1]);
        Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        g2.draw(lin2);
        
        g2.setColor(colors[2]);
        Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        g2.draw(lin1);
        
        g2.setColor(colors[3]);
        Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        g2.draw(lin3);
        
        g2.setColor(colors[0]);
        Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
        g2.draw(lin4);
		}
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		state++;
		if (state == MAX_STATE) {
			state = 0;
		}
		repaint();
		
	}
	
	public static void main(String[] args) {
		JFrame frm = new JFrame("Rectangle");
		frm.add(new obsrectangle());
		frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm.setSize(xsizeFrame,ysizeFrame);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
		
		
	}

}
