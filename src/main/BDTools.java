package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class BDTools extends Jugador{
	
	Pruebas pr = new Pruebas();
	
	private String file = "/home/manuel/eclipse-workspace/Appuesta/Datos.txt";
	private String temp = "/home/manuel/eclipse-workspace/Appuesta/Temp.txt";
	
	//protected Jugador jug = new Jugador();
	
	
	public BDTools() {
		super();
	}
	
	public BDTools(String nombre, String contraseña, String dinero) {
		super(nombre, contraseña, dinero);
	}
	
	public void guardar() {
		pr.pri("y1");
		File fl = null;
		FileWriter fw = null;
		try {
			pr.pri("y2");
			fl = new File(file);
			fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			pr.pri("y3"+ super.getNombre());
			//
			bw.write(super.getNombre());
			pr.pri("y6");
			bw.newLine();
			bw.write(super.getContraseña());
			bw.newLine();
			bw.write(super.getDinero());
			bw.newLine();
			pr.pri("ya4");
			bw.close();
			fw.close();
			System.out.println("Hecho Guardado");
		}catch(IOException e) {
			System.out.println("Paila ");
		}
	}	
	

	public void buscar(String nombre) {
		
		super.setNombre(nombre);
		File fl = null;
		FileReader fr = null;
		
		try {
			fl = new File(file);
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			boolean encontrado = false;
			while ((linea = br.readLine()) != null) {
				pr.pri(linea+" "+nombre);
				if(linea.equalsIgnoreCase(nombre)) {
					for(int i=0;i<2;i++) {
						
						if(i == 0)super.setContraseña(br.readLine());
						if(i == 1)super.setDinero(br.readLine());
						//br.readLine();
					}
					encontrado = true;
					break;
				}
			}
			if(!encontrado) System.out.println("El usuario no existe");
			
			br.close();
			fr.close();
			System.out.println("Hecho Buscado");
		
		}catch(IOException e) {
			System.out.println("Paila ");
		}
	}
	
	public void cambiar (String nombre, String cambio, int i) {
		
		this.buscar(nombre);
		this.eliminarU(nombre);
		this.copiar();
		if(i == 0)super.setNombre(cambio);
		if(i == 1)super.setContraseña(cambio);
		if(i == 2)super.setDinero(cambio);
		System.out.println("nombre:"+super.getNombre()+" pass: "+super.getContraseña()+" $ "+super.getDinero());
		this.guardar();
	}
	
	/*public void cambiar(String nombre, String cambio, int i) {
		pr.pri("ya");
		buscar(nombre);
		File fl = null;
		FileReader fr = null;
		
		try {
			fl = new File(file);
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			boolean encontrado = false;
			while ((linea = br.readLine()) != null) {
				pr.pri(linea+" "+nombre);
				if(linea.equalsIgnoreCase(nombre)) {
					
					pr.pri("ya");
					if(i == 0)super.setNombre(cambio);
					if(i == 1)super.setContraseña(cambio);
					if(i == 2)super.setDinero(cambio);

					encontrado = true;
					break;
				}
			}
			this.eliminar(nombre);
			System.out.println("nombre:"+super.getNombre()+" pass: "+super.getContraseña()+" $ "+super.getDinero());
			this.guardar();
			if(!encontrado) System.out.println("El usuario no existe");
			
			br.close();
			fr.close();
			System.out.println("Hecho Buscad2");
		
		}catch(IOException e) {
			System.out.println("Paila ");
		}
	}*/
	
	public void eliminarU(String cambio) {
		
		File fl1 =new File(temp);
		File fl = new File(file);

	    try {
	    	BufferedReader br = new BufferedReader(new FileReader(fl));
	    	PrintWriter bw = new PrintWriter(new FileWriter(fl1));

	    	String linea;

	    while((linea = br.readLine()) != null) {                        
	    	String trimmedLine = linea.trim();
	    	if(trimmedLine.equals(cambio)) { 
	    		br.readLine();
	    		br.readLine();
	    		continue;
	    	}
	    	bw.write(linea + System.getProperty("line.separator"));	
	    	this.copiar();
	    }   
	    
	    
	    br.close();
	    bw.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
public void eliminar(String cambio) {
		
		File fl1 =new File(temp);
		File fl = new File(file);

	    try {
	    	BufferedReader br = new BufferedReader(new FileReader(fl));
	    	PrintWriter bw = new PrintWriter(new FileWriter(fl1));

	    	String linea;

	    while((linea = br.readLine()) != null) {                        
	    	String trimmedLine = linea.trim();
	    	if(trimmedLine.equals(cambio)) continue;
	    	bw.write(linea + System.getProperty("line.separator"));	
	    	this.copiar();
	    }   
	    
	    
	    br.close();
	    bw.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void copiar () {

		File tem = new File(temp);
		if (tem.exists()) {
		    try {
		        InputStream in = new FileInputStream(tem);
		        OutputStream out = new FileOutputStream(file);

		        byte[] buf = new byte[1024];
		        int len;
		        while ((len = in.read(buf)) > 0) {
		            out.write(buf, 0, len);
		        }
		        in.close();
		        out.close();

		    } catch (IOException ioe) {
		        ioe.printStackTrace();

		    }
		} else {

		}
	}	
}
