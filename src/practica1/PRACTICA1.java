/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numE, repite;
        double sumatoria, media, devEst;
        double acum=0;
        double acum2=0;
        int repite2=0;
        int moda=0;
        int moda2=0;
        int[] edades;
        Scanner captu=new Scanner(System.in);
        System.out.println("Indicar el número de edades a capturar:");
        numE=captu.nextInt();
        edades=new int[numE];
        System.out.println("Introduce las edades a capturar:");
        for(int i=0;i<edades.length;i++){
            edades[i]=captu.nextInt();
            acum= acum +edades[i];
        }
        media=acum/numE;
        System.out.println("La media de las edades es: "+media);
        for(int i=0;i<edades.length;i++){
            repite=0;
            for(int j=0;j<edades.length;j++){
                if(edades[i]==edades[j]){
                    repite++;
                }
            }
            if(repite>repite2){
                moda=edades[i];
                repite2=repite;
            }
            acum2=acum2+((edades[i]-media)*(edades[i]-media));
        }
        System.out.println("La moda es: "+moda);
        sumatoria=(acum2/(numE-1));
        devEst=Math.pow(sumatoria,(0.5));
        System.out.println("La desviación estandar es: "+devEst);
    }
    
}
