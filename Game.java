import java.util.ArrayList;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    public boolean checkCollision(Player p, Enemy e) {
        if (p == null || e == null) {
            return false;
        }
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        if (p == null || e == null) {
            return;
        }
        int dmg = e.getDamage();
        if (e instanceof BossEnemy) {
            dmg *= 2;
        }
        int oldHealth = p.getHealth();
        int newHealth = oldHealth - dmg;
        p.setHealth(newHealth);
        String event = "HIT: Player by " + e.getType() + " for " + dmg + " -> HP " + oldHealth + "->" + p.getHealth();
        eventLog.add(event);
    }

    public void addEnemy(Enemy e) {
        if (e != null) {
            enemies.add(e);
            eventLog.add("Added enemy: " + e.getType());
        }
    }
}
