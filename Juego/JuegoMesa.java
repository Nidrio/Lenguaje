public class Juego extends JuegoDeMesa{
  private int Min;
  private int Max;

  //CONSTRUCTORES

public JuegoDeMesa(){
  this.min = 2;
  this.precio = 6;
    }

public JuegoDeMesa(int min, int max){
    this.min = min;
    this.max = max;
    }


   //GET

public int getMin(){
  return this.nombre;
  }

public int getMax(){
  return this.precio;
  }


  //SET

public void setMin(int min){
   this.min = min;
  }

public void setNombre(int max){
   this.max = max;
  }







}
