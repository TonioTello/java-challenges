import java.util.Scanner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    static final double PI = 3.1416;

    public static void main(String[] args) {

        int opc = 1;
        char salir;
        Scanner input = new Scanner(System.in);

        System.out.println("\n\tEjecicios  del 1 al 15, del taller de Java");

        do {
            System.out.println("\n\nIngrese el numero correspondiente al ejercicio.");
            System.out.println("Las opciones disponible van desde el 1 al 15. ");
            System.out.print("Ingrese numero: ");
            opc = ingresar_numero();

            switch (opc){
                case 1: case 2:
                    numeroUnoDos();
                    break;
                case 3:
                    numeroTres();
                    break;
                case 4:
                    numeroCuatro();
                    break;
                case 5:
                    numeroCico();
                    break;
                case 6:
                    numeroSeis();
                    break;
                case 7:
                    numeroSiete();
                    break;
                case 8:
                    numeroOcho();
                    break;
                case 9:
                    numeroNueve();
                    break;
                case 10:
                    numeroDiez();
                    break;
                case 11:
                    numeroOnce();
                    break;
                case 12:
                    numeroDoce();
                    break;
                case 13:
                    numeroTrece();
                    break;
                case 14:
                    numeroCatorce();
                    break;
                case 15:
                    numeroQuince();
                    break;
                default:
                    System.out.println("\nErro: el numero no esta en la lista de ejercicios.\n");
                    break;

            }

            System.out.printf("\nIngrese el numero cero para salir o cualquier tecla para continuar...");
            salir = input.nextLine().charAt(0);
            if (salir == '0') {
                opc = 0;
            }


        }while (opc != 0);

        System.out.printf("\n\n...Salistes del programa....\n\n\n");

    }

    static int  ingresar_numero() {
        int num = 0, sw = 1;
        Scanner input = new Scanner(System.in);
        do {
            try {
                num = Integer.parseInt(input.nextLine());
                sw = 0; //salir ciclo
            }
            catch (NumberFormatException ex){
                System.out.println(String.format("Por favor ingrese solo numero. %s Error %s", ex,  "Numero" ));
                //System.out.printf("Por favor ingrese solo numero. %s Error %s", ex,  "Numero" );
            }
            System.out.println();
        }while (sw == 1 );
        return num;

    }

    static void numeroUnoDos(){
        int  num1, num2;

        System.out.println("\tEjercicio numero 1 y 2.\n");

        System.out.println("Ingrese numero uno: ");
        num1 = ingresar_numero();

        System.out.println("Ingrese numero dos: ");
        num2 = ingresar_numero();

        System.out.println("Ingreso el numero1 = " + num1 + " y el numero2 = " + num2 );

        System.out.println();

        if (num1 == num2){
            System.out.println("Los numero son iguales");
        }
        else if (num1 > num2) {
            System.out.println("numero1 es mayor que numero2");
        }
        else {
            System.out.println("numero2 es mayor que numero1");
        }

        System.out.printf("\n");
    }

    static void numeroTres(){
        int radio;
        double area;

        System.out.println("\tEjercicio numero 3...\n");
        System.out.println("Ingrese Area del Circulo: ");
        radio = ingresar_numero();

        area = PI*(Math.pow(radio,2));

        System.out.println("El area del circulo de radio " + radio + " es = " + area );
    }


//Cambio 1 git

    static void numeroCuatro(){
        double precioProducto, precioProductoIVA;

        System.out.println("\tEjercicio numero 4...\n");
        System.out.println("Ingrese el precio del producto para aplicarle el iva del 21%: ");
        precioProducto = ingresar_numero();
        //pproductIVA =  (double)(1 + 21/100);

        precioProductoIVA =  precioProducto*( 1+(double) 21/100);

        System.out.println("El precio sin iva es " + precioProducto + " y con iva es " + precioProductoIVA);
    }

    //Cambio 2

    //Cambio 3

}


