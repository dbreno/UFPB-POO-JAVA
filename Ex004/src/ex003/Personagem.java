package ex003;

public class Personagem extends SuperClasse {
    private String name;
    public String toString() {
        return name + ": " + getX() + "," + getY();
    }
}
