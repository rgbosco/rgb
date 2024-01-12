/* IndiceMC_v2: Indice de masa corporal version 2
 * Roberto Bosco , CFP6
 * programa realizado con editor VSCODE
 * cambios producidos en esta version:
 * se formatea el valor de imc calculado,  a un solo digito decimal, con clase decimal format 
 * se incorpora un ciclo do while para poder repetir calculos de imc sin salir del programa
 * se incorpora una leyenda,a modo de recomendacion , sugiriendo visita al medico,  segun valor de imc sea saludable o no
 */

 import java.text.DecimalFormat; //llamado a formateador decimal

 import java.util.Scanner; // llamado a libreria para ingresar datos por teclado

// a continuacion, declaracion de clase y metodo main
public class IndiceMC_v2 { 
    
   public static void main(String[] args) {  
    
    // a continuacion una variable char y un ciclo do while para poder repetir calculos de imc
    char seguir=' ';  //declaracion de variable char que se usara mas adelante
        
    do {
            
        System.out.println("");
        System.out.print("Por favor, tipee su peso en kg: "); 
        double peso = new Scanner(System.in).nextDouble(); // declaracion e ingreso de variable peso
        System.out.print("Por favor, tipee su altura en cm: ");
        double altura = new Scanner(System.in).nextDouble(); // declaracion e ingreso variable altura

        altura/=100;  // conversion de altura , de cm. a metros

        double imc= peso/(altura*altura); //declaracion de variable imc y  calculo 

        DecimalFormat imcf=new DecimalFormat("###.0"); //imcf sera el valor imc calculado 
        // con el formato decimal aplicado
            

        System.out.println(""); //deja un renglon antes de mostrar resultado por pantalla
        System.out.println("su indice de masa corporal es de: "+ imcf.format(imc) +" Kg/m2"); // impresion en 
        // pantalla del imc calculado con formato de un solo digito decimal, para una mejor lectura.


        // a continuacion, ciclo if else para determinar grado de salud segun el imc devuelto en linea anterior

        if (imc > 18.4 && imc <= 24.9){
            System.out.println("su peso es correcto y saludable");
        }
        else if (imc <15) {
            System.out.println("su peso se corresponde con una delgadez muy severa");
        }
        else if (imc >= 15 && imc <= 15.9){
            System.out.println("su peso se corresponde con una delgadez severa");
        }
        else if (imc > 15.9 && imc <= 18.4){
            System.out.println("su peso se corresponde con una delgadez");
        }
        else if (imc > 24.9 && imc <= 29.9){
            System.out.println("su peso se corresponde con un sobrepeso");
        }
        else if (imc > 29.9 && imc <= 34.9){
            System.out.println("su peso se corresponde con una obesidad moderada");
        } 
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("su peso se corresponde con una obesidad severa");
        } 
        else if (imc > 39.9){
            System.out.println("su peso se corresponde con una obesidad morbida");
        }  
        
        // a continuacion, un ciclo if else que imprime una leyenda en pantalla, segun valor de imc 
        // corresponda a un valor dentro o fuera del rango considerado saludable por la ciencia, sugiriendo la 
        // visita a un profesional

        if (imc <= 18.4 || imc > 24.9){
            System.out.println("sus valores no son correctos,recomendamos visita al medico para atender su salud");
        }
        else { 
            System.out.println("sus valores son correctos, pero independientemente de este calculo, recomendamos visita periodica al medico");
        }

        System.out.println(""); //nuevo renglon en blanco antes de preguntar
        System.out.print("¿Desea seguir calculando un nuevo imc? (s para si, otra letra para no): ");
        seguir = new Scanner(System.in).next().charAt(0); // variable seguir toma valor del 
        // primer caracter ingresado , se ignora el resto. Si el caracter ingresado por teclado 
        // es s minuscula, se vuelve a calcular imc.

    } while (seguir=='s');
        

      
    }   

   
}
