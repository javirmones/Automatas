/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.io.*;
 import java_cup.runtime.*;

/**
 *
 * @author lajotadeladerrota
 */
 public class Main {

   /**
   * @param args the command line arguments
   */
   private static boolean do_debug_parse = false;


   public static void main(String[] args) {

     try {
       ejecutarParser(args[0]);

     } catch (IOException ex) {

      }

    }

    public static void ejecutarParser(String ruta) throws FileNotFoundException {

        parser parser_obj = new parser(new AnalizadorLexico(lector(ruta)));

        Symbol parse_tree = null;

        try {
            if (do_debug_parse) {
                parse_tree = parser_obj.debug_parse();
            } else {
                parse_tree = parser_obj.parse();

            }
        } catch (Exception e) {
            System.out.println("¡Error!");
        }
        System.out.println("Análisis correcto");
    }

    public static Reader lector(String ruta) {
        Reader lectura = null;

        if (ruta != null) {
            try {
                lectura = new FileReader(ruta);
            } catch (IOException exc) {
                System.err.println("Error en la apertura del archivo '" + ruta + "'");
                System.err.println(exc.getMessage());
                System.exit(1);
            }
            System.out.println("Leyendo archivo '" + ruta + "'");
        } else {
            lectura = new InputStreamReader(System.in);
            System.out.println("Leyendo entrada estándar (Terminar con Ctrl+D)");

        }

        return lectura;
    }

}
