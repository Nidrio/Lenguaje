import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    Persona miPersona = new Persona();
    Alumno alumnoDefecto = new Alumno();
    Alumno miAlumno = new Alumno("Marivi","98765432H","ASD");
    //System.out.println(miPersona);
    System.out.println(miAlumno);
    
    ArrayList<Integer> lista = new ArrayList();
    lista.add(4);
    lista.add(5);
    System.out.println(lista);

    ArrayList<Alumno> listaAlumno = new ArrayList();
    listaAlumno.add(miAlumno);
    listaAlumno.add(alumnoDefecto);
    System.out.println(listaAlumno);
    System.out.println(listaAlumno.get(0).getNombre());

  }
}
