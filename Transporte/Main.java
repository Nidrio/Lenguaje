import java.util.ArrayList;
public class Main {
  public static void main(String[] args){
  Transporte mtAvion = Transporte.AVION;
  Transporte mtTren = Transporte.TREN;
  Transporte mtCoche = Transporte.COCHE;
  Transporte mtBici = Transporte.BICICLETA;
  double kilometros = 125;

  System.out.println(mtAvion);
  System.out.println("Si quiero recorrer " + kilometros + "km, tardo " + mtAvion.tiempo(kilometro) + "horas en llegar y gasto " + mtAvion.precio(kilometro) + "euros.");

  System.out.println(mtTren);
  System.out.println("Si quiero recorrer " + kilometros + "km, tardo " + mtTren.tiempo(kilometro) + "horas en llegar y gasto " + mtTren.precio(kilometro) + "euros.");  
    }
  }
