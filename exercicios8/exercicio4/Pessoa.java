import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    Float peso, altura;

    public int Envelhecer(int idadeAtual, int anosEnv){
        int idadeFinal;
        if (idadeAtual < 21){
            idadeFinal = idadeAtual+anosEnv;
            altura = altura+0.05f;
        }else{
            idadeFinal = idadeAtual+anosEnv;
        }
        return idadeFinal;
    }

    public Float Engordar (Float pesoAtual, Float pesoGanho){
        Float pesoFinal;
        
        pesoFinal = pesoAtual + pesoGanho;
        return pesoFinal;
    }

    public Float Emagrecer (Float pesoAtual, Float pesoPerdido){
        Float pesoFinal;
        
        pesoFinal = pesoAtual + pesoPerdido;
        return pesoFinal;
    }

    public Float Crescer (Float alturaAtual, Float alturaGanha){
        Float alturaFinal;

        alturaFinal = alturaAtual + alturaGanha;
        return alturaFinal;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        int anosEnv;
        Float pesoGanho, alturaGanha;

        System.out.println("Informe o nome:");
        p1.nome = leia.next();

        System.out.println("Informe a idade:");
        p1.idade = leia.nextInt();

        System.out.println("Informe o peso:");
        p1.peso = leia.nextFloat();

        System.out.println("Informe a altura:");
        p1.altura = leia.nextFloat();

        System.out.println("nome:"+p1.nome);
        System.out.println("idade:"+p1.idade);
        System.out.println("peso:"+p1.peso);
        System.out.println("altura:"+p1.altura);

        System.out.println("Envelhecer quantos anos?");
        anosEnv = leia.nextInt();
        System.out.println("Engordou quantos quilos?");
        pesoGanho = leia.nextFloat();
        System.out.println("Cresceu quantos metros?");
        alturaGanha = leia.nextFloat();

        p1.Envelhecer(p1.idade,anosEnv);
        p1.Engordar(p1.peso, pesoGanho);
        p1.Crescer(p1.altura, alturaGanha);

        System.out.println("nome:"+p1.nome);
        System.out.println("idade:"+p1.idade);
        System.out.println("peso:"+p1.peso);
        System.out.println("altura:"+p1.altura);
       
    }

}
