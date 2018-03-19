/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_for_each;

/**
 *
 * @author Tania
 */
public class EVA1_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] miArre={2,4,6,8,10,12,14,16,18,20};
        for (int i : miArre) {
            System.out.println("Valor: "+i);
        }
        String[] otroArre={"azul","rojo","verde","amarillo"};
        for (String cade : otroArre) {
            System.out.println("Cadena= "+cade);
        }
        int[][] dosDim= new int[3][3];
        dosDim[0][0]=1;
        dosDim[0][1]=2;
        dosDim[0][2]=3;
        dosDim[1][0]=4;
        dosDim[1][1]=5;
        dosDim[1][2]=6;
        dosDim[2][0]=7;
        dosDim[2][1]=8;
        dosDim[2][2]=9;
        for (int[] is : dosDim) {
            for (int i : is) {
                System.out.println("Valor: "+i);
            }
        }
        
        int[][][] tresdim=new int[2][2][2];
        tresdim[0][0][0]=10;
        tresdim[0][0][1]=20;
        tresdim[0][1][0]=30;
        tresdim[0][1][1]=40;
        tresdim[1][0][0]=50;
        tresdim[1][0][1]=60;
        tresdim[1][1][0]=70;
        tresdim[1][1][1]=80;
        for (int[][] ises : tresdim) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.println("Valor: "+i);
                }
            }
        }
        
    }
    
}
