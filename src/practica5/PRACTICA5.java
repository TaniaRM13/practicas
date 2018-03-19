/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Tania
 */
public class PRACTICA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arre=new int[50];
        System.out.println("La lista de los valores pares es: ");
        for(int i=0;i<arre.length;i++){
            arre[i]=(int) (Math.random()*100);
            if(arre[i]%2==0){
                System.out.println(arre[i]);
            }
        }
    }
    
}
