package main;

public class BD extends BDTools{
	
	private String dinIni = "2000";
	//private Jugador jug;
	
	public void buscar (String nombre) {
		
		System.out.println("bd.buscar");
		super.buscar(nombre);
	}
	
	public void borrar(String nombre) {
		
		super.buscar(nombre);
		super.eliminar(super.getNombre());
		super.copiar();
		super.eliminar(super.getContraseña());
		super.copiar();
		super.eliminar(super.getDinero());
		super.copiar();
		pr.pri("eliminado");
	} 
	
	public void cambiar(String nombre, String cambio, int i) {
		
		super.cambiar(nombre, cambio, i);
	}
	
	public void nuevo(String nombre, String pass) {
		
		super.setNombre(nombre);
		super.setContraseña(pass);
		super.setDinero(dinIni);
		super.guardar();
	}
}
