import java.util.ArrayList;

public class Mesa extends Mueble{
    private int nPatas;


public Mesa(){
  super();
  this.nPatas = 4;
  }

public Mesa(String material, ArrayList<Integer> dimensiones, int nPatas){
  super (material, dimensiones);
  this.nPatas = nPatas;
}


//Get
public int getNPatas(){
  return this.nPatas;
  }

//SET
public void setNPatas(int nPatas){
  this.nPatas = nPatas;
    }

//TO STRING

public String toString(){
  return super.toString() + "La mesa tiene " + this.nPatas + " patas.";
  }

}
