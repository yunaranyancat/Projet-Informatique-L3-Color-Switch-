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

public class obscross extends Obstacle {

	private float strokeval,xsizeFrame,ysizeFrame,xMidFrame,yMidFrame;

	private static final int MAX_STATE = 8;
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	
	private int state;
	
	public obscross(Handler handler, float yPosition) {
		super(handler, yPosition);
		// TODO Auto-generated constructor stub
		strokeval = 20;
		xsizeFrame = 450;
		ysizeFrame = 450;
		xMidFrame = xsizeFrame/2;
		yMidFrame = ysizeFrame/2;
	}

	AffineTransform at45 = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yMidFrame);
	AffineTransform at90 = AffineTransform.getRotateInstance(Math.toRadians(90),xMidFrame,yMidFrame);
	AffineTransform at135 = AffineTransform.getRotateInstance(Math.toRadians(135),xMidFrame,yMidFrame);
	AffineTransform at180 = AffineTransform.getRotateInstance(Math.toRadians(180),xMidFrame,yMidFrame);
	AffineTransform at225 = AffineTransform.getRotateInstance(Math.toRadians(225),xMidFrame,yMidFrame);
	AffineTransform at270 = AffineTransform.getRotateInstance(Math.toRadians(270),xMidFrame,yMidFrame);
	AffineTransform at315 = AffineTransform.getRotateInstance(Math.toRadians(315),xMidFrame,yMidFrame);
	
	//public obscross() {
	//	//start the timer
	//	setBackground(Color.BLACK);
	//	Timer t = new Timer(300,this);
	//	t.start();
		
	//}
	
	//@Override
	//protected void paintComponent(Graphics g) {
	//	super.paintComponent(g);
	//}
	
	//@Override
	//public void actionPerformed(ActionEvent arg0) {
	//	state++;
	//	if (state == MAX_STATE) {
	//		state = 0;
	//	}
	//	repaint();	
	//}

	@Override
	public void tick() {
		state++;
		if (state == MAX_STATE) {
			state = 0;
		}
	}

	@Override
	public void render(Graphics2D g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(strokeval));
		
		Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
		Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
		Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
		Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
		
		if (state == 0) {
			
	        g2.setColor(colors[0]);
			g2.draw(lintop);
			
			g2.setColor(colors[1]);
			g2.draw(linright);
			
			g2.setColor(colors[2]);
			g2.draw(linbot);
			
			g2.setColor(colors[3]);
			g2.draw(linleft);
			
			
		}else if(state == 1) {
	        g2.setColor(colors[0]);
			g2.draw(at45.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at45.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at45.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at45.createTransformedShape(linleft));
			
			
			
		}else if (state == 2) {

	        g2.setColor(colors[0]);
			g2.draw(at90.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at90.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at90.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at90.createTransformedShape(linleft));
			
			
		}else if (state == 3) {
	        g2.setColor(colors[0]);
			g2.draw(at135.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at135.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at135.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at135.createTransformedShape(linleft));
			
			
		}else if (state == 4) {
			
	        g2.setColor(colors[0]);
			g2.draw(at180.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at180.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at180.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at180.createTransformedShape(linleft));
			
			
		}else if (state == 5) {
	        g2.setColor(colors[0]);
			g2.draw(at225.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at225.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at225.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at225.createTransformedShape(linleft));
			
		}else if (state == 6) {
	        g2.setColor(colors[0]);
			g2.draw(at270.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at270.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at270.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at270.createTransformedShape(linleft));
			
		}else if (state == 7) {
	        g2.setColor(colors[0]);
			g2.draw(at315.createTransformedShape(lintop));
			
			g2.setColor(colors[1]);
			g2.draw(at315.createTransformedShape(linright));
			
			g2.setColor(colors[2]);
			g2.draw(at315.createTransformedShape(linbot));
			
			g2.setColor(colors[3]);
			g2.draw(at315.createTransformedShape(linleft));
			
		}
		
	}

	@Override
	public boolean collidesWith(Double body, int bodycolor) {
		// TODO Auto-generated method stub
		return false;
	}
}
