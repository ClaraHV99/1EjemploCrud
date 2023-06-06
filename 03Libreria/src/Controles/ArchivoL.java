/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;


import java.io.Serializable;
import java.io.*;
import java.util.*;

import Documentos.CLibro;



public class ArchivoL implements Serializable {

   
    ArrayList<CLibro> listarecuperar = new ArrayList<>();



    public ArrayList<CLibro> leer(){
        try{

           
            try (ObjectInputStream in = new ObjectInputStream( 
                    new FileInputStream("libro.txt"))) {
                listarecuperar = (ArrayList<CLibro>)in.readObject();
            }

        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error " + e.getMessage());
        }
        return listarecuperar;
    }

    
    void serializar(ArrayList<CLibro> listaserializada){
        try{

           
            FileOutputStream salida = new FileOutputStream("libro.txt");
           
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);

            
            salidaobjeto.writeObject(listaserializada);

        }catch(IOException e){

            System.out.println("Error "+ e.getMessage());
        }
    }

}