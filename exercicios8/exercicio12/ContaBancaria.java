public class ContaBancaria {
    String nConta, nome;
    Double saldo;

    public ContaBancaria(String nConta, String nome, Double saldo){
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }
    
    public Double depositar (Double valor){

        return this.saldo = saldo + valor;
        
    }

    public Double sacar (Double valor){

        return this.saldo = saldo - valor;
        
    }
}

    
