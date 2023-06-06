public class Persona {
    
    private int id;
    private String nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String direccion;
    private String colonia;
    private int edad;
   
    
    //constructor
    public Persona(){
    }
    
   
    public Persona(int id, String nombre, int edad, String Apellido_Paterno ,String Apellido_Materno, String direccion, String colonia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.Apellido_Materno = Apellido_Materno;
         this.Apellido_Paterno = Apellido_Paterno;
        this.colonia = colonia;
        this.direccion = direccion; 
    }

    Persona(int idpersona, String nombrepersona, int edadpersona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }
     public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this. Apellido_Materno = Apellido_Materno;
    }  
     public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
     public String getcolonia() {
        return colonia;
    }

    public void setcolonia(String colonia) {
        this.colonia = colonia;
    }

    
    
    
}