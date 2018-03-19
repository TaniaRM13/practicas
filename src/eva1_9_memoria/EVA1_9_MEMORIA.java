/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_memoria;

/**
 *
 * @author Tania
 */
public class EVA1_9_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EVA1_9_MEMORIA objeto=new EVA1_9_MEMORIA();
        //PARA DESHACERSE DE LA MEMORIA DE UN OBJETO
        objeto=null;//LIBERAMOS LA MEMORIA CREADA PARA EL OBJETO
        /*TODO OBJETO EN MEMORIA QUE NO ES REFERENCIADO POR UNA VARIABLE EN 
        EL PROGRAMA, ES ELIMINADA POR EL GARBAGE COLLECTOR*/
        EVA1_9_MEMORIA objeto2=new EVA1_9_MEMORIA();
        EVA1_9_MEMORIA copia=objeto2; 
        /*NO DUPLICAMOS EL OBJETO, DUPLICAMOS LA DIRECCIÓN
        QUEREMOS ELIMINAR objeto2*/
        objeto2=null; //NO SE ELIMINA EL OBJETO, PORQUE COPIA SIGUE APUNTANDO
        copia=null; //AHORA SI, EL OBJETO SE ELIMINA, NO QUEDAN MAS REFERENCIAS AL OBJETO
    }
    
}
