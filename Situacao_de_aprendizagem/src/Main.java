//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mago mago = new Mago("Valdemort", 20,20,20);
        mago.mostrarStatus();

        Arqueiro arqueiro = new Arqueiro("Merida", 100, 20, 20);
        arqueiro.mostrarStatus();

        Guerreiro guerreiro = new Guerreiro("Kratos", 80, 20, 20);
        guerreiro.mostrarStatus();
;
        arqueiro.receberDano(mago.atacar());








    }
}