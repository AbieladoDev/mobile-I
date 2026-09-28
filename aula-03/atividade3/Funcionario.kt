open class Funcionario(var nome: String, var salario: Double) {
    open fun calcularBonus(): Double {
        return salario * 0.10
    }
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {
    override fun calcularBonus(): Double {
        return salario * 0.20
    }
}

fun main() {
    val funcionario = Funcionario("Ana", 3000.0)
    val gerente = Gerente("Carlos", 3000.0)

    println("Bônus de ${funcionario.nome}: R$ ${funcionario.calcularBonus()}") // 300.0
    println("Bônus de ${gerente.nome}: R$ ${gerente.calcularBonus()}")         // 600.0
}
