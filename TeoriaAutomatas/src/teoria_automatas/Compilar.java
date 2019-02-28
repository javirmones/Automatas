/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_automatas;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.SilentExit;
import java_cup.runtime.Symbol;

/**
 *
 * @author lajotadeladerrota
 */
public class Compilar {

    private String rutaFichero = "src/test/java.txt";
    private String rutaCompilar = "src/teoria_automatas/";
    private static boolean do_debug_parse = false;

    public Compilar() {
        try {
            compilarFlex(rutaCompilar);
            compilarCup(rutaCompilar);
            //ejecutarFlex(rutaFichero);
            ejecutarParser(rutaFichero);

        } catch (IOException ex) {
            Logger.getLogger(Compilar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SilentExit ex) {
            Logger.getLogger(Compilar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Compilar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void compilarFlex(String ruta) throws java.io.IOException, SilentExit {
        String opcFlex[] = {ruta + "aut_java.flex", "-d", ruta};
        jflex.Main.generate(opcFlex);

    }

    public void ejecutarFlex(String ruta) throws IOException {
        AnalizadorLexico alex = new AnalizadorLexico(lector(ruta));
        System.out.println(alex.yytext());
    }

    public void compilarCup(String ruta) throws IOException, Exception {
        String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "aut_java.cup"};
        java_cup.Main.main(opcCUP);
    }

    public static void ejecutarParser(String ruta) throws FileNotFoundException {

        parser parser_obj = new parser(new AnalizadorLexico(new FileReader(ruta)));

        Symbol parse_tree = null;

        try {
            if (do_debug_parse) {
                parse_tree = parser_obj.debug_parse();
            } else {
                parse_tree = parser_obj.parse();
            }
        } catch (Exception e) {
            System.out.println("Análisis incorrecto");
            System.exit(1);
        }
        System.out.println("Análisis correcto");
    }

    public Reader lector(String ruta) {
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
