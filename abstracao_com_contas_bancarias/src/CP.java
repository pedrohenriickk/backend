public class CP extends Conta {
    public CP(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public CP() {
    }

    @Override
    public void calcularTarifaMensal() {

        setSaldo(getSaldo());
        IO.println("Seu saldo é: " + exibirSaldo());

    }
}
