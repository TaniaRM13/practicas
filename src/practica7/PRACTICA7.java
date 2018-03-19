/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author Tania
 */
public class PRACTICA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arre=new int[50];
        int numMin=0;
        int numMayor=0; 
        int posMin=0;
        int posMay=0;
        for(int i=0;i<arre.length;i++){
            arre[i]=(int) (Math.random()*100);
            if(i==0){
                numMin=arre[i];
                numMayor=arre[i];
                posMin=i;
                posMay=i;
            }else if(arre[i]>numMayor){
                numMayor=arre[i];
                posMay=i;
            }else if(arre[i]<numMin){
                numMin=arre[i];
                posMin=i;
            }
        }
        System.out.println("El valor más grande es: "+arre[posMay]+" y la posición es arre["+posMay+"]");
        System.out.println("El valor más pequeño es: "+arre[posMin]+" y la posición es arre["+posMin+"]");
    }
    
}
