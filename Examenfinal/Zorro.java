public class Zorro extends Animal{
  private int DiasVisita;



  public Zorro(){
    this.diasVisita = 5;
  }

  public Zorro(int diasVisita){
    this.diasVisita = diasVisita;
  }


//GET
public String getDiasVisita(){
  return this.diasVisita;
}


//SET
public void setDiasVisita(int DiasVisita){
  this.diasVisita;
}

}
