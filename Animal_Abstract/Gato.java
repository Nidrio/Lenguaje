class Gato extends Animal{
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return super.durmiendo() + " -> RRrrrrRRRrrr";
  }
  public String comiendo(){
    this.alimentacion = "Pescao";
     return "Yo como" + this.alimentacion;
  }
}
