public class BikeTester {
    
    public static void main(String[] args) {
        
        // declarar classe e instanciar o objeto
        Bike bike = new Bike("azul");

        bike.andar();
        bike.frear();

        bike.aumentarMarcha();
        bike.andar();
        bike.aumentarMarcha();
        bike.andar();
        bike.aumentarMarcha();
        bike.andar();
        bike.aumentarMarcha();
        bike.andar();
        bike.aumentarMarcha();    
        bike.aumentarMarcha();
        bike.aumentarMarcha();
        bike.andar();

        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.diminuirMarcha();
        bike.andar();

        System.out.println(bike.getCor());

        //pintar a bike
        bike.setCor("preta");
        System.out.println(bike.getCor());
    }
}
