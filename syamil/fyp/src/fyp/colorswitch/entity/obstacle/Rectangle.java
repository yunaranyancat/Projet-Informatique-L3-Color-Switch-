package fyp.colorswitch.entity.obstacle;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;

import fyp.colorswitch.Handler;
import fyp.colorswitch.entity.Entity;

public class Rectangle extends Obstacle {

	public Rectangle(Handler handler, float yPosition) {
		super(handler, yPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		int xPos = (int) x; //( (handler.getWidth() / 2) - (diameter / 2) );
		int yPos = (int) yPosition;//( (handler.getHeight() / 2) - diameter );
		g.setStroke(new BasicStroke((float) 20)); // midW 250 midH 350
		// (startX, startY, endX, endY)
		g.setColor(Entity.colors[0]);
		g.drawLine(150, 100, 300, 100);
		g.setColor(Entity.colors[1]);
		g.drawLine(150, 100, 150, 250);
		g.setColor(Entity.colors[2]);
		g.drawLine(150, 250, 300, 250);
		g.setColor(Entity.colors[3]);
		g.drawLine(300, 100, 300, 250);
		
		
		//rotateLine(g);
	}
	int i = 0;
	public void rotateLine(Graphics2D g) {
		
		Line2D line = new Line2D.Double(250, 200, 250, 350);
		Line2D line2 = new Line2D.Double(250, 350, 400, 350);
		Line2D line3 = new Line2D.Double(250, 350, 250, 500);
		Line2D line4 = new Line2D.Double(100, 350, 250, 350);

	    AffineTransform at = 
	        AffineTransform.getRotateInstance(Math.toRadians(i), line.getX1(), line.getY1());
	    AffineTransform at2 = 
		        AffineTransform.getRotateInstance(Math.toRadians(i), line2.getX1(), line2.getY1());
	    AffineTransform at3 = 
		        AffineTransform.getRotateInstance(Math.toRadians(i), line3.getX1(), line3.getY1());
	    AffineTransform at4 = 
		        AffineTransform.getRotateInstance(Math.toRadians(i), line4.getX1(), line4.getY1());

	    g.setStroke(new BasicStroke(20));
	    g.setColor(Entity.colors[0]);
	    g.draw(at.createTransformedShape(line));
	    g.setColor(Entity.colors[1]);
	    g.draw(at.createTransformedShape(line2));
	    g.setColor(Entity.colors[2]);
	    g.draw(at.createTransformedShape(line3));
	    g.setColor(Entity.colors[3]);
	    g.draw(at.createTransformedShape(line4));
	    i++;
	}

	@Override
	public boolean collidesWith(Double body, int bodyColor) {
		// TODO Auto-generated method stub
		return false;
	}

}
