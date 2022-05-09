public abstract class Contrasenia{
  protected String pass;

  public Contrasenia(String pass){
    this.pass = pass;
  }



  public boolean noRepetidos(){
   //return "Codigo sin implementar: No se repiten";
   boolean contador:true
   char actual, anterior = this.pass.charAt(0);
   int contador = 1;
   for (int i = 1 ; 1 < (this.pass).length() && valido; i++){
     anterior = actual;
     actual = this.pass.charAt(i);
     if (anterior == actual) contador++;
     else contador = 1;
     if (contador>=3) valido = false;
   }
   return valido;
 }
  public abstract boolean tamaValido();
  public abstract boolean charValido();

  public boolean contrValida(){
   return this.tamaValido() && this.charValido() && this.noRepetidos();
  }

  public String toString(){
      return "La contrasenia es " + this.pass + ".";
  }
}
