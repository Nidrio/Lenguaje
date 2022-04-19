public class Cuenta{

  private String titular;
  private double saldo;

  //CONSTRUCTORES

    public Cuenta(){
      this.titular = "";
      this.saldo = 0;
    }

    public Cuenta(String titular){
      this.titular = titular;
      this.saldo = 0;
    }

    public Cuenta(String titular, double saldo){
      this.titular = titular;
      if (saldo>0){
        this.saldo = saldo;
      }
      else{
          this.saldo = 0;
      }
    }

  //GET

    public String getTitular(){
      return this.titular;
    }

    public double getSaldo(){
      return this.saldo;
    }

  //SET

    public void setTitular(String titular){
      this.titular = titular;
    }

    public void setSaldo(double saldo){
      if (saldo>0){
        this.saldo = saldo;
      }
    }

  //METODO
    public void ingresar(double cantidad){
      if ( cantidad > 0 ){
          this.saldo += cantidad;
       }
    }

    public void retirar(double cantidad){
      if( cantidad > 0 ){
         this.saldo -= cantidad;
      }

      if( this.saldo <0 ){
           this.saldo = 0;
      }
    }


  // TO STRING
    public String toString(){
      return "El titular " + this.titular + " tiene " + this.saldo + " euros en la cuenta";
    }

}
