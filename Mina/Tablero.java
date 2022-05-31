import java.util.ArrayList;

class Tablero{
  private Ficha tablero[][];
  private int filas;
  private int columnas;


  public Tablero(){
      this.filas = 5;
      this.columnas = 5;
      this.tablero = new String[filas][columnas];
    }

    public Tablero(int filas, int columnas){
      this.filas = filas;
      this.columnas = columnas;
      this.tablero = new String[filas][columnas];
    }
    

}
