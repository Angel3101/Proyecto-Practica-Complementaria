package MyApp.ito.clases;
import java.util.Scanner;
import java.io.FileNotFoundException;
import.java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import Clases.ito.poo.Lector_de_Archivos_TXT;
import Clases.ito.poo.Escritor_de_Archivos_TXT;
import Clases.ito.poo.Escritor_de_Objetos_TXT;
import Clases.ito.poo.Lector_de_Objetos_TXT;
import exepsiones.ito.poo.Excepciondescenso;
import exepsiones.ito.poo.ExcepcionCompo;
import interfaces.ito.poo.Arreglo;
import Clases.ito.poo.Canciones;
import Clases.ito.poo.Compo;



public class Aplic1 {
	
	static Canciones b=new Canciones();
	private static Scanner o;
	private static Scanner j;
	private static String contestacion;
	private static int x;
	private static Compo ab;
	static void menu() throws Exception {
		inicializa programa();
		Scanner j=new Scanner(System.in);
		
		
		int contestacion;
		while(true) {
		String acciones="Indique la opcion a utilizar por favor:\n 1)Ingresar Cancion\n 2)Lista Cancion\n 3)Ingresar Compositores\n 4)Borrar Compositor\n 5)Quitar Cancion\n"
				+ "6)Exit";
		
		Scanner j=new Scanner(System.in);
		System.out.println(acciones);
		j=new Scanner(System.in);
		
		switch(contestacion) {
		
		
		case 1:Ingresar Cancion();break;
		
		case 2:lista Cancion();break;
		
		case 3:Ingresar Compositores();break;
		
		case 4:Borrar Compositor();break;
		
		case 5:Quitar Cancion();break;
		
		  }
		
		if(contestacion==7)break;
		
		}
	}
	
	private static void inicializa programa() {
		
		
	}
     
 
	    static Cancion Alta()throws Exception{ 
		Scanner j=new Scanner(System.in);
		Cancion Angel=new Compo (null, null, null, null, null);
		
		System.out.println("Ingresa el nombre del tema");
		Angel.settema(j.nextLine());
		
		System.out.println("Ingresa la fecha de inscripcion aaaa-dia-mes:");
		String fecha=j.nextLine();
		
		Angel.setfechadeInscripcion(LocalDate.parse(fecha));
		System.out.println("Ingresa la fecha del debut aaaa-dia-mes:");
		
		String debutfecha=j.nextLine();
		System.out.println("Ingrese el tiempo en que dura el tema");
		
		Angel.setDuracionpista(j.nextFloat());j.nextLine();
		System.out.println("Ingrese el tipo de Genero");
		
		Angel.setTipoGenero(j.nextLine());
		System.out.println("Ingrese los Cantantes que van a dedicar la cancion requerida");
		
	    Angel.setcompositores(j.nextLine());
		angel.setdebutfecha(LocalDate.parse(debutfecha));
		
		return Angel; 
		
		
		
		static Compo al Azar(String al Azar) {
			 Compo o=null; int a=0;
			    for (;a <o.getSize();a++) {
			      ab = o.getItem(a);
			      System.out.println(o.getItem(a)+" Es la Cancion "+al Azar);
			      String contestacion=o.nextLine();
			      if(contestacion.equalsIgnoreCase(""))
			    	 break;
			      ab=null;
			    }
				return ab;
		
	}
	 
	 
	 static void añadirCompo() throws Exception,ExcepcionCompo {
		 Compo reciente;
		 reciente= Alta();
		 if(g.addItem(reciente))
			 System.out.println("¡Se añadio la Cancion solicitada Satisfactoriamente!");
		 
	 else
		  throw new ExcepcionCompo("La cancion existe,No se agrego correctamente");  
		  
		  
      		     
}
	 
	 static void Quitar Interprete() {
		 if(!j.isFree()) {
			 Composicion j=al Azar("Se elimino");
			 System.out.println("Añade el nombre del que interpreto para quitarlo de su funcion");
			 j.Quitar Interprete(j.nextLine());
		 }else
			 System.out.println("No hay elaboracion musical");
	 }


	 }
	  
	 
	 static void Ingresa Cancion() {
		 if(!x.isFree) {
			 Compo x= al Azar("Ingresar");
			 System.out.println("Añade nombre de los compositores");
			 x.agregarCompositores(x.nextLine());
			 
		 }else
			 System.out.println("No hay Interpretacion");
		 
			 
			 
	 }
	 static void QuitarCompo() throws Excepciondescenso{
		 if(!b.isFree()) {
			 Compo b=al Azar("Eliminando Canciones");
			 if(b.getCompositores().equals(null)||b.getCompositores().equals("")) {
				 if(b!=null) {
					 b.delete(b);
					 	System.out.println("Las canciones han sido eliminadas");
				 }else
					  throw new Excepciondescenso ("Solo y Solamente se puede eliminar las canciones sin compositores");
	 
	 }

	 
	 static void lista cancion(){
			if(!c.isFree()) {
				System.out.println("::Listado de Canciones::");
				for(int c=0;g<c.getSize();c++)
					System.out.println(c.getItem(c));
			}	
			else
				System.out.println("No hay canciones");
	 }
	 
	 
	 
		 }
	 }
	 
	 
	

