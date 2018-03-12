package fyp.colorswitch.entity.obstacle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import fyp.colorswitch.Handler;

public class obsrectangle extends Obstacle {
	
	private static final int MAX_STATE = 8;
	
	private int strokeval = 20;
	private float xsizeFrame = 500;
	private float ysizeFrame = 700;
	private float xMidFrame = xsizeFrame/2;
	private float yMidFrame = handler.getGameCamera().getyOffset();
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};

	private int state;
	
//	private int angle;
//	
//	public int getangle() {
//		return this.angle;
//	}
//	
//	public int setAngle(int angle) {
//		return this.angle = angle;
//	}

	public obsrectangle(Handler handler, float yPosition) {
		super(handler, yPosition);
		// TODO Auto-generated constructor stub

	}
	
	
	AffineTransform at45 = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yPosition - yMidFrame);
	AffineTransform at90 = AffineTransform.getRotateInstance(Math.toRadians(90),xMidFrame,yPosition - yMidFrame);
	AffineTransform at135 = AffineTransform.getRotateInstance(Math.toRadians(135),xMidFrame,yPosition - yMidFrame);
	AffineTransform at180 = AffineTransform.getRotateInstance(Math.toRadians(180),xMidFrame,yPosition - yMidFrame);
	AffineTransform at225 = AffineTransform.getRotateInstance(Math.toRadians(225),xMidFrame,yPosition - yMidFrame);
	AffineTransform at270 = AffineTransform.getRotateInstance(Math.toRadians(270),xMidFrame,yPosition - yMidFrame);
	AffineTransform at315 = AffineTransform.getRotateInstance(Math.toRadians(315),xMidFrame,yPosition - yMidFrame);
	
	//public obsrectangle() {
		//start the timer to provide state change and repaint
	//	setBackground(Color.BLACK);
	//	Timer t = new Timer(200,this);
	//	t.start();
	//}
	
	//@Override
	//protected void paintComponent(Graphics g) {
	//	super.paintComponent(g);
	//	
	//	
	//}
	
	//@Override
	//public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	//	state++;
	//	if (state == MAX_STATE) {
	//		state = 0;
	//	}
	//	repaint();
		
	//}

	
	@Override
	public void tick() {
		 //TODO Auto-generated method stub
		state++;
		if (state == MAX_STATE) {
				state = 0;
			}
	}

	@Override
	public void render(Graphics2D g) {
		// TODO Auto-generated method stub
		rotaterectangle(g);
	}
	
	public void rotaterectangle(Graphics2D g) {
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(strokeval));
        
        yMidFrame = yPosition - handler.getGameCamera().getyOffset();
        
        Line2D linleft = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
        Line2D lintop = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
        Line2D linright = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
        Line2D linbot = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
        
//		for (int i = 0; i<360; i+=45) {
//			AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(i),xMidFrame,yMidFrame);
//			
//			setAngle(i);
//			
//			g2.setColor(colors[0]);
//			g2.draw(at.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at.createTransformedShape(linleft));
//		}
		

        
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
	public boolean collidesWith(Double body, int bodycolor) {
		// TODO Auto-generated method stub
		return false;
	}

}
