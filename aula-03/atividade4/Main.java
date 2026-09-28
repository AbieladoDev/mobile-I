public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        ContaEspecial especial = new ContaEspecial(100);

        conta.sacar(300);    // Saldo insuficiente
        especial.sacar(300); // Permite: saldo fica -200
        especial.sacar(400); // Bloqueia: passaria de -500
    }
}
