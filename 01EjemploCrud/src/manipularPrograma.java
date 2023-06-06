importar  Java . útil _ Lista de arreglos ;
importar  Java . útil _ escáner ;

/*
* Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, seleccione Herramientas | Plantillas
* y abra la plantilla en el editor.
*/

/**
*
* @autor demonio
*/
public  class  manipularPrograma {
    
     menú vacío  público (){
    
        Scanner  entrada = nuevo  Scanner ( System . in );

        //instancia del crud
        AccionesPersona  control = new  AccionesPersona ();

        sistema _ fuera _ println ( "Bienvenido al programa para manipular pokemones" );
        sistema _ fuera _ println ( "Elija la opcion deseada" );
        sistema _ fuera _ println ( "1.- Mostrar todas las personas" );
        sistema _ fuera _ println ( "2.- Registrador nuevo pukamon" );
        sistema _ fuera _ println ( "3.- Editar los datos del pukamon" );
        sistema _ fuera _ println ( "4.- Borrar el pukamon" );
        sistema _ fuera _ println ( "5.- Salir" );
        
        int  opcion = Entero . parseInt ( entrada . nextLine ());
        
        cambiar ( opción ) {
            caso  1 :
                //instancia
                ArrayList < Persona > listadepersonas =
                        controlar _ mostrarPersonas ();
                //debo imprimir los resultados del arreglo
                for ( Persona  objeto : listadepersonas ){
                    sistema _ fuera _ println ( "El id del pukamon es: " + objeto . getId ()
                    + "El nombre del pukamon es: " + objeto . obtenerNombre ()
                    + "La edad del pukamon es: " + objeto . getEdad ());
                }
                menú ();
                romper ;
            caso  2 :
                sistema _ fuera _ println ( "Ingrese el id del pukamon" );
                int  idpersona = Entero . parseInt ( entrada . nextLine ());
                sistema _ fuera _ println ( "Ingrese el nombre del pukamon" );
                String  nombrepersona = entrada . siguienteLinea ();
                sistema _ fuera _ println ( "Ingrese la edad del pukamon" );
                int  edadpersonar = Entero . parseInt ( entrada . nextLine ());
                
                //guardarlo
                Persona  personaPukamon =
                        nueva  Persona ( idpersona , nombrepersona , edadpersonar );
                //mando a llamar al metodo para guardar
                controlar _ agregarPersona ( personaPukamon );
                menú ();
                romper ;
            caso  3 :
                //primero debo de hacer una busqueda por el id
                sistema _ fuera _ println ( "Ingrese el id del pukamon a buscar" );
                idpersona = Entero . parseInt ( entrada . nextLine ());
                //creo mi objeto para buscar una persona
                Persona  personaBuscar = controlar . buscarPersona ( idpersona );
                
                sistema _ fuera _ println ( "La informacion del pukamon es:\n"
                + "DNI: " + personaBuscar . obtener ID () + "\n"
                + "Nombre: " + personaBuscar . obtenerNombre ()+ "\n"
                + "Edad: " + personaBuscar . getEdad ()+ "\n" );
                
                //cambiarlos
                sistema _ fuera _ println ( "Ingresa el nuevo nombre" );
                String  nuevo nombre = entrada . siguienteLinea ();
                sistema _ fuera _ println ( "Ingresa la nueva edad:" );
                int  nuevaedad = Entero . parseInt ( entrada . nextLine ());
                
                //envio los nuevos datos
                personaBuscar . setNombre ( nuevonombre );
                personaBuscar . setEdad ( nuevaedad );
                
                //actualizo
                controlar _ actualizarPersona ( personaBuscar );
                menú ();
                romper ;
            caso  4 :
                sistema _ fuera _ println ( "Ingrese el id del pukamon a sacrificar" );
                idpersona = Entero . parseInt ( entrada . nextLine ());
                //creo mi objeto para eliminar
                Persona  personaEliminar = control . buscarPersona ( idpersona );
                
                //el peto
                controlar _ eliminarPersona ( personaEliminar );
                
                sistema _ fuera _ println ( "Ese pukamon ya es libre" );
                menú ();
                romper ;
                
            predeterminado :
                sistema _ fuera _ println ( "Opcion no valida llegare" );
                romper ;
        }
    
    }
                
    
    
    
}
Pie de página
© 2023 GitHub, Inc.
Pie de página de navegación
Términos
Privacidad
Seguridad
Estado
