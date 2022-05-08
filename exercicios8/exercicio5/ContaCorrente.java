public class ContaCorrente {
    String nConta, nome;
    Double saldo;

    public void alterarNome(String nome){
        this.nome = nome;
    }
    
    public Double depositar (Double valor){

        return this.saldo = saldo + valor;
        
    }

    public Double sacar (Double valor){

        return this.saldo = saldo - valor;
        
    }

    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();

        conta1.nome = "leonardo";
        conta1.nConta = "123456789";
        conta1.saldo = 0.0;

        System.out.println(conta1.nome+" "+conta1.nConta+" "+conta1.saldo);

        conta1.alterarNome("leonardo Santos");
        conta1.depositar(150.0);
        conta1.sacar(50.0);

        System.out.println(conta1.nome+" "+conta1.nConta+" "+conta1.saldo);
    }
}
