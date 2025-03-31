public class App {
    public static void main(String[] args) {
        //Criar Objeto Conta
        Conta minhaConta = new Conta(30, "Felipe");
        Conta outraConta = new Conta(20, "Samuel");

        //Imprimir os valores dos atributos
        minhaConta.Depositar(1000);
        System.out.println("\n");

        outraConta.Depositar(5000);
        System.out.println("\n");

        minhaConta.Sacar(200);
        System.out.println("\n");

        minhaConta.Transferir(900, outraConta);
        System.out.println("\n");

        minhaConta.ImprimirExtrato();
        System.out.println("\n");
        
        outraConta.ImprimirExtrato();

    }
}
