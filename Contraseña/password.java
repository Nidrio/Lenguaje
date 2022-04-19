public class Password{
  private int longitud;
  private string contraseña;


// CONSTRUCTORES

  public Password(){
    this.longitud = 8;
    this.pass = "abcdefgh";

  }

  public Password(int longitud, string pass){
    this.longitud = longitud;

    if (pass.length() == longitud){
        this.pass = pass;
    }
    else if (pass.length() < longitud){
        while (pass.length() < longitud){
            pass += "0";
        }

        this.pass = pass;
    }
    else{
      String passRecortada = "";
      for(int i = 0; i<longitud; i++){
        passRecortada += pass.charAt(i);
      }

      this.pass = passRecortada;
  }
  public String toString(){
    return "La contraseña de tamaño " + this.longitud + " es " + this.pass;
  }





}
