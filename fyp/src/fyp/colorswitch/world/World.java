package fyp.colorswitch.world;

import java.awt.Graphics2D;
import java.util.Random;

import fyp.colorswitch.Handler;
import fyp.colorswitch.entity.Entity;
import fyp.colorswitch.entity.EntityManager;
import fyp.colorswitch.entity.actor.Player;
import fyp.colorswitch.entity.actor.ScoreStar;
import fyp.colorswitch.entity.actor.Switcher;
import fyp.colorswitch.entity.obstacle.Bar;
import fyp.colorswitch.entity.obstacle.Circle;
import fyp.colorswitch.entity.obstacle.Cross;
import fyp.colorswitch.entity.obstacle.Rectangle;
import fyp.colorswitch.state.State;
import fyp.colorswitch.utils.Util;

public class World {
	
	private Handler handler;
	private EntityManager em;
	
	private Player player;
	private Switcher switcher;
	
	private float midHeight, midWidth;
	
	public World(Handler handler) {
		this.handler = handler;
		this.midWidth = handler.getWidth() / 2;
		this.midHeight = handler.getHeight() / 2;
		em = new EntityManager(handler);
		
		// add entities
		em.addEntity(new Circle(handler, midHeight, 200, 3));
		em.addEntity(new Circle(handler, midHeight, 100, 2));
		//em.addEntity(new Rectangle(handler, 300));
		//em.addEntity(new Cross(handler, 350));
		//em.addEntity(new Bar(handler, 300));
		// test 
		//em.addEntity(new ScoreStar(handler, midHeight - 100, 10, 20));
		switcher = new Switcher(handler, midHeight);
		em.addEntity(switcher);
		
		// add player last to render it in front of other entities
		player = new Player(handler, handler.getHeight() - 100, 0);
		em.addEntity(player);
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}
	
	public void tick() {
		int timer = 0;
		em.tick();	
		if(isGameOver()) {
			//State.setState(handler.getGame().menuState);
		}	
		if(checkCollisions())
			System.out.println("there's a collision");
		if(player.getyPosition()%200 == 0)
			randomSpawn();
		System.out.println(player.getyPosition());
	}
	
	public void render(Graphics2D g) {
		em.render(g);
	}
	
	public boolean isGameOver() {
		// to add : bodycollisions with colors
		if(player.getyPosition() >= 680)
			return true;
		else 
			return false;
	}
	
	public boolean checkCollisions() {
		for(int i = 0; i < em.getEntities().size() ; i++) {
			
			Entity currentEntity = em.getEntities().get(i);
			
			if(currentEntity == player)
				continue;
			
			if(currentEntity.collidesWith(player.getP(), player.getColorType())) {
				
				// case switcher
				if(currentEntity == switcher) {
					player.setColor(player.randomInt());
					em.getEntities().remove(switcher);
					switcher = null;
					return true;
				}
					
			}	
			else
				continue;
		}
		
		return false;
	}
	
	public void randomSpawn() {
		int distanceBetweenObstacle = 200;
		int spawnHeight = (int) (distanceBetweenObstacle + player.getyPosition());
		int x = 0;
		x = handler.getGame().randomInt();
		switch(x) {
			case 0 : em.addEntity(new Circle(handler, spawnHeight, 200, 3));
			case 1 : em.addEntity(new Bar(handler, spawnHeight));
		}
	}
	
	
}
