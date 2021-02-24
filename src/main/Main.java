package main;

import java.io.IOException;

public class Main {
	
	public static void main (String [] args) throws IOException{
		
		GUI v1 = new GUI();
		v1.setVisible(true);
		
		
		Pruebas pr = new Pruebas();
		pr.BDPr();
		
		/*int res = (int)Math.floor(Math.random()*6+1);
		System.out.println("Oka"+res);
		Dado dado = new Dado();
		dado.resDados();
		System.out.println(dado.getDado1()+" - "+dado.getDado2());
		dado.resDados();
		BD nuevoJug = new BD ("keara","cntra","1700");
		BD nuevo = new BD ("lolita", "pass", "2000");
		nuevoJug.Guardar();
		nuevo.Guardar();
		nuevo.Cambiar("keara","polita",2);
		nuevoJug.Buscar("lolita");*/
	    
		/*System.out.println(nuevoJug.getNombre());
		System.out.println(nuevoJug.getContraseña());
		System.out.println(nuevoJug.getDinero());
		System.out.println("YAguardo");
		Juego juego = new Juego();
		juego.game();*/
	}
}
