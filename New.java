/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgnew;

/**
 *
 * @author Alumno
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("haihakha ");
         while(true){ 
            System.out.println("CALCULADORA");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("INGRESA OPCION - >");
            operacion = teclado.nextInt();

        }else if (operacion == 2){
                System.out.println("Introduzca el primer número: ");
                n1 = teclado.nextInt();
                System.out.println("Introduzca el segundo número: ");
                n2 = teclado.nextInt();

                resta = n1 - n2;
                System.out.println("LA RESTA ES: "+resta);
                break;

    }
        // TODO code application logic here
    }
    
}
