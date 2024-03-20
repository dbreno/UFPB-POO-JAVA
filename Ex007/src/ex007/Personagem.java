package ex007;

public class Personagem extends Objeto implements Speaker  {

	protected String name;

	public Personagem(String name, int x, int y) {
		super(x, y);
		this.name = name;
	}

	public String toString() {
		return name + ": " + x + "," + y;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return 1;
	}

        @Override
        public void speak() {
            System.out.print(" falou: \"Ola, eu me chamo " + getName() + "\"");
            System.out.println("");
        }

}
