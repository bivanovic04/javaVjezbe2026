
public class RectangleCollider implements Collidable {
private int width;
private int height;
public RectangleCollider(int width, int height) {
	 if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("morate unijeti pozitivan broj");
	 }
	this.width = width;
	this.height = height;
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
@Override
public String toString() {
	return "RectangleCollider [width=" + width + ", height=" + height + "]";
}

}
