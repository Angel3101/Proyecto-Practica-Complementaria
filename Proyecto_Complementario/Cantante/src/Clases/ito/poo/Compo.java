
package Clases.ito.poo;

import java.io.Serializable; 
import java.sql.Date;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
// Start of user code (user defined imports)

// End of user code

public class Compo implements Comparable <Compo> {
	private String tema;
	private Float duracionpista;
    private static Serializable compositores= new ArrayList<String>();
    private static java.util.List<String> cantante= new ArrayList<String>();
	private String TipoGenero;
	private java.time.LocalDate fechadeInscripcion = null;
	private java.time.LocalDate debutfecha = null;

	
	public Compo(String tema, Float duracionpista, String TipoGenero ,LocalDate fechadeInscripcion, LocalDate debutfecha) {
		super();
		this.tema = tema;
		this.duracionpista= duracionpista;
		this.compositores = compositores;
		this.cantante = cantante;
		this.TipoGenero = TipoGenero;
		this.fechadeInscripcion =fechadeInscripcion ;
		this.debutfecha = debutfecha;
		
		
	} 
	    public  String musicoCDMX(String nuevomusico) {
		musico.add(nuevomusico);
	    return nuevomusico ;
	    
	    }
	    
	    public  String solicitarIngresacantante(String nuevocantante) {
		((ArrayList<String>) compositores).add(nuevocantante);
	    return nuevocantante;
	}
	
	}

	public String gettema() {
		return tema;
	}


	public void settema(String tema) {
		this.tema = tema;
	}


	public Float getduracionpista() {
		return duracionpista;
	}


	public void setduracionpista(Float duracionpista) {
		this.duracionpista = duracionpista;
	}


	public static String getcompositores() {
		return (String) compositores;
	}


	public static void setcompositores(List<String> compositores) {
		Composicion.compositores = (Serializable) compositores;
	}


	public String getTipoGenero() {
		return TipoGenero;
	}


	public void setTipoGenero(String TipoGenero) {
		this.TipoGenero = TipoGenero;
	}


	public java.time.LocalDate getfechadeInscripcion() {
		return fechadeInscripcion;
	}


	public void setfechadeInscripcion(java.time.LocalDate fechadeInscripcion) {
		this.fechadeInscripcion = fechadeInscripcion;
	}


	public java.time.LocalDate getfechadeInscripcion() {
		return fechadeInscripcion;
	}


	public void setfechadeInscripcion(java.time.LocalDate fechaDeInscripcion) {
		this.fechadeInscripcion = fechadeInscripcion;
	}

	
	public void setDuracionPista(float nextFloat) {
		// TODO Auto-generated method stub
		
	}
	public void setInterpretes(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean borra cantante (String a) {
		boolean borra=false;
		if(a.equals(this.cantante)) {
			this.cantante=null;
			borra=true;
		}else
			borra=false;
		return borra;
		
	
	}
	
	public boolean añadir compositores(String a){
		boolean añadir = false;
		if (a!= null&&!a.equalsIgnoreCase("")) {
			this.compositores=a;
				añadir = true;
		}else
			añadir=false;
		return añadir;
	}
	
		
	}
		
		public String toString() {
			return "Composicion [tema=" + tema + ", duracionpista=" + duracionpista + ", TipoGenero=" + TipoGenero
					+ ", fechadeInscripcion=" + fechadeInscripcion + ", debutfecha=" + debutfecha + "]";
	}
	
		
	}
	public int compareTo(Compo a) {
		int compare=0;
		if(this.tema.equals(a.gettema()))
		compare=-1;
		else if(!this.tema.equalsIgnoreCase(a.gettema()));
			compare=1;
		return compare;
}
	public Compo getpoo(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Compo getItem(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
