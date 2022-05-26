import java.util.Random;
import java.util.Scanner;

enum Calles{
  ("EEVEE", "MARRON", 220, 0),
	("GLACEON", "CELESTE", 180, 0),
	("UMBREON", "NEGRO", 340, 0),
	("FLAREON", "ROJO", 480, 0),
	("DRACEON", "GRIS", 220, 0),
	("JOLTEON", "AMARILLO", 260, 0),
	("LEAFEON", "VERDE", 300, 0),
  ("VAPOREON", "AZUL", 320, 0),
  ("SYLVEON", "ROSA", 350, 0),
  ("ESPEON", "MORADO", 400, 0);

	private String nombre;
	private String color;
	private int venta;
	private int alquiler;

	Calles(String nombre, String color, int precio_venta, int alquiler){
		setNombre(nombre);
		setColor(color);
		setVenta(venta);
		setAlquiler(venta);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setVenta(int venta){
		this.venta = venta;
	}

	public void setAlquiler(int venta){
		this.alquiler = (venta * 25) / 100;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getColor(){
		return this.color;
	}

	public int getVenta(){
		return this.venta;
	}

	public int getAlquiler(){
		return this.alquiler;
	}


  }
