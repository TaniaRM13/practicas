/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Tania
 */
public class PRACTICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[100][100];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    matriz[i][j]=1;
                    System.out.print("["+matriz[i][j]+"]");
                }else{
                    matriz[i][j]=0;
                    System.out.print("["+matriz[i][j]+"]");
                }
            }
            System.out.println("");
        }
    }
    
}
