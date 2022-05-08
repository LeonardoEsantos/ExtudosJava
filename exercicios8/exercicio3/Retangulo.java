import java.util.Scanner;
public class Retangulo {
  Double base, altura;

  public void mudarBase(Double base) {
    this.base = base;     
  }
  public void mudarAltura(Double altura){
    this.altura = altura;
  }
  public Double retornarBase(){
      System.out.println(base);
      return base;
  }
  public Double retornarAltura() {
    System.out.println(altura);  
    return altura;
  }
  public Double calcularArea(Double base, Double altura){
    Double area;
    area = base*altura;
    return area;
  }

  public Double calcularPerimetro(Double base, Double altura){
    Double perimetro;
    perimetro = 2*(base+altura);
    return perimetro;
  }

public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    Retangulo sala = new Retangulo();

    sala.mudarBase(2.0);
    sala.mudarAltura(4.0);
    sala.retornarBase();
    sala.retornarAltura();

    Double x,y;
    
    System.out.println ("Informe a largura da sala");
    x = leia.nextDouble();
    System.out.println("Informe o comprimento da sala");
    y = leia.nextDouble();

    sala.mudarBase(x);
    sala.mudarAltura(y);

    System.out.println("Serão necessarios "+sala.calcularArea(x,y)+" metros quadrados para o piso");
    System.out.println("Serão necessarios "+sala.calcularPerimetro(x,y)+" metros quadrados de rodapés");
    
    }

}
