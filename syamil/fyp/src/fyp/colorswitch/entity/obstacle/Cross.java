package fyp.colorswitch.entity.obstacle;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;

import fyp.colorswitch.Handler;
import fyp.colorswitch.entity.Entity;

public class Cross extends Obstacle {

	private Line2D line, line2, line3, line4;
	private int ha1, ha2, ha3, ha4;
	private int hb1, hb2, hb3, hb4;
	
	public Cross(Handler handler, float yPosition) {
		super(handler, yPosition);
		
		
		ha1 = 200; hb1 = 350;
		ha2 = 350; hb2 = 350;
		ha3 = 350; hb3 = 500;
		ha4 = 350; hb4 = 350;
	}

	@Override
	public void tick() {
		
	}
	
	int i = 0;
	public void rotateLine(Graphics2D g) {
		
		line = new Line2D.Double(250, ha1 - handler.getGameCamera().getyOffset(), 250, hb1 - handler.getGameCamera().getyOffset());
		line2 = new Line2D.Double(250, ha2 - handler.getGameCamera().getyOffset(), 400, hb2 - handler.getGameCamera().getyOffset());
		line3 = new Line2D.Double(250, ha3 - handler.getGameCamera().getyOffset(), 250, hb3 - handler.getGameCamera().getyOffset());
		line4 = new Line2D.Double(100, ha4 - handler.getGameCamera().getyOffset(), 250, hb4 - handler.getGameCamera().getyOffset());
		
		
	    AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(i), 
	    		line.getX2(), line.getY2());
	    AffineTransform at2 = AffineTransform.getRotateInstance(Math.toRadians(i), 
	    		line2.getX1(), line2.getY1());
	    AffineTransform at3 = AffineTransform.getRotateInstance(Math.toRadians(i),
	    		line3.getX1(), line3.getY1());
	    AffineTransform at4 = AffineTransform.getRotateInstance(Math.toRadians(i),
	    		line4.getX2(), line4.getY2());

	    // Draw the rotated line
	    g.setColor(Entity.colors[0]);
	    g.draw(at.createTransformedShape(line));
	    g.setColor(Entity.colors[1]);
	    g.draw(at2.createTransformedShape(line2));
	    g.setColor(Entity.colors[2]);
	    g.draw(at3.createTransformedShape(line3));
	    g.setColor(Entity.colors[3]);
	    g.draw(at4.createTransformedShape(line4));
	    i++;
	}
	
	@Override
	public void render(Graphics2D g) {
		
		g.setStroke(new BasicStroke((float) 20)); 		
		
		rotateLine(g);
	}
	
	public boolean collides(Line2D.Float body, int color) {
		if(body.intersectsLine(line)  )
			return true;
		else
			return false;
		
	}


}
