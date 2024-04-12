import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Referenciar variables
        String nombre, sexoIn;
        int edad, peso;
        char sexo;
        double altura;

        //Referenciar objetos
        Persona persona1;
        Persona persona2;
        Persona persona3;

        Scanner input = new Scanner(System.in);

        //Input info from keyboard
        System.out.println("Ingresar nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresar edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ingresar Sexo. (H hombre, M mujer): ");
        sexoIn = input.nextLine(); //?¿ Obtener solo un caracter por teclado
        sexo = sexoIn.charAt(0);
        System.out.println("Ingresar peso: ");
        peso = Integer.parseInt(input.nextLine());
        System.out.println("Ingresar altura: ");
        altura = Double.parseDouble(input.nextLine());

        //Intanciando Objetos. Persona1 , Persona2, Persona3
        persona1 = new Persona(nombre, edad, sexo, peso, altura);
        persona2 = new Persona(nombre, edad, sexo);
        persona3 = new Persona();

        persona3.setNombre("tonio");
        persona3.setEdad(11);
        persona3.setSexo('H');
        persona3.setPeso(95);
        persona3.setAltura(1.87);

        //Comprobar  el sexo
        persona1.comprobarSexo();
        persona2.comprobarSexo();
        persona3.comprobarSexo();

        //Informacion de peso...
        System.out.println("\n\tPeso ideal o no ideal para cada objeto: \n" );

        if (persona1.calcularIMC()== 1) {
            System.out.println("persona1, " + persona1.getNombre() + " tiene sobrepeso");
        }else if (persona1.calcularIMC()== 0) {
            System.out.println("persona1, " + persona1.getNombre() + " está por debajo de su peso ideal");
        }else {
            System.out.println("persona1, " + persona1.getNombre() + " está en su peso ideal");
        }

        if (persona1.calcularIMC()== 1) {
            System.out.println("persona2, " + persona2.getNombre() + " tiene sobrepeso");
        }else if (persona1.calcularIMC()== 0) {
            System.out.println("persona2, " + persona2.getNombre() + " está por debajo de su peso ideal");
        }else {
            System.out.println("persona2, " + persona2.getNombre() + " está en su peso ideal");
        }

        if (persona1.calcularIMC()== 1) {
            System.out.println("persona3, " + persona3.getNombre() + " tiene sobrepeso");
        }else if (persona1.calcularIMC()== 0) {
            System.out.println("persona3, " + persona3.getNombre() + " está por debajo de su peso ideal");
        }else {
            System.out.println("persona3, " + persona3.getNombre() + " está en su peso ideal");
        }

        //Infomacion mayor de edad...
        System.out.println("\n\tInfomacion mayor de edad... \n" );

        System.out.println("persona1 = " + (persona1.esMayorDeEdad()==true ? "Mayor de edad": "Menor de edad") );
        System.out.println("persona2 = " + (persona2.esMayorDeEdad()==true ? "Mayor de edad": "Menor de edad") );
        System.out.println("persona3 = " + (persona3.esMayorDeEdad()==true ? "Mayor de edad": "Menor de edad") );

        //Infomacion de cada Objeto...
        System.out.println("\n\tInfomacion de cada Objeto... \n" );

        //objeto 1.
        System.out.println("persona1 = " + persona1.getNombre() + "-" + persona1.getEdad() + "-" + persona1.getDNI() +
                "-" + persona1.getSexo() + "-" + persona1.getPeso() + "-" + persona1.getAltura()) ;
        //objeto 2.
        System.out.println("persona2 = " + persona2.getNombre() + "-" + persona2.getEdad() + "-" + persona2.getDNI() +
                "-" + persona2.getSexo() + "-" + persona2.getPeso() + "-" + persona2.getAltura()) ;
        //objeto 3.
        System.out.println("persona3 = " + persona3.getNombre() + "-" + persona3.getEdad() + "-" + persona3.getDNI() +
                "-" + persona3.getSexo() + "-" + persona3.getPeso() + "-" + persona3.getAltura()) ;

    }
}
