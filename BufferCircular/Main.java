import java.util.Scanner
class Main{
  public static void mostrarBuffer(String[] arr){
    System.out.println("| ");
    for (String s : arr){
      System.out.println(s);
      System.out.println(" | ");
    }
      System.out.println();
   }
   public static void escribir(String[] arr, int pos,
   String nota){
     pos = pos%15;
     arr[pos] = nota;

   }




  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] buff = new String [15];
    int opcion;
    int posLectura = 0, posEscritura = 0;

  mostrarBuffer(buff);


  while(true){
    System.out.println("Quiere: \n 1.Leer \n 2.Escribir \n 3.Mostrar Buffer.");
    opcion = Integer.parseInt(sc.nextLine());

    if (opcion == 1){
      System.out.println("Leemos");
    } else if(opcion == 2){
      System.out.println("Escribimos");
      String nota = "algo"+posEscritura;
      escribir(buff,posEscritura,"algo");
      posEscritura++;
    } else if (opcion == 3){
      mostrarBuffer(buff);
    } else {
      System.out.println("Debe introducir un valor valido.");
    }
  }

  }
}
