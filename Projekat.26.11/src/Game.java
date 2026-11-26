import java.util.ArrayList;

public class Game {
private Player igrac;
private ArrayList<Enemy> neprijatelji;
private ArrayList<String> eventLog;

public Game(Player igrac) {
    this.igrac = igrac;
    this.neprijatelji = new ArrayList<>();
    this.eventLog = new ArrayList<>();
}

public Player getIgrac() {
	return igrac;
}

public void setIgrac(Player igrac) {
	this.igrac = igrac;
}

public ArrayList<Enemy> getNeprijatelji() {
	return neprijatelji;
}

public void setNeprijatelji(ArrayList<Enemy> neprijatelji) {
	this.neprijatelji = neprijatelji;
}

public ArrayList<String> getEventLog() {
	return eventLog;
}

public void setEventLog(ArrayList<String> eventLog) {
	this.eventLog = eventLog;
}

public boolean checkCollision(Player p, Enemy e) {
    return p.intersects(e);
}

public void addEnemy(Enemy e) {
    neprijatelji.add(e);
    eventLog.add("Dodat neprijatelj: " + e.getType());
}

public void addEnemies(ArrayList<Enemy> lista) {
    for (Enemy e : lista) {
        addEnemy(e);
    }
}

public void decreaseHealth(Player p, Enemy e) {
    int steta = e.attack();
    int novo = p.getHealth() - steta;
    p.setHealth(novo);
    eventLog.add(e.getType() + " napada " + p.getIme() + " za " + steta
            + " -> HP=" + novo);
}
		
public ArrayList<Enemy> collidingWithPlayer() {
    ArrayList<Enemy> rezultat = new ArrayList<>();
    for (Enemy e : neprijatelji) {
        if (checkCollision(igrac, e)) {
            rezultat.add(e);
        }
    }
    return rezultat;
}
public static ArrayList<Enemy> loadEnemiesFromFile(
}

