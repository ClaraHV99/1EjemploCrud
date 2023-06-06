importar  Java . útil _ Lista de arreglos ;

/*
* Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, seleccione Herramientas | Plantillas
* y abra la plantilla en el editor.
*/

/**
*
* @autor demonio
*/
public  class  AccionesPersona {
    
    //sirven principalmente para realizar un CRUD
    
    /*
    vamos a necesitar un objeto capaz de ser dinamico
    para poder almacenar diferentes tipos de variables
    que pertenecen al objeto de persona
    
    Lista de arreglo
    */
    public  ArrayList < Persona > listaPersonas =
            new  ArrayList < Persona >();
    
    //los metodos del crud
    
    //listar a las personas
    public  ArrayList < Persona > mostrarPersonas (){
        return  listaPersonas ;
    }
    
    //metodo para agregar persona
    public  void  agregarPersona ( Persona  p ){
        listaPersonas . suma ( p );
    }
    
    //como voy a buscar a una persona
    public  Persona  buscarPersona ( int  id ){
        //necesito mi instancia de persona
        Persona  encontrada = nueva  Persona ();
        for ( Persona  p : listaPersonas ){
            if ( id == p . getId ()){
                encontrado = p ;
            } más {
                sistema _ fuera _ println ( "Persona no encontrada" );
            }
        }
        volver  encontrada ;
    }
    
    //actualizar a la persona
    public  void  actualizarPersona ( Persona  actualizada ){
        //primero debo de buscarla
        Persona  actualizar = buscarPersona ( actualizado . getId ());
        //primero borro lo que existe
        listaPersonas . eliminar ( actualizar );
        //agrego lo nuevo
        listaPersonas . añadir ( actualizar );
    }
    
    public  void  eliminarPersona ( Persona  eliminar ){
        listaPersonas . eliminar ( eliminar );
    }
    
    
    //ahi hacen los metodos de busqueda por nombre y appat
    
    
    
}