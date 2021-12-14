/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author Ximena Hernandez
 */
public class MyQueue extends Lista{
    //XOMO LA FILA DEL SUPERMERCADO
    //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
    //METODO -->ADD DE LA LISTA SIN CAMBIOS
    
    public int peek() throws Exception{//REGRESA EL VALOR DEL ELEMENTO AL INCIO DE LA LISTA
    return get(0);
}
    public int poll() throws Exception{ //REGRESA Y ELIMINA EL ELEMENTO AL INCIO DE LA LISTA
        //GUARDAR EL VALOR
        int iVal = get(0);
        //ELIMINAMOS EL VALOR
        deleteAt(0);
        //ENVIAMOS EL VALOR
        return iVal;
    }
}
