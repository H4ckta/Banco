public class ContaCorrente extends ContaBancaria{

    private int taxaDeSaque = 10;

    @Override
    public void setSacar(float sacar) {
        super.setSacar(sacar);
        if (sacar == 0){
            System.out.println("Valor inválido");
        }
        else {
            sacar += taxaDeSaque;
            saldo -= sacar;
        }
    }
}

