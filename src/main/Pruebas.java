package main;

import java.util.Scanner;

public class Pruebas {
	
	public void BDPr() {
		
		String s;
		do {
			BD bd = new BD();
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
					bd.borrar(sca());
					pri("eliminado");
					break;
				case "3":
					bd.cambiar(sca(), sca(), sca(0));
					pri("cambiado");
					break;
				case "4":
					bd.nuevo(sca(),sca());
					pri("Guardado");
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
	
	public void pri (int arg) {
		System.out.println(arg);
	}
	
}
