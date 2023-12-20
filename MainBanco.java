public class MainBanco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setDepositar(200);
        contaCorrente.setSacar(1);
        contaCorrente.getSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setDepositar(200);
        contaPoupanca.setSacar(1);
        contaPoupanca.getSaldo();
    }
}
