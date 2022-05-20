class MonstruoJugador extends Monstruo{
  private String nombre;
  private int vida;
  private int golpe;
  private int agilidad;



  public MonstruoJugador(String nombre,int vida, int danio, int agilidad){
    this.nombre = nombre;
    int vida = Math.random() * ( 5 - 1 );
    int golpe = Math.random() * ( 6 - 3 );
    int agilidad = Math.random() * ( 7 - 3 );

  }

  public String getNombre(){
    return this.nombre;
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

  public void setNombre(String nombre){
    this.nombre = nombre;
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
