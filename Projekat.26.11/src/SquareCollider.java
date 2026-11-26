
public class SquareCollider implements Collidable {
private int width;
private int height;
public SquareCollider(int width, int height) {
	 if (width <= 0 || height <= 0) {
		 System.out.println("usesite pozitivan broj");
	 }
	this.height = height;
	this.width = width;
	
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

}
