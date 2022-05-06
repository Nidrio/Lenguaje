class Gato extends Animal{
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return super.durmiendo() + " -> RRRrrrrRRRRrrRRRrrR";
  }
  public String comiendo(){
    this.alimentacion = "Peces";
    return "Yo como " + this.alimentacion;
  }
}

class Gato implements Animal_Intrfz{
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "ZzzZz -> RRRrrrrRRRRrrRRRrrR";
  }
  public String comiendo(){
    String alimentacion = "peces";
    return "Yo como " + alimentacion;
  }
}
