class Main{
  public static void Main(String[] args){
    System.out.println("Ivan Nidriotakis Delgado");

    Animal miAnimal = new Animal();
    System.out.println(miAnimal);
    miAnimal.setEspecie("Hipogrifo");
    miAnimal.setNAnimales(22);
    miAnimal.setComidaFav("Unicornios");
    miAnimal.setNPatas(4);
    System.out.println(miAnimal);


    Gallina miGallina = new Gallina();
    System.out.println(miGallina);
    miGallina.setHuevosDia(2);
    miGallina.setDiasPoniendo(7);
    miGallina.sethuevosTotales();
    System.out.println(miGallina);
  }
}
