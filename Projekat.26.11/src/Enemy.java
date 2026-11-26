

public abstract class Enemy extends GameObject implements Attacker {
	private String type;
	private int damage;
	private int health;
	

	public Enemy(int x, int y, Collidable c, String type, int damage, int health) {
		super(x, y, c);
		this.type = type;
		this.damage = damage;
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<100 && health>0) {
			this.health = health;
		}else {
			throw new IllegalArgumentException("morate unijeti validne helte");

		}
		
	}

	@Override
	public String toString() {
		return "Enemy [type=" + type + ", damage=" + damage + ", health=" + health + "]";
	}
	
	@Override
    public String getDisplayName() {
        return type;
    }

	public abstract int attack();


}
