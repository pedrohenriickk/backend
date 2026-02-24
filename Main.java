package gettersEsetters;

public class Main {
    static void main(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        IO.println(funcionario.getNome());
        funcionario.setSalario(850);
        IO.println(funcionario.getSalario());
        funcionario.setCargo("Analista de Dados");
        IO.println(funcionario.getCargo());
        
    }
}
