/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_arreglos_args;

/**
 *
 * @author Tania
 */
public class EVA1_19_ARREGLOS_ARGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo={1,2,3,4};
        imprimir(arreglo);
        arreglo=new int[4];
        arreglo[0]=5;
        arreglo[1]=6;
        arreglo[2]=7;
        arreglo[3]=8;  
        imprimir(arreglo);
    }
    public static void imprimir(int[] arre){
        for (int i : arre) {
            System.out.println("Valor: "+i);
        }
    }
}
