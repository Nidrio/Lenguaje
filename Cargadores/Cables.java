import java.util.Scanner;


public class Cables{
    private int longitud;
    private String tipoEntrada;
    private String tipoSalida;
    private boolean permiteTransmitirDatos;



public Cables(){
    this.longitud  = 8;
    this.tipoEntrada = "A";
    this.tipoSalida = "usb";
    this.permiteTransmitirDatos = true;
}

public Cables(int longitud, String tipoEntrada, String tipoSalida, boolean permiteTansmitirDatos){
    this.longitud  = longitud;
    this.tipoEntrada = tipoEntrada;
    this.tipoSalida = tipoSalida;
    this.permiteTransmitirDatos = permiteTransmitirDatos;
}

//GET
public int getlongitud(){
    return this.longitud;
}

public String getTipoEntrada(){
    return this.tipoEntrada;
}

public String gettipoSalida(){
    return this.tipoSalida;
}

public boolean getpermiteTransmitirDatos(){
    return this.permiteTransmitirDatos;
}

//SET

public void setlongitud(int longitud){
    this.longitud = longitud;
}

public void setTipoEntrada(String tipoEntrada){
    this.tipoEntrada = tipoEntrada;
}

public void setTipoSalida(String tipoSalida){
    this.tipoSalida = tipoSalida;
}

public void setPermiteTransmitirDatos(boolean permiteTransmitirDatos){
    this.permiteTansmitirDatos = permiteTansmitirDatos;
}


public String dispositivoCompatible(){
      Scanner sc = new Scanner(System.in);
      String respuesta = "No es compatible";
      System.out.println("Que tipo de cable necesita tu telefono: ");
      String tipoCable = sc.nextLine();

      if(tipoCable == getTipoEntrada()){
          respuesta = "Si es compatible";
      }
     return respuesta;

  }


//TOSTRING

public String toString(){
    return "La longitud del cable es de " + longitud + " su tipo de entrada es de " + tipoEntrada + " su tipo de salida es " + tipoSalida + " y el modo transmitir datos esta en: " + permiteTansmitirDatos;
}
}
