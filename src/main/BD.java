package main;

public class BD extends BDTools{
	
	private String dinIni = "2000";
	Jugador jug;
	
	public void buscar (String nombre) {
		
		buscar(nombre);
	}
	
	public void borrar(String nombre) {
		
		buscar(nombre);
		eliminar(getNombre());
		copiar();
		eliminar(getContraseña());
		copiar();
		eliminar(getDinero());
		copiar();
		pr.pri("eliminado");
	} 
	
	public void cambiar(String nombre, String cambio, int i) {
		
		cambiar(nombre, cambio, i);
	}
	
	public void nuevo(String nombre, String pass) {
		
		jug = new Jugador();
		jug.setNombre(nombre);
		jug.setContraseña(pass);
		jug.setDinero(dinIni);
	}
}
