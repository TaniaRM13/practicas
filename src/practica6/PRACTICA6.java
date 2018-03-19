/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Tania
 */
public class PRACTICA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arre=new int[50];
        int[] pares;
        int[] impares;
        int acu=0;
        int acu2=0;
        int acu3=0;
        int acu4=0;
        for(int i=0;i<arre.length;i++){
            arre[i]=(int) (Math.random()*100);
            if(arre[i]%2==0){
                acu++;
            }else{
                acu2++;
            }
        }
        
        pares=new int[acu];
        impares=new int[acu2];
        for(int i=0;i<arre.length;i++){
            if(arre[i]%2==0){
                pares[acu3]=arre[i];
                acu3++;
            }else{
                impares[acu4]=arre[i];
                acu4++;
            }
        }
        System.out.println("El arreglo de los valores pares es: ");
        for(int i=0;i<pares.length;i++){
            System.out.println(pares[i]);
        }
        System.out.println("El arreglo de los impares es: ");
        for (int i=0;i<impares.length;i++) {
            System.out.println(impares[i]);
        }
    }
    
}
