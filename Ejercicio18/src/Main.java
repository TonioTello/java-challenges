import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static final int CANT_ELEMENTOS = 5;

    public static void main(String[] args) {

        int contSeries = 0, contVideoJ = 0;
        Serie series[] = new Serie[CANT_ELEMENTOS];
        VideoJuego videoJuegos[] = new VideoJuego[CANT_ELEMENTOS];

        ArrayList<Serie> seriesLista = new ArrayList<Serie>();
        ArrayList<VideoJuego> videoJuegosLista = new ArrayList<VideoJuego>();

        Serie mayorTemporada = new Serie();
        VideoJuego mayorHoras = new VideoJuego();

        series[0] = new Serie("Punto ciego", 3,  "accion", "Kurt");
        series[1] = new Serie("Siempre bruja", 1,  "ficcion", "Joha");
        series[2] = new Serie("Casa de papel", 2,  "suspenso", "Profesor");
        series[3] = new Serie("El barco", 1,  "ficcion y suspenso", "Kurt");
        series[4] = new Serie("Johan walk", 5,  "accion", "Johhn Walk");

        videoJuegos[0] = new VideoJuego("Fifa 2011", 12, "diversion", "sport1");
        videoJuegos[1] = new VideoJuego("Fifa 2012", 14, "diversion", "sport1");
        videoJuegos[2] = new VideoJuego("MarioKart", 27, "diversion", "Formula1");
        videoJuegos[3] = new VideoJuego("Fifa 2014", 17, "diversion", "sport1");
        videoJuegos[4] = new VideoJuego("Fifa 2015", 24, "diversion", "sport1");


        series[0].entregar();
        series[2].entregar();

        videoJuegos[0].entregar();
        videoJuegos[2].entregar();
        videoJuegos[4].entregar();

        for (int i = 0; i < CANT_ELEMENTOS; i++) {

            if (series[i].isEntregado()){
                contSeries++;
                series[i].devolver();
            }

            if (videoJuegos[i].isEntregado()){
                contVideoJ++;
                videoJuegos[i].devolver();
            }
        }

        System.out.println("Contador de Series = " + contSeries);
        System.out.println("Contador de Video Juegos = " + contVideoJ);

        //mayorTemporada = series[0];
        //mayorHoras = videoJuegos [0];

        for (int i = 1; i < CANT_ELEMENTOS ; i++) {
            seriesLista.add(series[i]);
            videoJuegosLista.add(videoJuegos[i]);
        }

        mayorTemporada = (Serie) (mayorTemporada.compareTo(seriesLista));
        mayorHoras = (VideoJuego) (mayorHoras.compareTo(videoJuegosLista));

        System.out.println();
        System.out.println("Mayor Temporada = " + mayorTemporada);
        System.out.println("Mayor Horas = " + mayorHoras);

    }
}
