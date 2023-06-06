/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 */

import java.util.*;
import java.io.*;
import Documentos.CLibro;


public class ManipularLibros implements Serializable {

   
    private ArrayList<CLibro> listalibros;
    private ArchivoL objarchivolibros = new ArchivoL();

    public ManipularLibros(){
        listalibros = new ArrayList<>();
        
        listalibros = objarchivolibros.leer();
    }

   
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';

        while(resp == 's'){
           
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            listalibros.add(objlibro);
            System.out.println("¿Deseas agregar otro libro?");
            resp = entrada.next().charAt(0);
        }
    }

    
    public void consultaGral(){
        
        if(listalibros.isEmpty()){
            System.out.println("No hay libros agregados");
        }else{
            System.out.println("Los libros son: ");

         
            for(int i = 0; i < listalibros.size(); i++){

                System.out.println("********          *************");
                System.out.println("Libro: " + listalibros.get(i).getNombre() + "\n"
                                + "Autor: " + listalibros.get(i).getAutor()+ "\n"
                                + "Editorial: " + listalibros.get(i).getEditorial()+ "\n"
                                + "Precio: " + listalibros.get(i).getPrecio()+ "\n");
                System.out.println("+++++++++++++++++++");

            }
        }
    }

    

    private int traePosicion (String nombreBuscar){
        int pos = 0;
        boolean existe = false;

        for(int i = 0; i < listalibros.size(); i++){

           
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
              
                pos = i;
                existe = true;

            }else{
                System.out.println("Libro no encontrado");
            }
        }
        if(!existe){
            
            System.out.println("No exista el registro");
            pos = -1;
        }
        return pos;
    }


   
    public int buscar(){
        int posbuscar = 0;
        String nomBuscar;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre del libro a buscar: ");
        nomBuscar = entrada.nextLine();
        posbuscar = traePosicion(nomBuscar);

       

        System.out.println("---------     ------------");
        System.out.println("Nombre: " + listalibros.get(posbuscar).getNombre()
                           + "Autor: " + listalibros.get(posbuscar).getAutor()
                            + "Editorial: " + listalibros.get(posbuscar).getEditorial()
                            + "Precio: " + listalibros.get(posbuscar).getPrecio());

        return posbuscar;

    }


    //borar
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroborrar;
        int posBorrar;

        
        if(listalibros.isEmpty()){
            System.out.println("No hay libros registrados");
        }else{
            System.out.println("Datos del libro que se va a eliminar");
            posBorrar = buscar();

            if(posBorrar<listalibros.size()){
                listalibros.remove(posBorrar);
                System.out.println("Libro eliminado");
            }
        }
    }

    //modificar
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String nomModificar;
        String opcion = "s";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre del libro que desea modificar");
        nomModificar = entrada.nextLine();

        while("s".equals(opcion)){

            posmodificar = traePosicion(nomModificar);

            if(posmodificar <= 0){
            //preguntar la opcion de dato a modificar
                System.out.println("¿Que dato desea modificar del libro?");
                System.out.println("1.-Autor\n"
                        + "2.-Editorial\n"
                        + "3.-Precio\n   ");

                resmod = entrada.nextInt();

                switch (resmod) {
                    case 1:
                        System.out.println("EL autor es: ");
                        System.out.println("Autor: " + listalibros.get(posmodificar).getAutor());
                        System.out.println("Ingresa el nuevo autor");
                        listalibros.get(posmodificar).setAutor(entrada.next());
                        System.out.println("El dato modificado es:");
                        System.out.println("Autor: " + listalibros.get(posmodificar).getAutor());

                        break;

                    case 2:
                        System.out.println("La editorial es: ");
                        System.out.println("Editorial: " + listalibros.get(posmodificar).getEditorial());
                        System.out.println("Ingresa la nueva editorial");
                        listalibros.get(posmodificar).setEditorial(entrada.next());
                        System.out.println("El dato modificado es:");
                        System.out.println("Editorial: " + listalibros.get(posmodificar).getEditorial());

                        break;   

                    case 3:
                        System.out.println("EL precio es: ");
                        System.out.println("Precio: " + listalibros.get(posmodificar).getPrecio());
                        System.out.println("Ingresa el nuevo precio");
                        listalibros.get(posmodificar).setPrecio(entrada.nextFloat());
                        System.out.println("El dato modificado es:");
                        System.out.println("Precio: " + listalibros.get(posmodificar).getPrecio());

                        break;    

                }
                System.out.println("¿Quieres cambiar algun otro dato? s/n");
                opcion = entrada.nextLine();
            }

        }

    }

    public ArrayList<CLibro> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<CLibro> listalibros) {
        this.listalibros = listalibros;
    }

    public ArchivoL getObjarchivolibros() {
        return objarchivolibros;
    }

    public void setObjarchivolibros(ArchivoL objarchivolibros) {
        this.objarchivolibros = objarchivolibros;
    }

    //para grabar el archivo
    public void grabar(){
        getObjarchivolibros().serializar(listalibros);
    }





}