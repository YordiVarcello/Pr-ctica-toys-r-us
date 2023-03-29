package objectes;

public class Rectangle {
    private int x;
    private int y;
    private int alt;
    private int ample;

    public Rectangle(int x, int y, int alt, int ample) {
        this.x = x;
        this.y = y;
        this.alt = alt;
        this.ample = ample;
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

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getAmple() {
        return ample;
    }

    public void setAmple(int ample) {
        this.ample = ample;
    }

    public int area() {
        return alt * ample;
    }

    public int perimetre() {
        return 2 * alt + 2 * ample;
    }
}
