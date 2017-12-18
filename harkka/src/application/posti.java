package application;

import java.util.ArrayList;

public class posti { //Posti pit‰‰ sis‰ll‰‰n listaa posti pisteiden tiedoista.
	static private posti v = null;
protected posti() {
}
static public posti getinstance() {
	if (v == null) {
		v = new posti();
		System.out.println("posti luotu");
	
		return v;}
	else {
		return v;
}	
}
ArrayList<String> paatepistelista = new ArrayList<String>();
void addpaatepiste(String a){
	paatepistelista.add(a);
}
ArrayList<tiedonvalittaja> valityslista = new ArrayList<tiedonvalittaja>();
void addvalitys(tiedonvalittaja b){
	valityslista.add(b);
}
public void erasevalitys() {
	valityslista.remove(0);
}
}