/* IndiceMC: Indice de masa corporal 
 * Roberto Bosco , CFP6
 * programa realizado con editor VSCODE
 */
import java.util.Scanner; // llamado a libreria para ingresar datos por teclado

// a continuacion, definicion de clase y metodo main
public class IndiceMC { 
    
    public static void main(String[] args) { 

        
        System.out.println("");
        System.out.print("Por favor, tipee su peso en kg: "); 
        double peso = new Scanner(System.in).nextDouble(); // declaracion e ingreso de variable peso
        System.out.print("Por favor, tipee su altura en cm: ");
        double altura = new Scanner(System.in).nextDouble(); // declaracion e ingreso variable altura

        altura/=100;  // conversion de altura , de cm. a metros

        double imc= peso/(altura*altura); //declaracion de variable imc y  calculo 

        System.out.println("su indice de masa corporal es de: "+ imc +" Kg/m2"); // impresion en pantalla del imc calculado

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
         
    }   

   
}
