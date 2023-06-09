import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @clary
 */
public class manipularPrograma {
    
    public void menu(){
    
        Scanner entrada = new Scanner(System.in);

        //instancia del crud
        AccionesPersona control = new AccionesPersona();

        System.out.println("Bienvenido al programa para manipular pokemones");
        System.out.println("Elija la opcion deseada");
        System.out.println("1.- Mostrar todas las personas");
        System.out.println("2.- Registrar nuevo pukamon");
        System.out.println("3.- Editar los datos del pukamon");
        System.out.println("4.- Borrar el pukamon");
        System.out.println("5.- Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                //instancia
                ArrayList<Persona> listadepersonas = 
                        control.mostrarPersonas();
                //debo imprimir los resultados del arreglo
                for(Persona objeto : listadepersonas){
                    System.out.println("El id del pukamon es: " + objeto.getId()
                    + "El nombre del pukamon es: " + objeto.getNombre()
                    + "El edad del pukamon es: " + objeto.getEdad()); }
                   
                menu();
                break;
            case 2:
            
                System.out.println("Ingrese el id del pukamon");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre del pukamon");
                String nombrepersona = entrada.nextLine();
                 System.out.println("Ingrese el  Apellido Paterno");
                String Apellido_Paternopersona = entrada.nextLine();
                 System.out.println("Ingrese el Apellido Materno");
                String Apellido_Maternopersona = entrada.nextLine();
                System.out.println("Ingrese la edad del pukamon");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese la dirección del pukamon");
                int direccionpersona = Integer.parseInt(entrada.nextLine());
                 System.out.println("Ingrese la colonia del pukamon");
                int coloniapersona = Integer.parseInt(entrada.nextLine());
                
                //guardarlo
                Persona personaPukamon = 
                        new Persona(idpersona, nombrepersona, edadpersona);
               
                control.agregarPersona(personaPukamon);
                menu();
                break;
            case 3:
               
                System.out.println("Ingrese el id del pukamon a buscar");
                idpersona = Integer.parseInt(entrada.nextLine());
                
                Persona personaBuscar = control.buscarPersona(idpersona);
                
                System.out.println("La informacion del pukamon es: \n"
                + "ID: " + personaBuscar.getId() + "\n"
                + "Nombre: " + personaBuscar.getNombre()+ "\n"
                + "Edad: " + personaBuscar.getEdad()+ "\n");
                
                //cambiarlos
                System.out.println("Ingresa el nuevo nombre");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad:");
                int nuevaedad = Integer.parseInt(entrada.nextLine());
                
              
                personaBuscar.setNombre(nuevonombre);
                personaBuscar.setEdad(nuevaedad);
                
                //actualizo
                control.actualizarPersona(personaBuscar);
                menu();
                break;
            case 4 :
                System.out.println("Ingrese el id del pukamon a sacrificar");
                idpersona = Integer.parseInt(entrada.nextLine());
               
                Persona personaEliminar = control.buscarPersona(idpersona);
                
              
                control.eliminarPersona(personaEliminar);
                
                System.out.println("Ese pukamon ya es libre");
                menu();
                break;
                
            default:
                System.out.println("Opcion no valida llegale");
                break;
        }
    
    }
                
    
    
}