
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Operaciones implements calculadora {

    @Override
    public int suma(int x, int y) {
        int res = x + y;
        return res;
    }

    @Override
    public int resta(int x, int y) {
       int res2 = x-y;
       return res2;
    }

    @Override
    public int multiplicacion(int x, int y) {
       int res3 = x*y;
       return res3;
    }

    @Override
    public int division(int x, int y) {
        int res4 = x/y;
        return res4;
    }

    @Override
    public int operar(Stack x) {
         while (x.empty() == false){
             int operandoA = (int) x.pop();
             int operandoB = (int) x.pop();
             String operador = (String) x.pop();
             if ("+".equals(operador)){
             int resp = operandoA + operandoB;
             x.push(resp);
         }
             else if("-".equals(operador)){
                 int resp = operandoA - operandoB;
                 x.push(resp);
             }
             else if("*".equals(operador)){
                 int resp = operandoA * operandoB;
                 x.push(resp);
             }
             else if("/".equals(operador)){
                 int resp = operandoA - operandoB;
                 x.push(resp);
             }
         }
         
         return (int) x.peek();
    }

    @Override
    public String decode(String a) {
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
    

