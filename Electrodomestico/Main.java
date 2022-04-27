class Main {
  public static void main(String[] args){
    Electrodomestico miElectrodomestico = new Electrodomestico(120,"miColor","miConsumo",120);
    // Al rellenar miElectrodomestico los valores introducidos para color y consumo no son válidos para comprobar el funcionamiento de los filtros.
    System.out.println(miElectrodomestico);
  }
}
