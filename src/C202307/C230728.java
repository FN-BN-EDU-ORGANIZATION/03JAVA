package C202307;

public class C230728 {
	
	public class Rectangle {
		  private int width;
		  private int height;

		  public Rectangle(int width, int height) {
			    this.width = width;
			    this.height = height;
			  }

			  public int calculatePerimeter() {
			    return (2 * width) + (2 * height);
			  }

			  public int calculateArea() {
			    return width * height;
			  }
	}

}


