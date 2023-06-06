import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author demon
 */
public class AccionesPersona {
    
  
    public ArrayList<Persona> listaPersonas = 
            new ArrayList<Persona>();
    
    //los metodos del crud
    
    //listar a las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersonas;
    }
    
    //metodo para agregar persona
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }
    
    //como voy a buscar a una persona
    public Persona buscarPersona(int id){
        
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontrada;
    }
    
    //actualizar a la persona
    public void actualizarPersona(Persona actualizada){
        
        Persona actualizar = buscarPersona(actualizada.getId());
      
        listaPersonas.remove(actualizar);
      
        listaPersonas.add(actualizar);
    }
    
    public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
    }
    
    
 
    
    
    
}