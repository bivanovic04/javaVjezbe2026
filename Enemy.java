public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("Unesite validno ime");
            return;
        }
        this.type = type.trim();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage >= 0) {
            this.damage = damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "Enemy[" + type + "] @ (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " DMG=" + damage + " HP=" + health;
    }
}
