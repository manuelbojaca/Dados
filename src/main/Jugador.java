package main;

public class Jugador {
	private String nombre = "";
	private String contraseña = "";
	private String dinero = "";
	
	public Jugador () {
		super();
	}
	
	public Jugador(String nombre, String contraseña, String dinero) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getDinero() {
		return dinero;
	}
	public void setDinero(String dinero) {
		this.dinero = dinero;
	}
	
	
}