public class BombaCombustivel {
    String tipoCombustivel;
    Double valorLitro, quantidadeCombustivel;

    public void alterarQuantidadeCombustivel(Double quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void alterarValor(Double valorLitro){
        this.valorLitro = valorLitro;
    }

    public void alterarCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double abastecerPorValor( Double valor){
        Double retorno;
        retorno = valor/valorLitro;
        alterarQuantidadeCombustivel(this.quantidadeCombustivel - retorno);
        return retorno;
    }

    public Double abastecerPorLitro(Double quantidade){
        Double retorno;
        retorno = quantidade * valorLitro;
        alterarQuantidadeCombustivel(this.quantidadeCombustivel - quantidade);
        return retorno;
    }

    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel();
        bomba1.tipoCombustivel = "Gasolina Comum";
        bomba1.valorLitro = 8.0;
        bomba1.quantidadeCombustivel = 100.0;

        bomba1.abastecerPorLitro(10.0);
        System.out.println(bomba1.quantidadeCombustivel);
        bomba1.abastecerPorValor(16.0);
        System.out.println(bomba1.quantidadeCombustivel);
    }

}
