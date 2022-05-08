public class BichinhoVirtual {
    String nome;
    int fome, saude, idade;

    public void alterarNome(String nome) {
        this.nome = nome;
    }
    public String retornarNome() {
        return nome;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }
    public int retornarIdade() {
        return idade;
    }
    public void alterarFome(int fome) {
        this.fome = fome;
    }
    public int retornarFome() {
        return fome;
    }
    public void alterarSaude(int saude) {
        this.saude = saude;
    }
    public int retornarSaude() {
        return saude;
    }

    public void humorBichinho () {
        if (fome <=100 && fome >= 75 || saude <= 100 && saude >=75 ){
            System.out.println(nome+" esta feliz da vida ^-^");
        }else if (fome <70 && fome >= 45 || saude <70 && saude >=45){
            System.out.println(nome+" esta bem bem :)");
        }else if (fome < 45 && fome >= 20 || saude < 45 && saude >=20){
            System.out.println(nome+" não está se sentindo bem");
        }else if(fome < 20 || saude <20){
            System.out.println(nome+" esta precisando urgentemente de cuidados");
        }else{
            System.out.println("Valor invalido!!! (somente é valido 0 - 100)");
        }
        
    }

    public static void main(String[] args) {
        BichinhoVirtual bicho1 = new BichinhoVirtual();

        bicho1.alterarNome("januario");
        bicho1.alterarIdade(2);
        bicho1.alterarFome(90);
        bicho1.alterarSaude(80);

        System.out.println(bicho1.retornarNome()+"-"+bicho1.retornarIdade()+"-"+bicho1.retornarFome()+"-"+bicho1.retornarSaude());
        bicho1.humorBichinho();
    }
    }
