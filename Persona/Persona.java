// Clase persona herencia
// Dos tipos de herencia: Extension(a los metodos del padre le añadimo metodos propios) y especializacion(modificamos los métodos del padre para adaptarlos a nuestras necesidades).
//Además de la herencia por ahregacion o composicion (añadir clases como atributos de nuestra clase) explicado en coche.

public class Persona{
    private String nombre;
    private String dni;

    //Constructor
    public Persona(){
    this.nombre = "Juancito";
    this.dni = "47177385S";
  }
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }

  //Get
  public String getNombre(){
    return this.nombre;
  }

  public String getDni(){
    return this.dni;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

}
