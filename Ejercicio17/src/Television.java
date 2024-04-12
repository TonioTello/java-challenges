public class Television extends Electrodomestico {

    private static final int RESOLUCION = 20;
        private static final boolean TDT_CONST = false;

    private int resolucion;
    private boolean TDT;

    //Constructor vacio
    public Television() {
        this.resolucion = RESOLUCION;
        this.TDT = TDT_CONST;
    }

    //Constructor precio y peso
    public Television(int precio, int peso) {
        super(precio, peso);
    }

    //Constructor con todos los parameretros
    public Television(int precio, String color, char consumoEnergetico, int peso, int resolucion, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    @Override
    public int precioFinal() {
        super.precioFinal();

        if (resolucion >40 ){
            this.setPrecio(getPrecio()*(1 + 30/100));
            if (TDT == true) {
                this.setPrecio(getPrecio() + 50);
            }
        }else{
            if (TDT == true) {
                this.setPrecio(getPrecio() + 50);
            }
        }

        return getPrecio();
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString() + "Television{" +
                "resolucion=" + resolucion +
                ", TDT=" + TDT +
                '}';
    }
}
