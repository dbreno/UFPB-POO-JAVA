package ex003;

public class Personagem extends Objeto {
    
    public Personagem(int x, int y, int width, int height, String name) {
        super(x, y, width, height, name);
    }
    
    @Override
    public int getSize() {
        return 1;
    }
    
    @Override
    public String toString() {
        return getName() + ": " + getX() + "," + getY() + " (Size: " + getSize() + ")";
    }
}
