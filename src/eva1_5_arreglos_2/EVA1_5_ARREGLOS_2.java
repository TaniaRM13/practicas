/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos_2;

/**
 *
 * @author Tania
 */
public class EVA1_5_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static final int ARRE_TAM=30;
    public static void main(String[] args) {
        // TODO code application logic here
        int edades[]=new int[ARRE_TAM];//DECLARAMOS UN IDENTIFICADOR DE TIPO ARREGLO ENTERO
        //ARREGLOS SIEMPRE EMPIEZAN EN 0
        //HAY QUE MOVERNOS A UN VALOR PREVIO AL TAMAÑO DEL ARREGLO
        for(int i=0;i<edades.length;i++){//LEEMOS NUESTRO ARREGLO
            System.out.println("edades["+i+"]="+edades[i]);
        }
        edades[0]=25;//POSICIÓN CERO (PRIMER POSICIÓN DEL ARREGLO) UN VALOR DE 25
        
        //LLENAR CON VALORES ENTRE 0 Y 36
        for(int i=0;i<edades.length;i++){
            //MATH.RANDOM REGRESA VALORES ENTRE 0 Y 1 --> 0.1355845
            //HAY QUE HACER UN CASTING DE DOUBLE A ENTERO (int)
            edades[i]=(int)(Math.random()*36);
        }
        for(int i=0;i<edades.length;i++){//LEEMOS NUESTRO ARREGLO
            System.out.println("edades["+i+"]="+edades[i]);
        }
    }
    
}
