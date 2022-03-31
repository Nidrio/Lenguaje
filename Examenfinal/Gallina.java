public class Gallina extends Animal{
  private int huevosDia;
  private int diasPoniendo;
  private int huevosTotales;


//CONSTRUCTORES

  public Gallina(){
    this.huevosDia = 2;
    this.diasPoniendo = 6;
    this.huevosTotales = 12;

  }
  public Gallina(int huevosDia, int diasPoniendo, int huevosTotales){
    this.huevosDia = huevosDia;
    this.diasPoniendo = diasPoniendo;
    this.huevosTotales = huevosTotales;
  }

//GET

  public int getHuevosDia(){
    return this.huevosDia;
  }

  public int getDiasPoniendo(){
    return this.diasPoniendo;
  }

  public int getHuevosTotales(){
    return this.huevosTotales;
  }


  //SET

  public void setHuevosDia(int huevosDia){
    this.huevosDia;
  }

  public void setDiasPoniendo(int diasPoniendo){
    this.diasPoniendo;
  }

  public void setHuevosTotales(int huevosTotales){
    this.huevosTotales;
  }

//METODO
  public int huevosTotal(int huevosDia, int diasPoniendo){
    return huevosDia * diasPoniendo;
  }


// TO STRING
  public String toString(){
    return "La gallina pone  " + this.huevosDia + " al dia " + this.diasPoniendo + " son los dias que pone a la semana, " + this.huevosTotales + " es la cantidad total de huevos.";
  }
}
