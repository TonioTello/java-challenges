public class Main {
    public static void main(String[] args) {

        int precioFinalLavadora = 0;
        int precioFinalTelevision = 0;
        int precioFinalElectrodomestico = 0;

        Electrodomestico electrodomesticos [] = new Electrodomestico[10] ;

        electrodomesticos[0] = new Electrodomestico(30, "negrOl", 'v', 90);
        electrodomesticos[1] = new Lavadora(70, "gris", 'C', 10, 35);
        electrodomesticos[2] = new Television(50, "azul", 'v', 90, 20, true);
        electrodomesticos[3] = new Electrodomestico(50, "blanco", 'v', 90);
        electrodomesticos[4] = new Lavadora(20, "azul", 'v', 90, 30);
        electrodomesticos[5] = new Electrodomestico(50, "negrOl", 'A', 90);
        electrodomesticos[6] = new Television(10, "blanco", 'v', 90, 15, false);
        electrodomesticos[7] = new Electrodomestico(50, "negrOl", 'B', 90);
        electrodomesticos[8] = new Television(50, "negrOl", 'v', 90, 45, true);
        electrodomesticos[9] = new Electrodomestico(50, "gris", 'D', 90);

        //Electrodomestico e1 = new Electrodomestico(50, "negrOl", 'v', 90);
        //Lavadora lavadora1 = new Lavadora(70, "gris", 'C', 10, 35);

        for (int n =0; n < electrodomesticos.length; n++) {

            if (electrodomesticos[n] instanceof Lavadora ){
                precioFinalLavadora += electrodomesticos[n].precioFinal();
            }else if (electrodomesticos[n] instanceof Television ){
                precioFinalTelevision += electrodomesticos[n].precioFinal();

            }else if (electrodomesticos[n] instanceof Electrodomestico ){
                precioFinalElectrodomestico += electrodomesticos[n].precioFinal();
            }
            System.out.println("electrodomesticos [" + n + "] = " + electrodomesticos[n]);
        }

        System.out.println("\nprecioFinalLavadora = " + precioFinalLavadora);
        System.out.println("precioFinalTelevision = " + precioFinalTelevision);
        System.out.println("precioFinalElectrodomestico = " + (precioFinalElectrodomestico + precioFinalLavadora + precioFinalTelevision ));


    }
}
