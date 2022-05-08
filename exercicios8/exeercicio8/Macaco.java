public class Macaco {
    String nome;
    int livre = 0;
   String [] bucho = new String[10];

    public void comer(String alimento){
        if(livre < 10){
            bucho[livre] = alimento;
            livre++;
        }else{
            System.out.println ("Macado de bucho cheio!!!");
        }
    }

    public String verBucho(){
        System.out.println("Bucho de "+nome);
        for (int i = 0; i < 10; i++){
            System.out.println(bucho[i]);
        }
        return " ";
    }

    public void digerir(){
        for (int i = 0; i < 10; i++){
            bucho[i] = " ";
        }  
    }

    public static void main(String[] args) {
        Macaco macaco1 = new Macaco();
        
        macaco1.nome = "durval";
        macaco1.comer("banana");
        macaco1.comer("melão");

        macaco1.verBucho();

        Macaco macaco2 = new Macaco();

        macaco2.nome = "haryel";
        macaco2.comer(macaco1.nome);

        macaco2.verBucho();
    }

}
