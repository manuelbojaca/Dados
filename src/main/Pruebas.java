package main;

import java.util.Scanner;

public class Pruebas {
	
	
	
	public void BDPr() {
		
		String s;
		do {
			BDTools bd = new BDTools();
			this.pri("Que deseas Hacer:");
			this.pri("1.Buscar y agragar a una Clase");
			this.pri("2.Borrar");
			this.pri("3.Cambiar valor");
			this.pri("4.Agregar entrada");
			s = sca();
			switch(s){
				case "1":
					bd.buscar(sca());
					pri(bd.getNombre());
					pri(bd.getContraseña());
					pri(bd.getDinero());
					break;
				case "2":
					bd.buscar(sca());
					bd.eliminar(bd.getNombre());
					bd.copiar();
					bd.eliminar(bd.getContraseña());
					bd.copiar();
					bd.eliminar(bd.getDinero());
					bd.copiar();
					pri("eliminado");
					break;
				case "3":
					bd.cambiar(sca(), sca(), sca(0));
					pri("cambiado");
					break;
				case "4":
					bd.setNombre(sca());
					bd.setContraseña(sca());
					bd.setDinero("0");
					bd.guardar();
			}
		}while(s != "5");
			
	}
	
	public String sca () {
		Scanner sc = new Scanner(System.in);
		String arg = sc.nextLine();
		return arg;
	}
	
	public int sca (int i) {
		Scanner sc = new Scanner(System.in);
		int arg = sc.nextInt();
		return arg;
	}
	
	public void pri (String arg) {
		System.out.println(arg);
	}
	
}
