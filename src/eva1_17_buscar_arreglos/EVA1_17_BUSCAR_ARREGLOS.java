/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class EVA1_17_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aleat=new int[5];
        for(int i=0;i<aleat.length;i++){
            aleat[i]=(int)(Math.random()*10)+1;
            System.out.println(aleat[i]+" ");
        }
        Scanner captu=new Scanner(System.in);
        System.out.println("Qué valor buscas?");
        int val=captu.nextInt();
        for(int i=0;i<aleat.length;i++){
            if(val==aleat[i]){
                System.out.println("El valor está en la posición: "+i);
                //si queremos detenerlo, usar un break;
            }
        }
    }
    
}
