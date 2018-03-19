/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_copia_arreglos_2;

/**
 *
 * @author Tania
 */
public class EVA1_8_COPIA_ARREGLOS_2 {

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
        int copia[]=new int[arre.length];
        //NO SIRVE COPIA=ARRE;
        for(int i=0;i<arre.length;i++){
            copia[i]=arre[i];
        }
        //IMPRIMIR COPIA
        for(int i=0;i<arre.length;i++){
            System.out.println(copia[i]);
    }
        //MODIFICAR ORIGINAL
        arre[2]=50;
        System.out.println("REPRIMO LA COPIA");
        
        for(int i=0;i<arre.length;i++){
            System.out.println(copia[i]);
    }
        System.out.println(arre);
        System.out.println(copia);
}
}
