public class Personagem  {
    private String nome;
    private int vida = 100;
    private int ataque = 10;
    private int defesa = 5;

   public Personagem() {

   }

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int atacar() {
        return ataque;
    }

    public void receberDano(int dano) {
        vida = vida - dano;
        System.out.println("Sua vida atual é: " + vida);

    }

    public void mostrarStatus() {
        System.out.println("A vida é: " + vida + "O ataque é: " + ataque + "A defesa é " + defesa);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
