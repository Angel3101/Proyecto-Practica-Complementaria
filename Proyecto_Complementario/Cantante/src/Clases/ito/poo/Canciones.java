package Clases.ito.poo;

import interfaces.ito.poo.Arreglo;



public class Canciones implements Arreglo<Compo> {
	private Compo poo[]=null;
	private  int fin=0;
	private final int ANG=5;
	
	public Canciones() {
		super();
		this.poo = new Compo[ANG];
		this.fin = -1;
	}
	private void crecerArreglo() {
		Compo espera[]=new Compo[this.poo.length+ANG];
    for(int i=0;i<this.poo.length;i++)	
    poo=espera;
    }
	
	public boolean addItem(Compo item) {
		
		boolean bandera=false;
		if(!hayIte(item)) {
			if(isFull())
				crecerArreglo();
			int i=0;
			for(;i<=this.fin;i++)
				if(item.compareTo(poo[i])<0) {
					break;
				}
			for(int j=this.fin;j>=i;j--)
				poo[j+1]=poo[j];
			poo[i]=item;
			this.fin++;
			bandera=true;
			}
		return bandera;
	}


	
	public boolean hayIte(Compo item) {
		
		boolean hay=false;
		for(int i=0;i<=this.fin;i++)
			if(item.compareTo(poo[i])==0) {
				hay=true;
				break;
			}
		return hay;
	}

	
	public Compo getItem(int abr) {
		
		Compo aj=null;
		if(!this.isFree()&& abr<=this.fin)
			aj=poo[abr];
		return aj;
	}

	
	public int getSize() {
		return this.fin+1;
	}

	
	public boolean borra(Compo item) {
		
		boolean borra=false;
		if(this.hayIte(item)) {
			int i=0;
			for(;i<=this.fin;i++)
				if(item.compareTo(poo[i])==0)
					break;
			for(;i<this.fin;i++)
				poo[i]=poo[i+1];
			this.fin--;
			borra=true;
		}
		return borra;
	}

	
	public boolean isFree() {
		
		return this.fin==-1;
	}

	
	public boolean isFull() {
		
		return this.fin+1==this.poo.length;
	}
	public Compo[] gettema() {
		return poo;
	}
	public void settema(Compo[] tema) {
		this.poo = tema;
	}
	public int getfin() {
		return fin;
	}
	public void setfin(int fin) {
		this.fin = fin;
	}
	public int getANG() {
		return ANG;
	}
	
	public boolean hayItem(Compo item) {
		
		return false;
	}
	
	public boolean clear(Compo item) {
	
		return false;
	}
}

	