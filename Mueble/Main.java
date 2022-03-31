class Main{
  public static void main(String[] args){
    Mueble mesa = new Mueble();
    System.out.println(mesa);
    mesa.setMaterial("Madera");
    mesa.setDimensiones(12, 44, 27);
    System.out.println(mesa);
    System.out.println(mesa.Superficie(50,20));


    Mesa miMesa = new Mesa();
    System.out.println(miMesa);
    miMesa.setNPatas(5);
    miMesa.setDimensiones(12,7,18);
    System.out.println(miMesa);
    System.out.println(miMesa.Superficie(12, 7));

    Armario miArmario = new Armario();
    System.out.println(miArmario);
    miArmario.setTipoPuerta("Puerta doble");
    miArmario.setNBaldas(3);
    System.out.println(miArmario);
    }
}
