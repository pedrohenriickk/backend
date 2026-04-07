public class Boleto extends Pagamento {


    @Override
    public void pagar() {
        IO.println("Seu pagamento será realizado em 3 dias.");
    }
}


