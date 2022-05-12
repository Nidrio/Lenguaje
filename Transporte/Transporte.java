public enum Transporte{
  AVION(900,10),
  TREN(200,14),
  COCHE(120,12),
  BICICLETA(20,0);


  private double velocidad;
  private double precio100km;

  Transporte(double velocidad, double precio100km){
    this.velocidad = velocidad;
    this.precio100km = precio100km;
  }

  public double getVelocidad(){
    return this.velocidad = velocidad;
  }

  public double getPrecio(){
    return this.precio = precio;
  }

  public void setVelocidad(){
    this.velocidad = velocidad;
  }

  public void setPrecio(){
    this.precio100km = precio100km;
  }


  public double tiempo (double km){
    double tiempoTotal = km/this.velocidad
    double tiempoEspera = 1;
      if (this == AVION) tiempoTotal += tiempoEspera;
    return tiempoTotal;
  }

  public double precio (double km){
    return (this.precio100km/100)*km;
  }
