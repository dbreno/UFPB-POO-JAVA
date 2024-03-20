package ex007;

public class Mensagem implements Speaker {

    
    @Override
    public void speak() {
        System.out.print("falou: Nova mensagem!");
        System.out.println("");
    }
    
}
