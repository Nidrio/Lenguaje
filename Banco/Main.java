class Main{
    public static void main(String[] args){
       Cuenta miCuenta = new Cuenta ("Fideo", 500);
       System.out.println(miCuenta);

       miCuenta.ingresar(300);
       System.out.println(miCuenta);

       miCuenta.retirar(900);
       System.out.println(miCuenta);
    }
}
