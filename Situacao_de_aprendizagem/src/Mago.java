public class Mago extends Personagem {
    public Mago() {
    }

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void lancarMagia() {

    }

    public void atacar(int ataque) {
        ataque = ataque * 3;
    }

    public void defesa(int defesa){
        System.out.println("Seu mago foi atacado!");
        defesa = defesa / 2;
    }






}
