public class Point {
  private int x;
  private int y;

  one argument constructor
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // zero argument constructor 
  public Point() {
    this(0,0);
  }
  // returns the value of the x-coordinate as an integer
  public int getX() {
    return this.x;
  }

  // returns the value of the y-coordinate
  public int get_y() {
    return this.y;
  }

  // translates the point by specified amounts
  public void translate(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }
}
  
