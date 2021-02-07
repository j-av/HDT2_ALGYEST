
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio
 * @version 6/2/2021
 * Clase que implementa las operaciones heredadas de calculadora
 */
public class Operaciones implements calculadora {

    /**
     * 
     * @param x
     * @param y
     * @return int
     */
    @Override
    public int suma(int x, int y) {
        int res = x + y;
        return res;
    }

    /**
     * 
     * @param x
     * @param y
     * @return res
     */
    @Override
    public int resta(int x, int y) {
       int res2 = x-y;
       return res2;
    }

    /**
     * 
     * @param x
     * @param y
     * @return res
     */
    @Override
    public int multiplicacion(int x, int y) {
       int res3 = x*y;
       return res3;
    }
    /**
     * 
     * @param x
     * @param y
     * @return res
     */

    @Override
    public int division(int x, int y) {
        int res4 = x/y;
        return res4;
    }
    /**
     * 
     * @param x
     * @return int
     */

    @Override
    public int operar(Stack x) { //Realiza la operación indicada
         while (x.empty() == false){
             int operandoA =  Integer.valueOf((String) x.pop());
             int operandoB =  Integer.valueOf((String) x.pop());
             String operando = (String) x.pop();
             if ("+".equals(operando)){
                     int resp = suma(operandoA, operandoB);
                     x.push(resp);
                     System.out.println(resp);
                     }
             else if ("-".equals(operando)){
                     int resp = resta(operandoA, operandoB);
                     x.push(resp);
                     }
             else if ("*".equals(operando)){
                     int resp = multiplicacion(operandoA, operandoB);
                     x.push(resp);
                     }
             else if ("/".equals(operando)){
                     int resp = division(operandoA, operandoB);
                     x.push(resp);
                     }

             }return  (int) x.peek();
         }
         
    /**
     * 
     * @param a
     * @return String
     */

    @Override
    public String decode(String a) { //Lee el archivo .txt
       File archivo = new File (a);
       FileReader fr = null;
        try {
            fr = new FileReader (archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
       BufferedReader br = new BufferedReader(fr);
       
       String linea = null;
        try {
            linea = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

       return linea;
    }
    }
    

