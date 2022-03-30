public class Adaptador{
    private int potenciaDeEntrada;
    private int potenciaDeSalida;
    private int numeroPuertos;

    private int puertosUsados;

    public Adaptador(){
        this.potenciaDeEntrada = 55;
        this.potenciaDeSalida = 20;
        this.numeroPuertos = 3;
        this.puertosUsados = 0;
    }

    public Adaptador(int potenciaDeEntrada, int potenciaDeSalida, int numeroPuertos, int puertosUsados){
        this.potenciaDeEntrada = potenciaDeEntrada;
        this.potenciaDeSalida = potenciaDeSalida;
        this.numeroPuertos = numeroPuertos;
        this.puertosUsados  = puertosUsados;
    }

    //GET

    public int getpotenciaEntrada(){
        return this.potenciaDeEntrada;
    }

    public int getPotenciaSalida(){
        return this.potenciaDeSalida;
    }

    public int getNumPuertos(){
        return this.numeroPuertos;
    }

    public int getPuertosUsados(){
        return this.puertosUsados;
    }


    //SET

    public void setpotenciaEntrada(int potenciaDeEntrada){
        this.potenciaDeEntrada = potenciaDeEntrada;
    }
    public void setPotenciaSalida(int potenciaDeSalida){
        this.potenciaDeSalida = potenciaDeSalida;
    }

    public void setNumPuertos(int numeroPuertos){
        this.numeroPuertos = numeroPuertos;
    }

    public void setPuertosUsados(int puertosUsados){
        this.puertosUsados = puertosUsados;
    }


    public String toString(){
        return "La potencia de entrada es de " + potenciaDeEntrada + ", la potencia de salida es de " + potenciaDeSalida + ", los numeros de puertos que tiene son de " + numeroPuertos;
    }
}
