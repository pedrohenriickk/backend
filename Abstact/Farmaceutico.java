public class Farmaceutico extends Funcionario{
 private String crf;

    public Farmaceutico(String crf) {
        this.crf = crf;
    }

    public Farmaceutico(String nome, double salario, String RG, String crf) {
        super(nome, salario, RG);
        this.crf = crf;
    }

    public Farmaceutico() {

    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor + 0.15);
    }
}
