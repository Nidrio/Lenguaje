class Monstruo{
  private int vida;
  private int golpe;
  private int agilidad;

  public Monstruo(int vida, int danio, int agilidad){
    int vida = Math.random() * ( 7 - 5 );
    int golpe = Math.random() * ( 4 - 2 );
    int agilidad = Math.random() * ( 7 - 5 );

  }

  public int getVida(){
    return this.vida;
  }

  public int getGolpe(){
    return this.golpe;
  }

  public int getAgilidad(){
    return this.agilidad;
  }


  public void setVida(int vida){
      this.vida = vida;
  }

  public void setGolpe(int golpe){
      this.golpe = golpe;
  }

  public void setAgilidad(int agilidad){
      this.agilidad = agilidad;
  }

}
