public class PJ extends Conta{


    public PJ(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public PJ() {
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 1.50);
        IO.println("Seu saldo após a adição da taxa é de: " + exibirSaldo());
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 20);
        IO.println("Após o pagamento da tarifa seu saldo atual é: " + exibirSaldo());


    }
}

