class Main {

	static Random rand = new Random();

	public static Jugador addPlayer(Scanner scan){
		String[] figuras = {"Pikachu", "Bulbasaur", "Charmander", "Squirte", "Jigglypuff", "Togetic"};

		System.out.println("\nBienvenido a Monopoly\nAntes de comenzar, vamos a necesitar que realices unos trámites");
		System.out.println("\n¿Como te llamas? : ");
		String nombre = scan.nextLine();
		boolean esFigura = false;
		String figura = "";


		while (esFigura == false){
			System.out.println("\n¿Que figura deseas ser ? : ");
			System.out.println("Figuras disponibles : \n");

			for (String f : figuras){
				System.out.println(f);
				}

			figura = scan.nextLine();

			for (String f : figuras){
				if (f.equals(figura)){
					esFigura = true;
				}
			}

		}

		System.out.println("\nHemos creado tu jugador con tus datos");
		Jugador miJugador = new Jugador(nombre, figura);
		return miJugador;


	}

	public static int posicion_jugador(int previa_pos , int posicion){
		int casilla = 0;

		if ( posicion > 9){
			casilla = posicion - 9;
		} else {
			casilla = posicion + previa_pos;
			if (casilla > 9){
				casilla = casilla - 9;
			}

		}

		return casilla  ;
	}

	public static void startMonopoly(Scanner scan, int user, int tirar, int dado1, int dado2, String[] calles_Monopoly, Jugador miJugador){
		int posicion_previa = 0;

		while (true) {
			System.out.println("\n---- Menu de Juego------\n[1] Tirar dados\n[2] Imprimir jugador");
			user = scan.nextInt();

			if (user == 1) {
				dado1 = tirar_Dados();
				dado2 = tirar_Dados();
				tirar = dado1 + dado2;
				int posicion = posicion_jugador (posicion_previa,tirar);
				posicion_previa = posicion;
				System.out.println("\n----Tu TURNO---\nEstas en la casilla " + posicion ) ;
				System.out.println("Has tirado los dados, salió " + dado1 + "(dado 1)" + " y " + dado2 + "(dado 2)" + ", tienes un " + tirar + " al tirar los dados");
				boolean calle = imprimirCalle(calles_Monopoly, posicion );

				if (calle == false) miJugador.setDinero(200);

			}

			else if (user == 2){
				System.out.println(miJugador);
			}

		}
	}

  	public static boolean imprimirCalle(String calles[], int dados){
  		boolean esCalle = true;
			dados = dados%11;
			Calles miCalle;

		if (calles[dados].equals("Salida")){
			System.out.println("\n!!!!!!!!!!!!!!!!\nHas pasado por SALIDA\nCobras 200€\n!!!!!!!!!!!!!!!!!!!!\n");
			esCalle = false;

		}

		else {
			miCalle = Calles.valueOf(calles[dados]) ;
			System.out.println(miCalle);

		}
		return esCalle;

  	}

	public static int tirar_Dados(){
		int random = rand.nextInt((6 - 1)+1) + 1;

		return random;
	}


	public static void main(String[] args) {
		Calles calles[] = Calles.values();
		String[] calles_Monopoly = new String[11];
		int pos = 0;
		int dado1 = 0;
		int dado2 = 0;
		int tirar = 0;
		Scanner  scan = new Scanner(System.in);
		int user = 0;
		int posicion_jugador = 0;
		Jugador miJugador = new Jugador("anonymous", "empty");


		for (Calles cl : calles){
			//System.out.println(cl.toString());
			calles_Monopoly[0] = "Salida";
			calles_Monopoly[pos] = cl.getNombre();
			pos +=1;


		}

		//---- Calles Monopoly -----
		for (String cl : calles_Monopoly){
			//System.out.println(cl);

		// ---------MONOPOLY----------

		// Creamos un jugador
		miJugador = addPlayer(scan);


		// Comenzamos el juego
		startMonopoly(scan, user, tirar, dado1, dado2, calles_Monopoly, miJugador);


	}

}

}
