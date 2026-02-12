package ex1;

public class gato {
    public String nome;
    public int idade;
    public String sexo;
    public String raca;

    public gato(String nome, int idade, String sexo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca; }

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
