
import java.util.Scanner;


/**
 *
 * @author julio
 * @version 6/2/2021
 * Esta es la clase principal que interactúa con el usuario
 */
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Operaciones calcu = new Operaciones();
        boolean encendido = true;
        while(encendido){
        System.out.println("Calcualora Postfix - Hoja de trabajo 2");
        System.out.println("Ingrese la ruta de su archivo con la operación");
        String ruta = teclado.nextLine();
       String[] elementos = calcu.decode(ruta).split(" "); //Se divide la cadena ques e decodifico del archivo.txt
       Stack<String> stackaoperar = new StackArrayList<>(); //Se crea un Stack para guardar los elementos que se van a operar
       for(int i=0;i<elementos.length;i++){
           stackaoperar.push(elementos[i]);
           System.out.println(stackaoperar);
       }
        System.out.println("Seleccione la opcion que desea");
        System.out.println("1. Obtener resultado");
        System.out.println("2. Salir");
        String opcionseleccionada = teclado.next();
        int opsel;
        if(IsNumeric(opcionseleccionada)==true){ //Evita que el usuario introduzca caracteres no validos
            opsel=Integer.parseInt(opcionseleccionada);
            if(opsel==1){
                calcu.operar(stackaoperar);
            }
            else if(opsel==2){
                encendido = false;
            }
            else if(opsel <1 && opsel >2){
                System.out.println("Ingrese un numero valido");
            }
        
        
    }
}
//Metodo para verificar que el usuario ingresa solamente numeros
        }
        private static boolean IsNumeric(String opcionseleccionada) {
        boolean resultado;
        try{
            Integer.parseInt(opcionseleccionada);
            resultado = true;
        }catch(NumberFormatException exception){
            resultado = false;
        }
        return resultado;
    }
}