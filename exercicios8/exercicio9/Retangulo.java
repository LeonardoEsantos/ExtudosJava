public class Retangulo{
    Double largura,altura;

    public Double centroRetangulo(Double largura, Double altura) {
        Double centro;

        centro = (largura+altura)/2;
        return centro;
    }

    public static void main(String[] args) {
        Retangulo rt1 = new Retangulo();
        Ponto pt1 = new Ponto();

        pt1.x = 2.0;
        pt1.y = 4.0;
        rt1.largura = pt1.x;
        rt1.altura = pt1.y;

        System.out.println("Centro: "+rt1.centroRetangulo(rt1.largura, rt1.altura));
    }
}

