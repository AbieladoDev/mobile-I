public class ContaBancaria {
    public double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente! Saldo atual: R$ " + saldo);
        }
    }
}
