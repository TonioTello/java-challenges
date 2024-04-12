public class Lavadora extends Electrodomestico {

    private static final int CARGA = 5;

    private int carga = CARGA;

    public Lavadora() {
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public int precioFinal() {
        super.precioFinal();

        if (this.carga > 30)
            setPrecio(getPrecio()+50); //Otra forma¿?

        return getPrecio();
    }

    @Override  // es llamado desde electrodomestico.java, por que ?
    public String toString() {
        return super.toString() + "Lavadora{" +
                "carga=" + carga +
                '}';
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
