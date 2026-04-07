//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pix pix = new Pix();
    CC cc = new CC();
    Boleto boleto = new Boleto();

    IO.println("==========");
    IO.println("Metódo Boleto Bancário");
    boleto.pagar();

    IO.println("==========");
    IO.println("Metódo Cartão de credito");
    cc.pagar();

    IO.println("==========");
    IO.println("Método PIX");
    pix.pagar();

}


