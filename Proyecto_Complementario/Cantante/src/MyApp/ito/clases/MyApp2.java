package MyApp.ito.clases;

import java.io.FileNotFoundException;

import Clases.ito.poo.Composicion;
import Clases.ito.poo.EscritorArchivoTXT;
import Clases.ito.poo.LectorArchivoTXT;

public class MyApp2 {
	static Compo b=new Compo(null);
	static EscritorArchivoTXT archivo;
	static LectorArchivoTXT archivo2;
	
	static void run() throws Exception {
		
		aplicacion2.menu();
		   
			
    }
	
	
	static void crearArchivo() throws FileNotFoundException {
		archivo = new EscritorArchivoTXT("compo.txt");
	}


	
	public static void main(String[] args) throws Exception{
	
			run();
			
			
	}
	

}

