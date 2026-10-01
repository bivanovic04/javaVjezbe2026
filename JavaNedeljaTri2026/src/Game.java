
public class Game {
	public class CollisionChecker {

	    public static boolean checkCollision(Player p, Enemy e) {
	        return p.getX() < e.getX() + e.getWidth()
	            && p.getX() + p.getWidth() > e.getX()
	            && p.getY() < e.getY() + e.getHeight()
	            && p.getY() + p.getHeight() > e.getY();
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Player igrac = new Player(2,2,2,2,100);
Enemy e1 = new Enemy(5,3,1,1,10);
Enemy e2 = new Enemy(20,10,1,1,10);

	}

}
