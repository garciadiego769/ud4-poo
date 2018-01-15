package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno alumn[] = new Alumno[3]; //array

        for (int i = 0; i < alumn.length; i++) {
            alumn[i] = new Alumno();
        }
             //constructor


        for (int i = 0; i <alumn.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Introduce nombre: ");
                break;
                case 1:
                    System.out.println("Introduce apellido: ");
                break;
                case 2:
                    System.out.println("Introduce DNI: ");
                break;
                case 3:
                    System.out.println("Introduce telefono: ");
                break;
            }
            alumn[i].setNombre(br.readLine());
        }

        for (int i = 0; i < alumn.length; i++) {

            System.out.println(alumn[i].getNombre());
        }

    }
    }
