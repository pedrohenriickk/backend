package ex1;

public class cachorro {

    public String nome;
    public int idade;
    public String sexo;
    public String raca;

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }

    public cachorro(String nome, int idade, String sexo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;

    }

}
