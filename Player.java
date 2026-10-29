public class Player extends GameObject {
    private String name;
    private int health;

    public Player(int x, int y, int width, int height, String name, int health) {
        super(x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Unesite validno ime");
            return;
        }
        String cleaned = name.replaceAll("\\s+", " ").trim();
        String[] words = cleaned.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        this.name = sb.toString().trim();
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
        return "Player[" + name + "] @ (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " HP=" + health;
    }
}
