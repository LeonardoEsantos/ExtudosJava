import java.util.Scanner;

public class BichinhoVirtualMenu {
    String nome;
    int fome, saude, idade;

    public BichinhoVirtualMenu(String nome, int idade, int fome, int saude) {
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
        BichinhoVirtualMenu bicho1 = new BichinhoVirtualMenu("januario", 2, 50,50);

        Scanner leia = new Scanner(System.in);

        int escolha, alimento, brincar;
        String nome;

        do{
        System.out.println("--MENU--");
        System.out.println("1 - alimentar o bichinho");
        System.out.println("2 - brincar com o bichinho");
        System.out.println("3 - mudar o nome do bichinho");
        System.out.println("4 - verificar humor");
        System.out.println("5 - Encerrar");
        System.out.println("Escolha um item do menu");
        escolha = leia.nextInt();

        switch(escolha){
            case 1:
            System.out.println("O quanto vc quer alimentar o seu bichinho?");
            alimento = leia.nextInt();
            bicho1.alimentar(alimento);
            System.out.println("Statud de fome atual:"+bicho1.retornarFome());
            break;
            
            case 2:
            System.out.println("O quanto vc quer brincar com o seu bichinho?");
            brincar = leia.nextInt();
            bicho1.brincar(brincar);
            System.out.println("Statud de saude atual:"+bicho1.retornarSaude());
            break;

            case 3:
            System.out.println("Qual o novo nome do seu bichinho?");
            nome = leia.next();
            bicho1.alterarNome(nome);
            System.out.println("novo nome:"+bicho1.retornarNome());
            break;

            case 4:
            bicho1.humorBichinho();
            break;

            case 5:
            System.out.println("Até Mais!");
            break;

            case 6:
            System.out.println(bicho1.str());
            bicho1.humorBichinho();
            break;

            default:
            System.out.println("Valor invalido!!!");
            break;
            }

        }while(escolha != 5);
    }    
}
