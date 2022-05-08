public class Carro {
    private float consumo;
    private float qtdCombustivel;

    public Carro(float consumo) {
        this.consumo = consumo;
    }

    public void andar(float distancia){
        float gasGasto;
        gasGasto = distancia/this.consumo;
        this.qtdCombustivel = this.qtdCombustivel - gasGasto;
    }

    public float obterGasolina(){
        return this.qtdCombustivel;
    }
    
    public void addCombustivel(float qtdGasAdd){
        this.qtdCombustivel = this.qtdCombustivel + qtdGasAdd;
    }

    public static void main(String[] args) {
        Carro meuFusca = new Carro (5);

        System.out.println(meuFusca.obterGasolina());
        meuFusca.addCombustivel(300);
        System.out.println(meuFusca.obterGasolina());
        meuFusca.andar(100);
        System.out.println(meuFusca.obterGasolina());
    }
}
