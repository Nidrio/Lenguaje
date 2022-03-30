class Main{
      public static void main(String[] args){
          System.out.println("Ivan Nidriotakis Delgado");

          Cables miCable = new Cables();
          Adaptador miAdaptador = new Adaptador();
          Cargador miCargador = new Cargador();

          System.out.println("Cargador");
          System.out.println(miCargador);

          System.out.println("Adaptador");
          System.out.println(miAdaptador);

          System.out.println("\n");

          System.out.println("Cable");
          System.out.println(miCable);


          System.out.println("¿Puedo aniadir otro cargador?");
          System.out.println(miAdaptador.puertoDisponible(1,2,3));

          System.out.println(miCable.dispositivoCompatible());


      }
  }
