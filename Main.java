class Main {
	public static void main(String[] args) {

		Motor miMotor = new Motor();
		Ventana miVentana = new Ventana();
		Puerta miPuerta = new Puerta();
    Coche miCoche = new Coche();
    System.out.println(miCoche);
    //Ver como esta el motor:
    System.out.println(miCoche.getMotor());

		System.out.println(miPuerta);
    //Ver como esta la ventana de la puerta derecha:
		System.out.println(miCoche.getPuertaDer());
		//Abrir puerta derecha:
		miCoche.getPuertaDer().abrir();
		Systema.out.println(miCoche);






	}
}
