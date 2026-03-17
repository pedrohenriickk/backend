public class Arqueiro extends Personagem {

    public Arqueiro() {
    }

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void atacar(int ataque) {
        ataque = ataque * 3;
    }

    public void defender(int defesa) {
        defesa = defesa / 2;
    }

    public void receberDano(int defesa) {
        System.out.println("Seu arqueiro foi atacado");
        super.receberDano(defesa);
    }



    public void disparoPreciso() {

    }
}


