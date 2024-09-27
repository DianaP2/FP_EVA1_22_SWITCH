
package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA1_22_SWITCH {


    public static void main(String[] args) {
        int dia;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Ingresa el dia de la semana (1 - 7)");
        dia=captu.nextInt();
        captu.nextLine();
        
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: //Ultima isntruccion NO tiene break
                System.out.println("Numero no valido, solo del 1 - 7");

        }
    }
    
}
