package exercicio2;
import java.util.Scanner;

public class Quadrado {
    double lado;

    public void mudarLado(double lado) {
        this.lado = lado;
    }

    public double area(Double ld) {
        ld = ld*ld;
        System.out.println(ld);

        return ld;
    }

    public static void main (String[] args){

        Quadrado quadrado1 = new Quadrado();
        Scanner leia = new Scanner(System.in);
        double ladoq;

        System.out.println("Informe o tamanho do lado: ");
        ladoq = leia.nextDouble();
        quadrado1.mudarLado(ladoq);

        System.out.println(quadrado1.lado);

        System.out.println("Area do quadrado");
        quadrado1.area(ladoq);
    }
}
