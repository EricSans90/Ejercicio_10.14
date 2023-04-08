import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10_14 {
        public static void main(String[] args) {
            String archivo = "carta.txt";
            int caracteres = 0;
            int palabras = 0;
            int lineas = 0;

            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                String lineaActual = lector.readLine();

                while (lineaActual != null) {
                    lineas++;
                    caracteres += lineaActual.length();

                    // Cuenta las palabras
                    String[] palabrasLinea = lineaActual.split("\\s+");
                    palabras += palabrasLinea.length;

                    // Lee la siguiente línea
                    lineaActual = lector.readLine();
                }

                lector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("El archivo " + archivo + " tiene:");
            System.out.println(caracteres + " caracteres");
            System.out.println(palabras + " palabras");
            System.out.println(lineas + " líneas");
        }
}
