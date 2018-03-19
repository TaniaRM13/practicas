/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_memoria_objetos;

/**
 *
 * @author Tania
 */
public class EVA1_2_MEMORIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int otroval=6;
        double salario=800;
        Prueba obj1=new Prueba();
        System.out.println("otroval = "+otroval);
        System.out.println("salario = "+salario);
        System.out.println("obj1 = "+obj1);
        System.out.println("Valor de val = "+obj1.val);
    }
    
}
class Prueba{
    int val=12; 
}
