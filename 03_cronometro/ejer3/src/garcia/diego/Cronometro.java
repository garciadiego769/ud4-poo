package garcia.diego;

public class Cronometro {
    private long horaInicio;

    public Cronometro () {
        // Hora inicio
        long horaInicio = System.nanoTime();

    }
    public void tiempoTranscurrido(){
        long tiempoTranscurrido = System.nanoTime() - horaInicio;
        System.out.println("%d"+ tiempoTranscurrido/1000000000);

    }
}
