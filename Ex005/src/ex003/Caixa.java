package ex003;

public class Caixa extends Objeto {

    //Construtor
    public Caixa (int x, int y, int width, int height, String name) {
        super(x, y, width, height, name);
    }
    
    @Override
    public int getSize() {
        return getWidth() * getHeight();
    }
    
    @Override
    public String toString() {
        return getX() + "," + getY() + " " + getWidth() + "x" + getHeight() + " (Size: " + getSize() + ")";
    }
}
