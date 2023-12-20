public class ContaPoupanca extends ContaBancaria{
    @Override
    public void setSacar(float sacar) {
        super.setSacar(sacar);
        if (sacar == 0){
            System.out.println("Valor Inválido");
        }
        else {
            sacar += 0;
            saldo -= sacar;
        }
    }
}

