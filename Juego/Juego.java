class Juego{
  private String Nombre;
  protected int Precio;


//CONSTRUCTORES

public Juego(){
  this.nombre = "Elden Ring";
  this.precio = 28;
  }

public Juego(String nombre, int precio){
  this.nombre = nombre;
  this.precio = precio;
  }


 //GET

public String getNombre(){
  return this.nombre;
}

public int getPrecio(){
  return this.precio;
}


//SET

public void setNombre(String nombre){
 this.nombre = nombre;
}


public void setPrecio(int precio){
  this.precio = precio;
}


//TO STRING
public String toString(){
    return "El nombre del juego es " + nombre + " y el precio del juego es " + precio;
}

}
