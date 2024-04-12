public class Persona<iter> {

    //Atributos de la clase Persona

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private int peso;
    private double altura;

    //Constructor por defecto
    Persona(){
        this.nombre = "" ;
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0 ;
        this.generaDNI();
    }

    //Constructor con los algunos parametros
    Persona( String nombre, int edad, char sexo ){
        this.nombre = nombre ;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0 ;
        this.generaDNI();
    }

    //Constructor con todos los parametros
    Persona( String nombre, int edad, char sexo, int peso, double altura ){
        this.nombre = nombre ;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura ;
        this.generaDNI();
    }

    //  ****************Metodos*********************
    public int calcularIMC( ){
        double formula;
        formula = this.peso /( Math.pow(this.altura,2));
        if (formula < 20)
            return -1;
        else if (formula >=20 && formula <=25)
            return 0;
        else
            return 1;
    }

    // Metodo mayor de edad
    public boolean esMayorDeEdad(){
        if (this.edad >= 18)
            return true;
        else
            return false;
    }

    // Metodo Comprobar sexo
    public  void comprobarSexo(){
        if (this.sexo != 'H' || this.sexo != 'F')
            this.sexo = 'H';
    }

    // Metodo Informacion del objeto
    public void toStringInfo(){

        System.out.println("*****Informacion completa de la Persona*****\n");
        System.out.println("nombre = " + this.nombre);
        System.out.println("edad = " + this.edad);
        System.out.println("DNI = " + this.DNI);
        System.out.println("sexo = " + this.sexo);
        System.out.println("peso = " + this.peso);
        System.out.println("altura = " + this.altura);
    }



   // Metodo Generar numero aleatorio de 8 cifras
   public  void generaDNI(){
        //Creacion de variables
        int randonNum, dni, letraPosicion;
        String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";

        randonNum = (int)(100000000 * Math.random());
        letraPosicion = (int)(100000000 * Math.random())% 23;
        //System.out.println("DNI = " + randonNum + "-" + (secuenciaLetrasNIF.charAt(letraPosicion)));
        this.DNI = "" + randonNum + (secuenciaLetrasNIF.charAt(letraPosicion));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
