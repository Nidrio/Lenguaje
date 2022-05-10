class Letras extends Contrasenia{
  public ContraseniaNum(String pass){
  super(pass);
  }

  public boolean tamaValido(){

  return (this.pass).length() >= 4;
}
