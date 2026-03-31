public class CC extends Conta{
    public CC(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public CC() {
    }

    @Override
    public void calcularTarifaMensal() {

        setSaldo(getSaldo() - 12);


        IO.println("Após o pagamento da tarifa seu saldo atual é: " + exibirSaldo());


    }
}


