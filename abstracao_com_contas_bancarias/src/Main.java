//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CC cc = new CC();
    PJ pj = new PJ();
    CP cp = new CP();

    cc.setSaldo(2000);
    pj.setSaldo(1500);
    cp.setSaldo(3000);


    cc.calcularTarifaMensal();
    cc.sacar(1000);
    cc.exibirSaldo();

    pj.calcularTarifaMensal();
    pj.sacar(1000);
    pj.exibirSaldo();

    cp.calcularTarifaMensal();
    cp.sacar(1000);
    cp.exibirSaldo();






















}