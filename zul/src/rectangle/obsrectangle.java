package rectangle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class obsrectangle extends JPanel implements ActionListener {

	private static final int MAX_STATE = 8;
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	public static int xval = 0;
	public static int yval = 0;
	public static int strokeval = 20;
	public static int xsizeFrame = 450;
	public static int ysizeFrame = 450;
	public static int xMidFrame = xsizeFrame/2;
	public static int yMidFrame = ysizeFrame/2;
	
	AffineTransform at45 = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yMidFrame);
	AffineTransform at90 = AffineTransform.getRotateInstance(Math.toRadians(90),xMidFrame,yMidFrame);
	AffineTransform at135 = AffineTransform.getRotateInstance(Math.toRadians(135),xMidFrame,yMidFrame);
	AffineTransform at180 = AffineTransform.getRotateInstance(Math.toRadians(180),xMidFrame,yMidFrame);
	AffineTransform at225 = AffineTransform.getRotateInstance(Math.toRadians(225),xMidFrame,yMidFrame);
	AffineTransform at270 = AffineTransform.getRotateInstance(Math.toRadians(270),xMidFrame,yMidFrame);
	AffineTransform at315 = AffineTransform.getRotateInstance(Math.toRadians(315),xMidFrame,yMidFrame);
	
	
	
	private int state;
	
	public obsrectangle() {
		//start the timer to provide state change and repaint
		setBackground(Color.BLACK);
		Timer t = new Timer(200,this);
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
        Line2D linleft = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        Line2D lintop = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        Line2D linright = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        Line2D linbot = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);

        
		if (state == 0) {
		g2.setColor(colors[0]);
        g2.draw(linleft);
        
        g2.setColor(colors[1]);
        g2.draw(lintop);
        
        g2.setColor(colors[2]);
        g2.draw(linright);
        
        g2.setColor(colors[3]);
        g2.draw(linbot);
        
		}else if(state == 1) {
		g2.setColor(colors[0]);
        g2.draw(at45.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at45.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at45.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at45.createTransformedShape(linbot));
        
        
		}else if(state == 2) {
		g2.setColor(colors[0]);
        g2.draw(at90.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at90.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at90.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at90.createTransformedShape(linbot));
		
		}else if(state == 3) {
		g2.setColor(colors[0]);
        g2.draw(at135.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at135.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at135.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at135.createTransformedShape(linbot));			
			
		}else if(state == 4) {
		g2.setColor(colors[0]);
        g2.draw(at180.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at180.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at180.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at180.createTransformedShape(linbot));
			
			
		}else if(state == 5) {
		g2.setColor(colors[0]);
        g2.draw(at225.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at225.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at225.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at225.createTransformedShape(linbot));
		
			
		}else if(state == 6) {
		g2.setColor(colors[0]);
        g2.draw(at270.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at270.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at270.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at270.createTransformedShape(linbot));	
			
		}else if(state == 7) {
		g2.setColor(colors[0]);
        g2.draw(at315.createTransformedShape(linleft));
        
		g2.setColor(colors[1]);
        g2.draw(at315.createTransformedShape(lintop));
        
		g2.setColor(colors[2]);
        g2.draw(at315.createTransformedShape(linright));
        
		g2.setColor(colors[3]);
        g2.draw(at315.createTransformedShape(linbot));
			
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
