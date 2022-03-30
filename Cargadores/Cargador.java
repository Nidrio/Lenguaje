public class Cargador{
    private Adaptador suAdaptador;
    private Cables suCable;


    public Cargador(){
        this.suAdaptador = new Adaptador();
        this.elCable = new Cables();
    }

    //GET

    public Adaptador getsuAdaptador(){
        return this.suAdaptador;
    }

    public Cables getsuCable(){
        return this.elCable;
    }


    //toString

    public String toString(){
        return "El cargador tiene un cable que es " + suCable + " y su adaptador es " + suAdaptador;
    }

}
