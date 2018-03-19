/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_arreglos_multidim_3;

/**
 *
 * @author Tania
 */
public class EVA1_14_ARREGLOS_MULTIDIM_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] arremulti=new int[2][3][4][5];
        for(int i=0;i<arremulti.length;i++){
            for(int j=0;j<arremulti[i].length;j++){
                for(int k=0;k<arremulti[i][j].length;k++){
                    for(int l=0;l<arremulti[i][j][k].length;l++){
                        arremulti[i][j][k][l]=(int)(Math.random()*100);
                        
                    }
                }
            }
        }
        //IMPRIMIR RESULTADOS
        for(int i=0;i<arremulti.length;i++){
            for(int j=0;j<arremulti[i].length;j++){
                for(int k=0;k<arremulti[i][j].length;k++){
                    for(int l=0;l<arremulti[i][j][k].length;l++){
                        System.out.println(arremulti[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
