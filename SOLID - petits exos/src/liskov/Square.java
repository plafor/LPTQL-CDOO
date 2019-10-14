package liskov;

class Square extends Rectangle {
	
	public Square(int size) {
		super(size, size);
	}

	public void setWidth(int width) {
		this.width = width;
		height = width;
	}

	public void setHeight(int height) {
		width = height;
		this.height = height;
	}
}