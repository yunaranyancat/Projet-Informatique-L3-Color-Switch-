package cross;

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

public class obscross extends JPanel implements ActionListener {

	private static final int MAX_STATE = 8;
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};
	public static int strokeval = 20;
	public static int xsizeFrame = 450;
	public static int ysizeFrame = 450;
	public static int xMidFrame = xsizeFrame/2;
	public static int yMidFrame = ysizeFrame/2;
	
	
	private int state;
	
	public obscross() {
		//start the timer
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
			
			
		}else if(state == 1) {
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(45), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(45), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
			
		}else if (state == 2) {

	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(90), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(90), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(90), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(90),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
		}else if (state == 3) {
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(135), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(135), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(135), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(135),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
		}else if (state == 4) {
			
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(180), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(180), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(180), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(180),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
			
		}else if (state == 5) {
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(225), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(225), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(225), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(225),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
		}else if (state == 6) {
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(270), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(270), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(270), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(270),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
		}else if (state == 7) {
	        g2.setColor(colors[0]);
			Line2D lintop = new Line2D.Float(xMidFrame,yMidFrame-strokeval-100,xMidFrame,yMidFrame-strokeval);
			
			AffineTransform attop = AffineTransform.getRotateInstance(Math.toRadians(315), xMidFrame,yMidFrame);
			g2.draw(attop.createTransformedShape(lintop));
			
			//
			g2.setColor(colors[1]);
			Line2D linright = new Line2D.Float(xMidFrame+strokeval,yMidFrame,xMidFrame+100+strokeval,yMidFrame);
			
			AffineTransform atright = AffineTransform.getRotateInstance(Math.toRadians(315), xMidFrame,yMidFrame);
			g2.draw(atright.createTransformedShape(linright));
			
			//
			g2.setColor(colors[2]);
			Line2D linbot = new Line2D.Float(xMidFrame,yMidFrame+strokeval,xMidFrame,yMidFrame+strokeval+100);
			
			AffineTransform atbot = AffineTransform.getRotateInstance(Math.toRadians(315), xMidFrame,yMidFrame);
			g2.draw(atbot.createTransformedShape(linbot));
			
			//
			g2.setColor(colors[3]);
			Line2D linleft = new Line2D.Float(xMidFrame-strokeval-100,yMidFrame,xMidFrame-strokeval,yMidFrame);
			
			AffineTransform atleft = AffineTransform.getRotateInstance(Math.toRadians(315),xMidFrame,yMidFrame);
			g2.draw(atleft.createTransformedShape(linleft));
			
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		state++;
		if (state == MAX_STATE) {
			state = 0;
		}
		repaint();
		
	}

	public static void main(String[] args) {
		JFrame frm = new JFrame("Cross");
		frm.add(new obscross());
		frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm.setSize(xsizeFrame,ysizeFrame);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
		
		
	}
}
