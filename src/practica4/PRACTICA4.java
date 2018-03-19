/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Tania
 */
public class PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] mat1=new double[5][5];
        double[][] mat2=new double[5][5];
        double[][] mat3=new double[5][5];
        System.out.println("PRIMERA MATRIZ:");
        System.out.println("");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat1[i][j]=Math.random()*10;
                System.out.print("["+mat1[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("SEGUNDA MATRIZ:");
        System.out.println("");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                mat2[i][j]=Math.random()*10;
                System.out.print("["+mat2[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ RESULTADO:");
        System.out.println("");
        for(int i=0;i<mat3.length;i++){
            for(int j=0;j<mat3[i].length;j++){
                mat3[i][j]=((mat1[i][j])*(mat2[i][j]));
                System.out.print("["+mat3[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
