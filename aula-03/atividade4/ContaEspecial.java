public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= -500) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo: R$ " + saldo);
        } else {
            System.out.println("Limite excedido! Saldo atual: R$ " + saldo);
        }
    }
}
