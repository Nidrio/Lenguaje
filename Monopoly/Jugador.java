class Jugador{
  private String nombre;
  private String figura;
  private double dinero;


  String figuras[] = "Pikachu", "Bulbasaur","Squirtle", "Charmander","Jigglypuff","Togetic";

  private final static String FIGURAS = "Pikachu";


  public Jugador(String nombre, String figura, double dinero){
    this.nombre = nombre;
    this.figura = figura;
    this.dinero = 0;
}

  public String getNombre(){
    return this.nombre;
  }


  public String getFigura(){
    return this.nombre;
  }

  public double getDinero(){
    return this.nombre;
  }

  public void setNombre(){
    this.nombre = nombre;
  }

  public void setFigura(){
    this.figura = figura;
  }

  public void setDinero(){
    this.dinero = dinero;
  }

}
