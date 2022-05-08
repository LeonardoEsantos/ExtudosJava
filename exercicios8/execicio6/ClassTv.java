public class ClassTv {
    int canal, volume;

    public void mudarCanal(int canal){
        if (canal <= 10){
            this.canal = canal;
            System.out.println("Canal atual: "+canal);
        }else{
            System.out.println("Numero de canal invalido!!!");
        }
    }
        public void mudarVolume(int volume){
            if (volume <= 100){
                this.volume = volume;
                System.out.println("Volume atual: "+canal);
            }else{
                System.out.println("Numero de volume invalido!!!");
            }
        }

        public static void main(String[] args) {
            
            ClassTv tv1 = new ClassTv();

            tv1.canal = 2;
            tv1.volume = 30;

            System.out.println("Canal: "+tv1.canal+"; volume:"+tv1.volume);

            tv1.mudarCanal(13);
            tv1.mudarVolume(45);

            System.out.println("Canal: "+tv1.canal+"; volume:"+tv1.volume);
        }
    }