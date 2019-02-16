
package quincena9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programa que pide datos de una persona (nombre, apellidos, DNI, 
 * pide la edad, y el año en que estamos) Después tiene la llamada al metodo dameANyoNacimiento y
 * nos devuelve el año de nacimiento.
 *@author Bárbara Varona Agut
 *@version 01/01/2019-1.1
 */
public class Quincena9 {
    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String cadena = new String();
        
        /** declaración de variables
         */
        String nombre, apellidos, dni, genero;
        int anyo; // variable anyo, guardará el valor del año actual que será pedido al usuario.
        int edad; // variable edad 
        // variable del numero de la seguridad social  int numeroSeg; 
        Persona persona1, persona2, persona3;
        
        /**
        llamada a clase persona y asignación de atributos de la persona1
        */
        persona1 = new Persona("Pepa", "García Navarro", "44879652L", 21);
       
      
        // llamada a clase persona y asignación de atributos de la persona2
        nombre = "Lunilda María";
        apellidos = "Pérez Giménez";
        genero= "femenino";
        dni = "21979552W";
        edad = 41;
        persona2 = new Persona(nombre, apellidos, dni, edad);
        
        /** 
         * llamada a los metodos para pedir datos de la persona 3
         */
        
        nombre = pideNombre(stdin, "nombre");
        apellidos = pideApellidos(stdin, "apellidos");
        dni = pideDni(stdin, "dni");
        edad =  pideEdad(stdin);
        persona3 = new Persona(nombre, apellidos, dni, edad);
        
        /**
         * llamada al metodo para pedir año actual
         */
        anyo = pideAnyoActual(stdin);
        
        /** 
         * llamada al metodo para imprimir datos de cada persona
         */
        imprimeDatosPersona(persona1, anyo);
        imprimeDatosPersona(persona2, anyo);
        imprimeDatosPersona(persona3, anyo);
        
    } //Cierre de  main
  
   
    /**
     * Metodo para pedir nombre
     * @param stdin
     * @param nombre
     * @return
     * @throws IOException 
     */
    public static String pideNombre(BufferedReader stdin, String nombre) throws IOException 
    {
        System.out.println("Introduce el nombre");
        return(stdin.readLine());
    }
    /**
     * Metodo para pedir apellido
     * @param stdin
     * @param apellidos
     * @return
     * @throws IOException 
     */
    public static String pideApellidos(BufferedReader stdin, String apellidos) throws IOException 
    {
        System.out.println("Introduce los apellidos");
        return(stdin.readLine());
    }
    /**
     * Metodo para pedir DNI
     * @param stdin
     * @param dni
     * @return 
     * @throws IOException 
     */
    public static String pideDni(BufferedReader stdin, String dni) throws IOException 
    {
        System.out.println("Introduce el DNI");
        return(stdin.readLine());
    }
    /**
     * Metodo para pedir edad
     * @param stdin
     * @return
     * @throws IOException 
     */
    public static int pideEdad(BufferedReader stdin) throws IOException
    {
        System.out.println("Introduce la edad");
        return (Integer.parseInt(stdin.readLine()));
    }
    /**
     * Metodo para pedir el año actual
     * @param stdin
     * @return
     * @throws IOException 
     */
    public static int pideAnyoActual(BufferedReader stdin) throws IOException
    {
        System.out.println("Introduce en que año estamos");
        return(Integer.parseInt(stdin.readLine()));
    }
    /**
     * Metodo para imprimir los datos de cada persona.
     * @param printpersona
     * @param anyo 
     */
    public static void imprimeDatosPersona(Persona printpersona, int anyo)
    {
        System.out.println("La persona " + printpersona.getApellidos() + ", " + printpersona.getNombre() + " con DNI "+ printpersona.getDni() + " ha nacido en el año " + printpersona.dameAnyoNacimiento(anyo));
    }
    
} //Cierre de la clase Quincena9
