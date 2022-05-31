public enum Material{
  (DIAMANTE,5),
  (ORO,3),
  (PLATA,2),
  (NADA,0),
  (CACA,3);

  private String nombre;
  private int valor;

  Material(String nombre, int valor){
    this.nombre = nombre;
    this.valor = valor;

  }

  public String getNombre(){
    return this.nombre;
  }

  public int getValor(){
    return this.valor;
  }

  public void setNombre(){
    this.nombre = nombre;
  }

  public void setValor(){
    this.valor = valor;
  }
}
