open class ContaBancaria(saldoInicial: Double) {
    // Pode ser lido de fora, mas só alterado dentro da classe (ou das filhas)
    var saldo: Double = saldoInicial
        protected set

    open fun sacar(valor: Double) {
        if (saldo - valor >= 0) {
            saldo -= valor
            println("Saque de R$ $valor realizado. Saldo: R$ $saldo")
        } else {
            println("Saldo insuficiente! Saldo atual: R$ $saldo")
        }
    }
}

class ContaEspecial(saldoInicial: Double) : ContaBancaria(saldoInicial) {
    override fun sacar(valor: Double) {
        if (saldo - valor >= -500) {
            saldo -= valor
            println("Saque de R$ $valor realizado. Saldo: R$ $saldo")
        } else {
            println("Limite excedido! Saldo atual: R$ $saldo")
        }
    }
}

fun main() {
    val conta = ContaBancaria(100.0)
    val especial = ContaEspecial(100.0)

    conta.sacar(300.0)    // Saldo insuficiente
    especial.sacar(300.0) // Saldo fica -200
    especial.sacar(400.0) // Bloqueia: passaria de -500

    println("Saldo final da conta especial: R$ ${especial.saldo}")
    // especial.saldo = 1000.0  // ERRO: o setter não é público
}
