import java.util.ArrayList;

public class Armario extends Mueble{
  private String tipoPuerta;
  private int nBaldas;

//Constructores

  public Armario(){
    super();
    this.tipoPuerta = "puerta corredera";
    this.nBaldas = 3;
  }

  public Armario(String material, ArrayList<Integer> dimensiones, String tipoPuerta, int nBaldas){
    super(material, dimensiones);
    this.tipoPuerta = tipoPuerta;
    this.nBaldas = nBaldas;
  }

//Get

  public String getTipoPuerta(){
    return this.tipoPuerta;
  }

  public int nBaldas(){
    return this.nBaldas;
  }

//Set

  public void setTipoPuerta(String tipoPuerta){
    this.tipoPuerta = tipoPuerta;
  }

  public void setNBaldas(int nBaldas){
    this.nBaldas = nBaldas;
  }

//toString

  public String toString(){
    return super.toString() + ". El armario tiene " + this.tipoPuerta + " y tiene " + this.nBaldas + " baldas.";
  }
}
