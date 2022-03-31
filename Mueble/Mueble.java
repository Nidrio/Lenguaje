import java.util.ArrayList;
import java.util.Arrays;

public class Mueble{
  private String material;
  protected ArrayList<Integer> dimensiones;


//CONSTRUCTORES

public Mueble(){
  this.material = "Acero";
  this.dimensiones = new ArrayList<Integer> (Arrays.asList(50,50,50));

}
public Mueble(String material, int ancho, int profundo, int alto){
  this.material = material;
  this.dimensiones = new ArrayList<Integer> (Arrays.asList(ancho,profundo,alto));
}

public Mueble(String material, ArrayList<Integer> dimensiones){
  this.material = material;
  this.dimensiones = dimensiones;
}

//Get
public String getMaterial(){
  return this.material;
}
public ArrayList<Integer> getDimensiones(){
  return this.dimensiones;
}

//Set
public void setMaterial(String material){
  this.material = material;
}
public void setDimensiones(int ancho, int profundo, int alto){
  this.dimensiones = new ArrayList<Integer> (Arrays.asList(ancho,profundo,alto));
  }

public void setDimensiones(ArrayList<Integer> dimensiones){
    this.dimensiones = dimensiones;
  }

//METODO
  public int Superficie(int ancho, int profundo){
    return ancho * profundo;
  }

  public String toString(){
    return "Este mueble esta hecho de " + this.material + " y sus dimensiones son: " + this.dimensiones;
  }

}
