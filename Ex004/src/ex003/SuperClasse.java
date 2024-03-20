package ex003;

public class SuperClasse {
    private int x;
    private int y;

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
    
    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }
}
