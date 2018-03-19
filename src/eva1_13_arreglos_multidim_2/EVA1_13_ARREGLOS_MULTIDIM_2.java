/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos_multidim_2;

/**
 *
 * @author Tania
 */
public class EVA1_13_ARREGLOS_MULTIDIM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[3][];
        System.out.println(matriz);
        matriz[0]=new int[2];
        System.out.println(matriz[0][1]);
        System.out.println(matriz[0]);
        matriz[1]=new int[5];
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1]);
        matriz[2]=new int[10];
        System.out.println(matriz[2][3]);
        System.out.println(matriz[2]);
        for(int i=0;i<matriz.length;i++){//FILAS
            for(int j=0;j<matriz[i].length;j++){//COLUMNAS
                System.out.println(matriz[i][j]);
            }
        }
    }
    
}
