/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_meses;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class EVA1_16_ARREGLOS_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
            "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner captu=new Scanner(System.in);
        System.out.println("Introduce el número de mes[1-12]:");
        int mes=captu.nextInt();
        //imprimir el mes (el arreglo va de 0 - 11) por eso restamos 1
        System.out.println("El mes es "+meses[mes-1]+" y tiene "+dias[mes-1]+" días.");
    }
    
}
