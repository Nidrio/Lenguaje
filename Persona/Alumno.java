 public class Alumno extends Persona{
   public enum Nota{
     SOBRESALIENTE,
     NOTABLE,
     BIEN,
     SUFICIENTE,
     INSUFICIENTE;
   }
// Como traduce Java un ENUM:
/*
  class Nota{
    public static final SOBRESALIENTE = new Nota();
    public static final NOTABLE = new Nota();
    public static final BIEN = new Nota();
  }
  */
  private String grado;               // Acceso desde la propia clase.
          String gradoSinModificador; //Acceso desde el paquete.
  public  String gradoPublico;        // Acceso desde los hijos y desde paquete.
  protected String gradoProtegido;    // Acceso global.
  private Nota nota;
  private String resultadoNotas;      // No tiene set y get


  public Alumno(){
    super();
    this.grado = "DAM";
    this.nota = Nota.SUFICIENTE;
  }
  public Alumno(String nombre, String dni, String grado){
    // Super llama al constructor de la clase superior (de la que extendemos).
    super(nombre,dni);
    this.grado = grado;
    this.nota = Nota.SUFICIENTE;
  }

  public Alumno(Alumno alumno){
    super (alumno.nombre,alumno.dni);
    this.grado = alumno.grado;
    this.nota = alumno.nota;
  }

  private String stringNotas(){
    switch(this.nota){
      case SOBRESALIENTE:
        resultadoNotas = "Oleeeee! Loh caracoleeeeh :D";
        break;
      case NOTABLE:
        resultadoNotas = "Gucci bro ;)";
        break;
      case BIEN:
        resultadoNotas = "Nais :3";
        break;
      case SUFICIENTE:
        resultadoNotas = "Pues por los pelos de Malpica eh!";
        break;
      case INSUFICIENTE:
        resultadoNotas = "Pal pozo primoh D:";
        break;
    }
    return resultadoNotas;
  }

  public String toString(){
    return super.toString() + " Estoy en el grado de " + this.grado + " y el profesor me ha dicho que " + this.stringNotas();
  }
}
