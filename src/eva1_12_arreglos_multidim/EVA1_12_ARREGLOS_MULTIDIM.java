/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos_multidim;

/**
 *
 * @author Tania
 */
public class EVA1_12_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MATRIZ ---> ARREGLO DE 2 DIMENSIONES
        int[][] matriz=new int[3][3];//ARREGLO DE 3 FILAS x 3 COLUMNAS
        System.out.println(matriz);
        matriz[0][0]=5;
        matriz[0][1]=10;
        matriz[0][2]=12;
        matriz[1][0]=15;
        matriz[1][1]=17;
        matriz[1][2]=23;
        matriz[2][0]=28;
        matriz[2][1]=32;
        matriz[2][2]=33;
        System.out.println(matriz[0]);
        System.out.println(matriz[1]);
        System.out.println(matriz[2]);
        //NECESITAMOS UN CICLO PARA CADA DIMENSION PARA RECORRER UN ARREGLO MULTIDIMENSIONAL
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
    
}
