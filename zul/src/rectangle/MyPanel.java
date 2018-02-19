package rectangle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private int squareX =  50;
	private int squareY = 50;
	private int squareW = 50;
	private int squareH = 20;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, squareW, squareH);
	}
	
	public static void main(String[] args)
	{
		MyPanel mp = new MyPanel();
		mp.paintComponent(null);
		
	}
}
