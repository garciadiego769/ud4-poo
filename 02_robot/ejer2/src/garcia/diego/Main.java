package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        robot robbie =new robot(0,0); //inicializar


        do {
            System.out.println(robbie);

            System.out.println("dX: ");
            int dx=Integer.parseInt(br.readLine());

            System.out.println("dY: ");
            int dy=Integer.parseInt(br.readLine());

            robbie.mover(dx,dy);
        } while (true);

    }
}
