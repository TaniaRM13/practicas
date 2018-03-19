/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_arreglos_1;

/**
 *
 * @author Tania
 */
public class EVA1_7_COPIA_ARREGLOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arre[]=new int[3];
        arre[0]=5;
        arre[1]=10;
        arre[2]=12;
        //MI "COPIA" DEL ARREGLO
        int copia[]=arre;
        //IMPRIMIR COPIA
        for(int b:copia){
            System.out.println(b);
        }
        //MODIFICO ARRE
        arre[1]=11;
        //IMPRIMIR COPIA
        for(int i=0;i<copia.length;i++){
            System.out.println(copia[i]);
        }
        System.out.println(arre);
        System.out.println(copia);
    }
    
}
