public class App {
    public static void main(String[] args) {
        //Criar Objeto Conta
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        //Atribuir valores aos atributos
        minhaConta.numero = 30;
        minhaConta.nometitular = "Felipe";
        minhaConta.saldo = 1000;

        outraConta.numero = 40;
        outraConta.nometitular = "Ana";
        outraConta.saldo = 2000;

        //Imprimir os valores dos atributos
        minhaConta.Depositar(800);
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
