
public abstract class GameObject {
private  int x;
private  int y;
private  Collidable c;
public GameObject(int x, int y, Collidable c) {
	super();
	this.x = x;
	this.y = y;
	this.c = c;
	
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

public Collidable getC() {
	return c;
}

public void setC(Collidable c) {
	this.c = c;
}

public abstract String getDisplayName();

public boolean intersect(GameObject other) {
	return false;
}
}
