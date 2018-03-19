/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_arreglos_4_length;

/**
 *
 * @author Tania
 */
public class EVA1_11_ARREGLOS_4_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int enteros[]=new int[5];
        enteros[0]=5;
        enteros[1]=10;
        enteros[2]=15;
        enteros[3]=20;
        enteros[4]=25;
        for(int i=0;i<enteros.length;i++){
            System.out.println("["+i+"]"+"="+enteros[i]);
        }
        int copia[]=new int[enteros.length];
        for(int i=0;i<enteros.length;i++){
            copia[i]=enteros[i];
        }
        enteros=new int[10];
        for(int i=0;i<copia.length;i++){
            enteros[i]=copia[i];
        }
        for(int i=0;i<enteros.length;i++){
            System.out.println("["+i+"]"+"="+enteros[i]);
        }
        
    }
    
}
