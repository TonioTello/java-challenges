public class Electrodomestico {

    private static final int PRECIO =  100;
    private static final String COLOR =  "blanco";
    private static final char CONSUMO =  'F';
    private static final int PESO =  5;

    private int precio;
    private String color;
    private char consumoEnergetico;
    private int peso;

    // Constructor vacio, por defecto
    public Electrodomestico() {
        this.precio = PRECIO;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO;
        this.peso = PESO;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    // Constructor : precio y peso
    public Electrodomestico(int precio, int peso) {
        this.precio = precio;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    // Constructor con todos los atributos
    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    //****************** Metodos ***************************
    private void comprobarConsumoEnergetico(){
        boolean sw;
        if (    consumoEnergetico == 'A' ||
                consumoEnergetico == 'B' ||
                consumoEnergetico == 'C' ||
                consumoEnergetico == 'D' ||
                consumoEnergetico == 'E' ||
                consumoEnergetico == 'F' )
            sw = true;
        else
            sw = false;

        if (sw == false)
            this.consumoEnergetico = 'F';
    }

    private void comprobarColor(){
        boolean sw;
        if (    color.equalsIgnoreCase("blanco") ||
                color.equalsIgnoreCase("negro") ||
                color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris")   )
            sw = true;
        else
            sw = false;

        if (sw==false)
            this.color = "blanco";
    }

    public int precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
            default:
                break;
        }

        if (peso > 0 && peso <= 19) {
            precio += 10;
        } else if (peso >= 20 && peso <= 49) {
            precio += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio += 80;
        } else if (peso >= 80){
            precio += 100;
        } else {
            precio += 0;
        }

        return precio;
    }



    //Metodos setters y getters
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
