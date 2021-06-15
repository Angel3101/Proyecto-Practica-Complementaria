package Clases.ito.poo;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lector_de_Objetos_TXT {
	
	private ObjectInputStream archivo;
	
	public Lector_de_Objetos_TXT(String archivo) throws FileNotFoundException, IOException {
		this.archivo= new ObjectInputStream(new FileInputStream(archivo));
	}
	
	public Object readObject() throws ClassNotFoundException, IOException {
		Object aux=null;
		aux= archivo.readObject();
		return aux;
	}
	
	public void close() throws IOException {
		archivo.close();
	}

	public void writeObject(Compo item) {
		
	}

}
