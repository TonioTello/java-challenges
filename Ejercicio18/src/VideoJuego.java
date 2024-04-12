import java.util.ArrayList;

public class VideoJuego implements Entregable{

    private String título = "";
    private int horasEstimadas = 10;
    private  boolean entregado = false;
    private String género = "";
    private String compañia = "";

    //Constructor vacio
    public VideoJuego() {
    }

    public VideoJuego(String título, int horasEstimadas) {
        this.título = título;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String título, int horasEstimadas, String género, String compañia) {
        this.título = título;
        this.horasEstimadas = horasEstimadas;
        this.género = género;
        this.compañia = compañia;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "título='" + título + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", género='" + género + '\'' +
                ", compañia='" + compañia + '\'' +
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

    public Object compareTo (Object b){

        ArrayList<VideoJuego> compareB = (ArrayList) b;
        VideoJuego mayorHoras = compareB.get(0);

        for (int i = 1; i < compareB.size() ; i++) {
            mayorHoras = mayorHoras.horasEstimadas > compareB.get(i).horasEstimadas ? mayorHoras : compareB.get(i);
        }
        return mayorHoras;
    }
}
