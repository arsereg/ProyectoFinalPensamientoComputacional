

public class Main {

    private static String[] tarjetas = Cards.numerosDeTarjeta;
    private static String[] pines = Cards.pines;



    public static void main(String[] args) {

        for(int i = 0; i < tarjetas.length; i++){
            System.out.println("-----------------");
            System.out.println("Tarjeta: " + tarjetas[i]);
            System.out.println("Pin: " + pines[i]);
            System.out.println("-----------------");
        }

    }

   
}