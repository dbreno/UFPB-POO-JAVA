package ex003;

public class Objeto {
    private int x;
    private int y;
    private String name;
    private int width;
    private int height;
    
    public Objeto (int x, int y, int width, int height, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
        
    }
    
    public int getSize() {
        return 0;
    }

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
    
    protected String getName() {
        return name;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected int getWidth() {
        return width;
    }
    
    protected void setWidth(int width) {
        this.width = width;
    }
    
    protected int getHeight() {
        return height;
    }
    
    protected void setHeight(int height) {
        this.height = height;
    }
    
}
