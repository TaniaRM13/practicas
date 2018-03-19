/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Tania
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[5][5];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int) (Math.random()*100);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        int[][] copia=new int[5][5];
        System.out.println("");
        System.out.println("COPIA INVERSA");
        System.out.println("");
        int resta=4;
        for(int i=0;i<matriz.length;i++){
            int resta2=4;
            for(int j=0;j<matriz[i].length;j++){
                copia[i][j]=matriz[resta][resta2];
                System.out.print("["+copia[i][j]+"]");
                resta2--;
            }
            System.out.println("");
            resta--;
        }
    }
    
}
