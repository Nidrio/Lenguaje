public class Animal{
  private String especie;
  private int nAnimales;
  private String comidaFav;
  private int nPatas;

//CONSTRUCTORES
  public Animal(){
    this.especie = "Puerco Araña";
    this.nAnimales = 8;
    this.comidaFav = "Donuts";
    this.nPatas = 4;
  }

  public Animal(String especie, int nAnimales, String ComidaFav, int nPatas){
    this.especie = especie;
    this.nAnimales = nAnimales;
    this.comidaFav = comidaFav;
    this.nPatas = nPatas;
  }


//GET

  public String getEspecie(){
    return this.especie;
  }

  public int getNAnimales(){
    return this.nAnimales;
  }

  public String getComidaFav(){
    return this.comidaFav;
  }

  public int getnPatas(){
    return this.nPatas;
  }


//SET

  public void setEspecie(String especie){
    this.especie;
  }

  public void setNAnimales(int nAnimales){
    this.nAnimales;
  }

  public void setComidaFav(String comidaFav){
    this.comidaFav;
  }

  public void setnPatas(int nPatas){
    this.nPatas;
  }

// TO STRING
  public String toString(){
    return "La especie del animal es " + this.especie + " el número de animales de esa especie es " + this.nAnimales + " su comida favorita es " + this.comidaFav + " y tiene" + this.nPatas + " patas.";
  }

}
