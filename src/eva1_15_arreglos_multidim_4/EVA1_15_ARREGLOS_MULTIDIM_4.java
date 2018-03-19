/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_arreglos_multidim_4;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class EVA1_15_ARREGLOS_MULTIDIM_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] grupos;//ARREGLO PARA CAPTURAR GRUPOS
        int numG, numA;//CANTIDAD DE GRUPOS Y ALUMNOS
        Scanner captu=new Scanner(System.in);//CAPTURA DEL TECLADO
        System.out.println("Introduce el # de grupos: ");
        numG=captu.nextInt();//NUM DE GRUPOS SON LAS FILAS
        grupos=new int[numG][];
        //for para preguntar cant de alumnos
        for(int i=0;i<numG;i++){
            System.out.println("Cuantos alumnos tiene el grupo "+(i+1)+":");
            numA=captu.nextInt();
            grupos[i]=new int[numA];//para cada fila definen numero de columnas
        }
        //capturar edades de la matriz
        for(int i=0;i<grupos.length;i++){
            for(int j=0;j<grupos[i].length;j++){
                System.out.println("Cual es la edad Grupo "+(i+1)+" - Alumno "+(j+1)+"?");
                grupos[i][j]=captu.nextInt();
            }
        }
        //imprimir edades capturadas
        for(int i=0;i<grupos.length;i++){
            for(int j=0;j<grupos[i].length;j++){
                System.out.println("La edad del alumno "+(j+1)+" del grupo "+(i+1)+" es: "+grupos[i][j]);
            }
        }
        //calcular el promedio de edades
        int acum, acum2=0,acum3=0;
        for(int i=0;i<grupos.length;i++){
            acum=0;
            acum3=acum3+grupos[i].length;
            for(int j=0;j<grupos[i].length;j++){
                acum=acum+grupos[i][j];
                acum2=acum2+grupos[i][j];
            }
            System.out.println("El promedio para el grupo "+(i+1)+" = "+(acum/grupos[i].length));
        }
        System.out.println("El promedio de todos los grupos es: "+(acum2/acum3));
    }
    
}
