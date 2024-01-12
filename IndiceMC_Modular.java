/* Calculo de IMC, modular (con funciones)
 * Realizado por Roberto Bosco CFP nro. 6
 * 
 * Realizado con editor VSCODE
 * 
 */

import java.text.DecimalFormat; //llamado a formateador decimal
import java.util.Scanner; // llamado a libreria para ingresar datos por teclado

public class IndiceMC_Modular {

    public static void main(String[] ar) { // ar: argumentos que se pasan al metodo main, peso y altura
       
        //declaracion de variables y cadenas
        double pe; // peso
        double al;  // altura
        double imc;  // indice de masa corporal, imc = peso / (altura)2 
        char seguir; // variable caracter para decidir si se sigue calculando o no
        String mensaje; // leyenda a cerca de visita al medico, segun el imc obtenido
        String estado;  // estado de salud determinado segun valor obtenido de imc
        DecimalFormat imcf=new DecimalFormat("###.0");
        //imcf sera el valor de imc formateado a un solo decimal, para mejor lectura

        do { // ciclo do while para repetir calculo de imc, si asi se desea

            System.out.println("Calculo de Indice de masa corporal, IMC");
            System.out.println();
            seguir = ' ';

            if (ar.length == 2) {  // en caso que se hayan pasado argumentos (peso y altura) por linea de comandos
                pe = Double.parseDouble(ar[0]);
                al = Double.parseDouble(ar[1]);

            } else {  //si no hubo argumentos (longitud de ar = 0) se ingresa peso y altura por teclado
                System.out.println("Por favor, tipee peso en kg: ");
                pe = new Scanner(System.in).nextDouble();
                System.out.println("Por favor, tipee altura en cm: ");
                al = new Scanner(System.in).nextDouble();
            }
            System.out.println();
            imc=CalculoIMC(pe, al); // llamada a funcion que calcula IMC
            System.out.println("El IMC calculado es: " + imcf.format(imc) + "Kg/m2"); // valor formateado
            System.out.println();
            estado = CalculoEstado(imc); // llamada a funcion que calcula estado de salud
            System.out.println("corresponde a un estado de:" + estado);
            System.out.println();
            mensaje = VisitaMedica(imc); // leyenda que recomienda visita al medico, segun imc
            System.out.println( mensaje);
            System.out.println();

            System.out.print("¿Desea seguir calculando un nuevo imc? (s para si, otra letra para no):");
            seguir = new Scanner(System.in).next().charAt(0);
            System.out.println();

        } while (seguir == 's'); // el programa termina cuando char seguir sea diferente de "s"

    }

    public static double CalculoIMC( double pe , double al ) { //funcion que calcula IMC

        return pe/(al/100 * al/100) ;
    }

    public static String CalculoEstado( double imc ) { // funcion que calcula estado segun imc
        String estado = "";

        if (imc < 15) {
            estado = "delgadez muy severa";
        } else if (imc >= 15 && imc <= 15.9) {
            estado = "delgadez severa";
        } else if (imc > 15.9 && imc <= 18.4) {
            estado = "delgadez moderada";
        } else if (imc > 18.4 && imc <= 24.9) {
            estado = "peso normal";
        } else if (imc > 24.9 && imc <= 29.9) {
            estado = "sobrepeso";
        } else if (imc > 29.9 && imc <= 34.9) {
            estado = "obesidad moderada";
        } else if (imc >= 35 && imc <= 39.9) {
            estado = "obesidad severa";
        } else if (imc > 39.9) {
            estado = "obesidad mórbida";
        }
        return estado;
    }

    public static String VisitaMedica( double imc) { //funcion que muestra leyenda de visita al medico 
        String mensaje = "";

        if (imc > 18.4 && imc <= 24.9) {
            mensaje = "su peso es normal, igualmente, visite periodicamente al medico" ;
        } else 
            mensaje = "por su estado de salud, recomendamos visita al medico" ;
        return mensaje;    

    }

}

