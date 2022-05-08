import java.util.Scanner;

public class FazendaVirtual {
    String nome;
    int fome, saude, idade;

    public FazendaVirtual(String nome, int idade, int fome, int saude) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.saude = saude;
    }

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

    public int alimentar(int quantidade) {
        
        this.fome = this.fome + (this.fome*quantidade/100);
        return 0;
    }

    public int brincar(int quantidade) {
        
        this.saude = this.saude + (this.saude*quantidade/100);
        return 0;
    }

    public String humorBichinho () {
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
        return " ";
    }

    public String str(){
        return "Nome: "+nome+", idade: "+idade+", Fome: "+fome+", Saude: "+saude+".";
    }
    

    public static void main(String[] args) {
        FazendaVirtual bicho1 = new FazendaVirtual("januario", 2, 50,50);
        FazendaVirtual bicho2 = new FazendaVirtual("arnaldo", 2, 50,50);
        FazendaVirtual bicho3 = new FazendaVirtual("margarida", 2, 50,50);
        FazendaVirtual bicho4 = new FazendaVirtual("tita", 2, 50,50);
        FazendaVirtual bicho5 = new FazendaVirtual("flufli", 2, 50,50);

        Scanner leia = new Scanner(System.in);

        int escolha, alimento, brincar;
        String nome;
        FazendaVirtual [] fazenda;

        fazenda = new FazendaVirtual[5];

        fazenda[0] = bicho1;
        fazenda[1] = bicho2;
        fazenda[2] = bicho3;
        fazenda[3] = bicho4;
        fazenda[4] = bicho5;

        do{
        System.out.println();
        System.out.println("--MENU--");
        System.out.println("1 - alimentar todos os bichinhos");
        System.out.println("2 - brincar com todos os bichinhos");
        System.out.println("3 - verificar status de todos os bichinhos");
        System.out.println("4 - Encerrar");
        System.out.println();
        System.out.println("Escolha um item do menu");
        escolha = leia.nextInt();

        switch(escolha){
            case 1:
            System.out.println("O quanto vc quer alimentar os seus bichinhos?");
            alimento = leia.nextInt();
            for(int i = 0; i < fazenda.length; i++){
            fazenda[i].alimentar(alimento);
            }
            break;
            
            case 2:
            System.out.println("O quanto vc quer brincar com o seu bichinho?");
            brincar = leia.nextInt();
            for(int i = 0; i < fazenda.length; i++){
            fazenda[i].brincar(brincar);
            }
            break;

            case 3:
            for(int i = 0; i < fazenda.length; i++){
            System.out.println(fazenda[i].str());
            fazenda[i].humorBichinho();
            }
            break;

            case 4:
            System.out.println("Até Mais!");
            break;          

            default:
            System.out.println("Valor invalido!!!");
            break;
            }

        }while(escolha != 5);
    }    
}