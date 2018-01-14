package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cronometro c = new Cronometro();
        c.tiempoTranscurrido();
    String respuesta="";
        do{
            System.out.println("- Nuevo cronómetro a)\n" +
                    "- Consultar cronómetro b)\n" +
                    "- Salir c)\n" +
                    " ");
            respuesta=br.readLine();
        }while(!respuesta.equalsIgnoreCase("e"));
    }
}
