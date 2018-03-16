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
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import fyp.colorswitch.Handler;

public class obsrectangle extends Obstacle {
	
	private static final int MAX_STATE = 400;
	
	private int strokeval = 20;
	private int xsizeFrame = 500;
	private int ysizeFrame = 700;
	private int xMidFrame = xsizeFrame/2;
	private float yMidFrame = ysizeFrame/2;
	
    Line2D linleft = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame-50-strokeval,yMidFrame+50-handler.getGameCamera().getyOffset()); 
    Line2D lintop = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset());
    Line2D linright = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame+50+strokeval,yMidFrame+50-handler.getGameCamera().getyOffset());
    Line2D linbot = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset());
    
	
	public static final Color colors[] = {new Color(50, 226, 241),
	        new Color(244, 222, 14), new Color(140, 18, 251), new Color(255, 0, 128)};

	private int state;
	
	public obsrectangle(Handler handler, float yPosition) {
		super(handler, yPosition);
		// TODO Auto-generated constructor stub
		

	}
	
	//+15
	AffineTransform at15 = AffineTransform.getRotateInstance(Math.toRadians(15),xMidFrame,yPosition);
	AffineTransform at30 = AffineTransform.getRotateInstance(Math.toRadians(30),xMidFrame,yPosition);
	AffineTransform at60 = AffineTransform.getRotateInstance(Math.toRadians(60),xMidFrame,yPosition);
	AffineTransform at75 = AffineTransform.getRotateInstance(Math.toRadians(75),xMidFrame,yPosition);
	AffineTransform at105 = AffineTransform.getRotateInstance(Math.toRadians(105),xMidFrame,yPosition);
	AffineTransform at120 = AffineTransform.getRotateInstance(Math.toRadians(120),xMidFrame,yPosition);
	AffineTransform at150 = AffineTransform.getRotateInstance(Math.toRadians(150),xMidFrame,yPosition);
	AffineTransform at165 = AffineTransform.getRotateInstance(Math.toRadians(165),xMidFrame,yPosition);
	AffineTransform at195 = AffineTransform.getRotateInstance(Math.toRadians(195),xMidFrame,yPosition);
	AffineTransform at210 = AffineTransform.getRotateInstance(Math.toRadians(210),xMidFrame,yPosition);
	AffineTransform at240 = AffineTransform.getRotateInstance(Math.toRadians(240),xMidFrame,yPosition);
	AffineTransform at255 = AffineTransform.getRotateInstance(Math.toRadians(255),xMidFrame,yPosition);
	AffineTransform at285 = AffineTransform.getRotateInstance(Math.toRadians(285),xMidFrame,yPosition);
	AffineTransform at300 = AffineTransform.getRotateInstance(Math.toRadians(300),xMidFrame,yPosition);
	AffineTransform at330 = AffineTransform.getRotateInstance(Math.toRadians(330),xMidFrame,yPosition);
	AffineTransform at345 = AffineTransform.getRotateInstance(Math.toRadians(345),xMidFrame,yPosition);
	
	//+45
	AffineTransform at45 = AffineTransform.getRotateInstance(Math.toRadians(45),xMidFrame,yPosition);
	AffineTransform at90 = AffineTransform.getRotateInstance(Math.toRadians(90),xMidFrame,yPosition);
	AffineTransform at135 = AffineTransform.getRotateInstance(Math.toRadians(135),xMidFrame,yPosition);
	AffineTransform at180 = AffineTransform.getRotateInstance(Math.toRadians(180),xMidFrame,yPosition);
	AffineTransform at225 = AffineTransform.getRotateInstance(Math.toRadians(225),xMidFrame,yPosition);
	AffineTransform at270 = AffineTransform.getRotateInstance(Math.toRadians(270),xMidFrame,yPosition);
	AffineTransform at315 = AffineTransform.getRotateInstance(Math.toRadians(315),xMidFrame,yPosition);
	
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
            
//    Line2D linleft = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame-50-strokeval,yMidFrame+50-handler.getGameCamera().getyOffset());
//    Line2D lintop = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset());
//    Line2D linright = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame+50+strokeval,yMidFrame+50-handler.getGameCamera().getyOffset());
//    Line2D linbot = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset());
//    

//    	if (state>=0 && state<15) {
//			
//	        g2.setColor(colors[0]);
//			g2.draw(lintop);
//			
//			g2.setColor(colors[1]);
//			g2.draw(linright);
//			
//			g2.setColor(colors[2]);
//			g2.draw(linbot);
//			
//			g2.setColor(colors[3]);
//			g2.draw(linleft);
//			
//			
//		}else if(state >= 15 && state<30) {
//	        g2.setColor(colors[0]);
//			g2.draw(at15.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at15.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at15.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at15.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 30 && state<45) {
//	        g2.setColor(colors[0]);
//			g2.draw(at30.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at30.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at30.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at30.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 45 && state<60) {
//	        g2.setColor(colors[0]);
//			g2.draw(at45.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at45.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at45.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at45.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 60 && state<75) {
//	        g2.setColor(colors[0]);
//			g2.draw(at60.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at60.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at60.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at60.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 75 && state<90) {
//	        g2.setColor(colors[0]);
//			g2.draw(at75.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at75.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at75.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at75.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 90 && state<105) {
//	        g2.setColor(colors[0]);
//			g2.draw(at90.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at90.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at90.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at90.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 105 && state<120) {
//	        g2.setColor(colors[0]);
//			g2.draw(at105.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at105.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at105.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at105.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 120 && state<135) {
//	        g2.setColor(colors[0]);
//			g2.draw(at120.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at120.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at120.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at120.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 135 && state<150) {
//	        g2.setColor(colors[0]);
//			g2.draw(at135.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at135.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at135.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at135.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 150 && state<165) {
//	        g2.setColor(colors[0]);
//			g2.draw(at150.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at150.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at150.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at150.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 165 && state<180) {
//	        g2.setColor(colors[0]);
//			g2.draw(at165.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at165.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at165.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at165.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 180 && state<195) {
//	        g2.setColor(colors[0]);
//			g2.draw(at180.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at180.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at180.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at180.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 195 && state<210) {
//	        g2.setColor(colors[0]);
//			g2.draw(at195.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at195.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at195.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at195.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 210 && state<225) {
//	        g2.setColor(colors[0]);
//			g2.draw(at210.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at210.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at210.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at210.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 225 && state<240) {
//	        g2.setColor(colors[0]);
//			g2.draw(at225.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at225.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at225.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at225.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 240 && state<255) {
//	        g2.setColor(colors[0]);
//			g2.draw(at240.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at240.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at240.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at240.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 255 && state<270) {
//	        g2.setColor(colors[0]);
//			g2.draw(at255.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at255.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at255.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at255.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 270 && state<285) {
//	        g2.setColor(colors[0]);
//			g2.draw(at270.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at270.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at270.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at270.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 285 && state<300) {
//	        g2.setColor(colors[0]);
//			g2.draw(at285.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at285.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at285.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at285.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 300 && state<315) {
//	        g2.setColor(colors[0]);
//			g2.draw(at300.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at300.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at300.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at300.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 315 && state<330) {
//	        g2.setColor(colors[0]);
//			g2.draw(at315.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at315.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at315.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at315.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 330 && state<345) {
//	        g2.setColor(colors[0]);
//			g2.draw(at330.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at330.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at330.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at330.createTransformedShape(linleft));
//			
//			
//		}else if(state >= 345 && state<360) {
//	        g2.setColor(colors[0]);
//			g2.draw(at345.createTransformedShape(lintop));
//			
//			g2.setColor(colors[1]);
//			g2.draw(at345.createTransformedShape(linright));
//			
//			g2.setColor(colors[2]);
//			g2.draw(at345.createTransformedShape(linbot));
//			
//			g2.setColor(colors[3]);
//			g2.draw(at345.createTransformedShape(linleft));
//			
//			
//		}
    linleft.setLine(xMidFrame-50-strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame-50-strokeval,yMidFrame+50-handler.getGameCamera().getyOffset()); 
    lintop.setLine(xMidFrame-50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame-50-strokeval-handler.getGameCamera().getyOffset());
    linright.setLine(xMidFrame+50+strokeval,yMidFrame-50-handler.getGameCamera().getyOffset(),xMidFrame+50+strokeval,yMidFrame+50-handler.getGameCamera().getyOffset());
    linbot.setLine(xMidFrame-50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset(),xMidFrame+50,yMidFrame+50+strokeval-handler.getGameCamera().getyOffset());
    
    
	if (state < 100) {
	g2.setColor(colors[0]);
    //Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
    g2.draw(linleft);
    
    g2.setColor(colors[1]);
    //Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
    g2.draw(lintop);
    
    g2.setColor(colors[2]);
    //Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
    g2.draw(linright);
    
    g2.setColor(colors[3]);
    //Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
    g2.draw(linbot);
	}else if(state >= 100 && state <200) {
	g2.setColor(colors[3]);
    //Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
    g2.draw(linleft);
    
    g2.setColor(colors[0]);
    //Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
    g2.draw(lintop);
    
    g2.setColor(colors[1]);
    //Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
    g2.draw(linright);
    
    g2.setColor(colors[2]);
    //Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
    g2.draw(linbot);
	}else if(state >= 200 && state <300) {
	g2.setColor(colors[2]);
    //Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
    g2.draw(linleft);
    
    g2.setColor(colors[3]);
    //Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
    g2.draw(lintop);
    
    g2.setColor(colors[0]);
    //Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
    g2.draw(linright);
    
    g2.setColor(colors[1]);
    //Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
    g2.draw(linbot);
	}else if (state >= 300 && state <400) {
	g2.setColor(colors[1]);
    //Line2D lin2 = new Line2D.Float(xMidFrame-50-strokeval,yMidFrame-50,xMidFrame-50-strokeval,yMidFrame+50);
    g2.draw(linleft);
    
    g2.setColor(colors[2]);
    //Line2D lin1 = new Line2D.Float(xMidFrame-50,yMidFrame-50-strokeval,xMidFrame+50,yMidFrame-50-strokeval);
    g2.draw(lintop);
    
    g2.setColor(colors[3]);
    //Line2D lin3 = new Line2D.Float(xMidFrame+50+strokeval,yMidFrame-50,xMidFrame+50+strokeval,yMidFrame+50);
    g2.draw(linright);
    
    g2.setColor(colors[0]);
    //Line2D lin4 = new Line2D.Float(xMidFrame-50,yMidFrame+50+strokeval,xMidFrame+50,yMidFrame+50+strokeval);
    g2.draw(linbot);
	}
			
	}

	@Override
	public boolean collidesWith(Double body, int bodycolor) {
		// TODO Auto-generated method stub
		
		if(body.getMinY()==yMidFrame-50-strokeval-handler.getGameCamera().getyOffset()){ //top
			if(bodycolor==0) {
			return true;}else {return false;}
		}
			
		return false;
	}

}
