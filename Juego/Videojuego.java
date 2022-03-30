public class Juego extends Videojuego{
  private String plataforma;


//CONSTRUCTORES
public Videojuego(){
    this.plataforma = "Xbox One";
}

public Videojuego(String plataforma){
    this.plataforma = plataforma;
}

//GET

public String getplataforma(){
  return this.plataforma;
}


//SET

public void setplataforma(String plataforma){
  this.plataforma = plataforma;
}


//TO STRING
public String toString(){
    return "La plataforma del juego es " + plataforma;
}



}
