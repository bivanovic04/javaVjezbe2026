
public class Player extends GameObject {
private String ime;
private int health;
public Player(int x, int y, Collidable c, String ime, int health) {
	super(x, y, c);
	this.ime = ime;
	this.health = health;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	if(ime == null || ime.trim().isEmpty()) {
		throw new IllegalArgumentException("morate unijeti validno ime");
}
	this.ime = ime;
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
public String getDisplayName() {
	return ime;
}

	
}
