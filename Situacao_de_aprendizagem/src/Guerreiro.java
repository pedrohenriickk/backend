public class Guerreiro extends Personagem{
    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void atacar(int ataque) {
        ataque = ataque * 2;
    }

    public void defender(int defesa) {
        System.out.println("Seu guerreiro foi atacado");
        defesa = defesa / 2;
    }

    public void golpePesado(){

    }




}
