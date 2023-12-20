public abstract class ContaBancaria{
    private float depositar;
    private float sacar;
    protected float saldo;

    public float getDepositar() {
        System.out.println("VOCÊ DEPOSITOU: " + depositar);
        return depositar;
    }

    public void setDepositar(float depositar) {
        this.depositar = depositar;
        if (depositar < 0){
            System.out.println("ERRO VALOR INVALIDO");
        }

        else {
            this.saldo += depositar;
        }

    }

    public float getSacar() {
        return sacar;
    }

    public void setSacar(float sacar) {
        this.sacar = sacar;
    }

    public float getSaldo() {
        System.out.println("SEU SALDO É DE: " + saldo);
        return saldo;
    }

}
