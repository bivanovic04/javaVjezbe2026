// projekat radili Boris Ivanovic 23/056 i  Shehid Bisha 23/006
public class Player {
private String name;
private int x;
private int y;
private int width;
private int height;
private int health;

public Player(String name, int x, int y, int width, int height, int health) {
	this.name = name;
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.health = health;
}

public String getName() {
	return name;
}

public void setName(String name) {
	if(name == null || name.trim().isEmpty()) {
		System.out.println("Uneseno ime nije validno");
	}
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}
@Override
          public String toString() {
	return "Player[" + name + "] @ (" + x + " , " + y + ")" + width + "x" + height + "HP=" + health;
}
}
