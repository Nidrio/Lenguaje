class Numerica extends Contrasenia{


    public ContraseniaNum(String pass){
    super(pass);
    }

    public boolean tamaValido(){
    /*// Solución para establecer estructura.
    return "tamaValido sin implementar";
    }
    */
    /* // Solución para devolver String y que sea mas visual.
    String solucion = "Tamanio no valido";
    if ((this.pass)).length() >= 4;
      solucion = "Tamanio valido";
    return solucion;
    */
    return (this.pass).length() >= 4;

    public boolean charValido(){
    /*
      return "charValido sin implementar";
    */
    /*
    char[] numeros = {48,49,50,51,52,53,54,55,56,57,58};
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = false;
      for (int j = 0 ; j < numeros.length; j++){
        if (numeros[j] == this.pass.charAt(i)) valido = true;
      //System.out.println("numero: " + numeros[j] + " la contrasenia: ")
        }
      }
      return valido;
    }

    public boolean charValido(){

      return "charValido sin implementar";
    */
    // Para cada letra de la contraseña pass (this.pass.charAt(i))
    // comprobamos si es un dígito/número con (Character.isDigit(char que queremos comprobar))
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = Character.isDigit(this.pass.charAt(i));
        }
      return valido;
    }
}
