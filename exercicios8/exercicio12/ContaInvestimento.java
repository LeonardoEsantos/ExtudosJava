public class ContaInvestimento extends ContaBancaria {
    Double taxaJuros;
       
    public ContaInvestimento (String nConta, String nome, Double saldo, Double taxaJuros){
        super(nConta,nome,saldo);
        this.taxaJuros = taxaJuros;
    }

    public void addJuros(){
        this.saldo = this.saldo + (this.saldo * this.taxaJuros/100);
    }

    public static void main(String[] args) {
        ContaInvestimento contaInvest1 = new ContaInvestimento("12345", "leo", 1000.0, 10.0);
        System.out.println(contaInvest1.saldo);
        contaInvest1.addJuros();
        contaInvest1.addJuros();
        contaInvest1.addJuros();
        contaInvest1.addJuros();
        contaInvest1.addJuros();
        System.out.println(contaInvest1.saldo);
        contaInvest1.sacar(600.50);
        System.out.println(contaInvest1.saldo);
        
    }
    }