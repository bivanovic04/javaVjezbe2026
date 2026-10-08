import java.util.ArrayList;
public class Game {
private Player player;
private ArrayList<Enemy> enemies;
private ArrayList<String> eventLog;

public Game() { enemies = new ArrayList<>();
eventLog = new ArrayList<>();
}

public static boolean checkCollision(Player p, Enemy e) {
if(p.getX() < e.getX() + e.getWidth()
	            && p.getX() + p.getWidth() > e.getX()
	            && p.getY() < e.getY() + e.getHeight()
	            && p.getY() + p.getHeight() > e.getY()) {
	return true;
}
return false;
}

public void decreaseHealth(Player p, Enemy e) {
	 int health;
	 health = p.getHealth() - e.getDamage();
	 if(health <0) {
		 health = 0;
	 }
	 p.setHealth(health);
	 String event = "hit: " + p.getName() + "by " + e.getType() + "for " + e.getDamage() + "hp = "  + p.getHealth();
	 eventLog.add(event);
	 System.out.println(event);
	 
}

public void addEnemy(Enemy e) {
	enemies.add(e);
	eventLog.add("dodat neprijatelj" + e.getType());
}

public ArrayList<Enemy> findByType(String query){
	ArrayList<Enemy> rezultat = new ArrayList<>();
	
	if(query == null) {
		return rezultat;
	}
	query = query.trim().toLowerCase();
	for(Enemy e : enemies) {
		if(e.getType().toLowerCase().contains(query)) {
			rezultat.add(e);
		}
		
	}
	return rezultat;
}
public ArrayList<Enemy> collidingWithPlayer(){
	ArrayList<Enemy> rezultat = new ArrayList<>();
       for(Enemy e : enemies) {
	      if(checkCollision(player, e)) {
	    	  rezultat.add(e);
	      }
	      
}
       return rezultat;
	
}
public void resolveCollisions() {
	ArrayList<Enemy> sudari = collidingWithPlayer();
	
	for(Enemy e : sudari) {
		decreaseHealth(player, e);
	}
	
}
public static void main(String[] args) {
	Player p1 = new Player("igrac",1,1,3,3,100);
	Enemy e1 = new Enemy("goblin", 1,2,3,3,5);
	checkCollision(p1,e1);
	
	
}
}
