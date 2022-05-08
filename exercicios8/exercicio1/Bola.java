package exercicio1;
import java.util.Scanner;
public class Bola {
   String cor = "branco"; 
   Float circunferencia;
   String material;

   public void trocaCor (String cor){

        this.cor = cor;
   }

   public String mostrarCor(){
    System.out.print(cor);
    return cor;
   }

   public static void main(String[] args) {
       
    Bola bola1 = new Bola();
    Scanner leia = new Scanner(System.in);
    String cor;

    bola1.mostrarCor();

    System.out.println();
    System.out.println("Digite a nova cor:");
    cor = leia.next();
    bola1.trocaCor(cor);
    
    System.out.println("NOVA COR");
    bola1.mostrarCor();

   }
}
