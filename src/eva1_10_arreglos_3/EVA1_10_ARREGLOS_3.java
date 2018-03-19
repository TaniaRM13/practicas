/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglos_3;

/**
 *
 * @author Tania
 */
public class EVA1_10_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE 5 OBJETOS DE TIPO PERSONA
        Persona gente[]=new Persona[5];
        gente[0]= new Persona();
        gente[1]=new Persona("Marlenne","Alcántar",27);//CONSTRUCTOR CON PARAMETROS
        gente[2]=new Persona("Rodrigo","Reyes",19);
        gente[3]=new Persona("Erika","Ojeda",21);
        gente[4]=new Persona("Jonathan","Aguilera",27);
        for(int i=0;i<gente.length;i++){
            System.out.println("Nombre: "+gente[i].getNomb());
            System.out.println("Apellido: "+gente[i].getApell());
            System.out.println("Edad: "+gente[i].getEdad());
        }
        Persona otro[]=new Persona[gente.length];
        for(int i=0;i<gente.length;i++){
            //ESTO NO FUNCIONA
            //otro[i]=gente[i]; NO ES UNA COPIA DE DATOS SI NO DE REFERENCIAS
            //ESTO DI FUNCIONA
            otro[i]=new Persona();//CREAR EL OBJETO
            otro[i].setNomb(gente[i].getNomb());// COPIAR LOS DATOS
            otro[i].setApell(gente[i].getApell());
            otro[i].setEdad(gente[i].getEdad());
        }
        gente[1].setEdad(30);
        for(int i=0;i<gente.length;i++){
            System.out.println("Nombre: "+otro[i].getNomb());
            System.out.println("Apellido: "+otro[i].getApell());
            System.out.println("Edad: "+otro[i].getEdad());
        }
    }
    
}

class Persona{
    private String nomb;
    private String apell;
    private int edad;
    //CONSTRUCTOR
    public Persona() {
        nomb="Tania Liliana";
        apell="Rascón Mondragón";
        edad=24; 
    }
    //CONSTRUCTOR CON PARAMETROS DE ENTRADA
    public Persona(String nomb, String apell, int edad) {
        this.nomb = nomb;
        this.apell = apell;
        this.edad = edad;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}