package obj;

public class Scene {
        public Objeto[] createScene() {
        return new Objeto[] {
            new Personagem("Frodo", 1, 1),
            new Personagem("Bilbo", 2, 1),
            new Caixa(1, 2, 1, 1),
            new Item("Anel", 3, 1)
        };
    }
}
