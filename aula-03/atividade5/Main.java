public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 3000.0);
        Gerente gerente = new Gerente("Carlos", 3000.0);

        System.out.println("Bônus de " + funcionario.nome + ": R$ " + funcionario.calcularBonus()); // 300.0
        System.out.println("Bônus de " + gerente.nome + ": R$ " + gerente.calcularBonus());         // 600.0
    }
}
