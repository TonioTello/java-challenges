import java.util.ArrayList;

public class Serie implements Entregable{

    private String título = "";
    private int numTemporada = 3;
    private  boolean entregado = false;
    private String género = "";
    private String creador = "";

    //Constructor vacio
    public Serie( ) {}

    public Serie(String título, String creador) {
        this.título = título;
        this.creador = creador;
    }

    //Constructor con todos los parametros
    public Serie(String título, int numTemporada, String género, String creador) {
        this.título = título;
        this.numTemporada = numTemporada;
        this.género = género;
        this.creador = creador;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getCreador() {
        return creador;
    }



    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "título='" + título + '\'' +
                ", numTemporada=" + numTemporada +
                ", entregado=" + entregado +
                ", género='" + género + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar(){
        this.entregado = true;
    }

    @Override
    public void devolver(){
        this.entregado = false;

    }

    @Override
    public boolean isEntregado(){
        return  entregado;
    }


/*    public Object compareTo (Object a){
        Serie compareB = (Serie)a;
        return this.numTemporada > compareB.numTemporada ? this : compareB;
    }*/

    public Object compareTo (Object b){

        ArrayList<Serie> compareB = (ArrayList) b;
        Serie mayorTemporada = compareB.get(0);

        for (int i = 1; i < compareB.size() ; i++) {
            mayorTemporada = mayorTemporada.numTemporada > compareB.get(i).numTemporada ? mayorTemporada : compareB.get(i);
        }
        return mayorTemporada;
    }


}
