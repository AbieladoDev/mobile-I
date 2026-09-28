public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 2.50, 10);
        Produto produto2 = new Produto("Caderno", 15.90, 3);

        System.out.println(produto1.nome + ": R$ " + produto1.valorTotal());
        System.out.println(produto2.nome + ": R$ " + produto2.valorTotal());
    }
}
