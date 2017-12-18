package application;

import java.util.ArrayList;


public class varasto { // Varasto pitää listaa eri paketeista ja luo niitä.
	ArrayList<esine> varastolista = new ArrayList<esine>();
	private String nimi;
	private boolean sarkyva;
	private boolean kiireellisyys;	
	private float paino;
	private float koko;
	static private varasto v = null;
protected varasto() {
}
static public varasto getinstance() {
	if (v == null) {
		v = new varasto();
		System.out.println("varasto luotu");
		return v;}
	else {
		return v;
}	
}

public void luopaketti(float p, float k, boolean a, boolean b,String c) { // Paketin tyyppi määritellään sen ominaisuuksien perusteella.
	paino = p;
	koko = k;
	kiireellisyys = a;
	sarkyva = b;
	nimi = c;
	
	if ( paino * koko >=30 && kiireellisyys == false && sarkyva == false) {
		esine i = new isoesine(paino, koko, kiireellisyys, sarkyva, nimi);
		varastolista.add(i);
	}
	else if ( paino * koko < 30 && kiireellisyys == false && sarkyva == true) {
		esine j = new sarkyvaesine(paino, koko, kiireellisyys, sarkyva, nimi);	
		varastolista.add(j);
	}
	else if ( paino * koko < 30 &&  kiireellisyys == true && sarkyva == false) {
		esine l = new kiireellinenesine(paino, koko, kiireellisyys, sarkyva, nimi);
		varastolista.add(l);
	}
	else {
		esine o = new paskaesine(paino, koko, kiireellisyys, sarkyva, nimi);
		varastolista.add(o);
	}
}
public esine getesine(String s) {
		   for(esine e : varastolista) {
		      if(e.getnimi().equalsIgnoreCase(nimi)) { return e; }
		   } 
		   return null;
}
}


