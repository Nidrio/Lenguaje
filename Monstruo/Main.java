import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
    System.out.println("Ivan Nidriotakis Delgado");

		Monstruo miMonstruo = new Monstruo();
		MonstruoJugador miMonstruoJugador = new MonstruoJugador("Bobobo");

		int opcion;
			do{
				System.out.println("MENU DE BOBOBO");
				System.out.println("1.Fight");
				System.out.println("2.Run");
				System.out.println("3.My Stats");
				System.out.println("4.Enemy Stats");
				try{
					opcion = Integer.nextInt();
					System.out.println("Elige una de las opciones");
				} catch (NumberFormatException  exNum){
					System.out.println("Debe introducir un numero en el menu del jugador.");
					}
				}


		}
}
