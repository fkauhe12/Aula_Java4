public class Conta {
    int numero;
    String nometitular;
    double saldo;
    //Método construtor
    public void ImprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Nome do titular: " + this.nometitular);
        System.out.println("Saldo: " + this.saldo);
    }

    public void Depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso!");
        System.out.println("Novo saldo: " + this.saldo + " titular " + this.nometitular);
    }
    public void Sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: " + this.saldo + " titular " + this.nometitular);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "!");
        }
    }

    public void Transferir(double valor, Conta destino) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            destino.Depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso!");
            System.out.println("Novo saldo: " + this.saldo + " titular " + this.nometitular);
    }else {
            System.out.println("Saldo insuficiente para transferência de " + valor + "!");
        }
    }
}
