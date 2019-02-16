
package quincena9;
/**
 * Clase Persona, almacena los atributos nombre, apellidos, dni y edad
 *@author Bárbara Varona Agut
 *@version 23/01/2019-1.2
 */

public class Persona {
    // atributos de la clase persona
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
    /**
     * consultor del atributo nombre
     * @return Atributo "nombre"
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * consultor del atributo apellidos
     * @return Atributo "apellidos"
     */
    public String getApellidos()
    {
        return this.apellidos;
    }
    
    /**
     * consultor del atributo dni
     * @return Atributo "dni"
     */
    public String getDni()
    {
        return this.dni;
    }
    
    /**
     * consultor del atributo edad
     * @return Atributo "edad"
     */
    public int getEdad()
    {
        return this.edad;
    }
    
    public Persona(String nombre, String apellidos, String dni, int edad)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    
    /** metodo dameAnyoNacimiento
     * Calcula el año de nacimiento, teniendo el año actual y la edad.
     * @param anyo
     * @return 
     */
    public int dameAnyoNacimiento(int anyo)
    {
        //declaración de variable nac, se le asignará el valor de restar el año actual menos la edad
        int nac;
        // Asignamos valor a nac
        nac = anyo- (this.edad);
        // Devuelve resultado
        return nac;
    }//Cierre del método
}//Cierre clase Persona

