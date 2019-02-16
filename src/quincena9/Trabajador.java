
package quincena9;

/**
 * Clase Trabajador, almacena el atributo de numero de seguridad social
 *@author Bárbara Varona Agut
 *@version 23/01/2019-1.2
 */

public class Trabajador extends Persona {
    // atributos de la clase persona
    private String numeroSeg;
    
    //CONSULTORES
    /**
     * Consultor del atributo numeroSeg
     * @return Atributo "unidad"
    */
    public String getsegSocial()
    {
        return this.numeroSeg;
    }
    
    //MODIFICADORES
    /**
     * Modificador del atributo "numeroSeg"
     * @param nuevosegSocial 
     */
    public void setsegSocial(String nuevosegSocial)
    {
        this.numeroSeg = nuevosegSocial;
    }

    public Trabajador(String nombre, String apellidos, String dni, int edad) {
        super(nombre, apellidos, dni, edad);
    }

}
