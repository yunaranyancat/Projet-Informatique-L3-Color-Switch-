package fyp.colorswitch.entity.obstacle.frames;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;

import fyp.colorswitch.Handler;
import fyp.colorswitch.entity.Entity;
import fyp.colorswitch.entity.obstacle.Obstacle;

public class Line extends Obstacle{
	
	private int color;
	private float xStart, xEnd, yStart, yEnd;
	private int i = 0;
	
	private int ha1, ha2, ha3, ha4;
	private int hb1, hb2, hb3, hb4;
	
	private Line2D line;
	
	public Line(Handler handler, float yPosition, float xStart, float yStart, float xEnd, float yEnd, int color) {
		super(handler, yPosition);
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
		this.color = color;
		
		ha1 = 200; hb1 = 350;
		ha2 = 350; hb2 = 350;
		ha3 = 350; hb3 = 500;
		ha4 = 350; hb4 = 350;
	}

public void rotateLine(Graphics2D g) {
		
		line = new Line2D.Double(xStart, yStart - handler.getGameCamera().getyOffset(), xEnd, yEnd - handler.getGameCamera().getyOffset());
		
	    AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(i), 
	    		line.getX2(), line.getY2());

	    // Draw the rotated line
	    g.setColor(Entity.colors[color]);
	    g.draw(at.createTransformedShape(line));
	   
	    i++;
	}
	public void tick() {
		
	}

	public void render(Graphics2D g) {
		g.setStroke(new BasicStroke(20));
		rotateLine(g);
	}

	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public float getxStart() {
		return xStart;
	}


	public void setxStart(float xStart) {
		this.xStart = xStart;
	}


	public float getxEnd() {
		return xEnd;
	}


	public void setxEnd(float xEnd) {
		this.xEnd = xEnd;
	}


	public float getyStart() {
		return yStart;
	}


	public void setyStart(float yStart) {
		this.yStart = yStart;
	}


	public float getyEnd() {
		return yEnd;
	}


	public void setyEnd(float yEnd) {
		this.yEnd = yEnd;
	}


	@Override
	public boolean collidesWith(Ellipse2D.Double body, int bodycolor) {
		// TODO Auto-generated method stub
		return false;
	}

}
