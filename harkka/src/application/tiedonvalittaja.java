package application;

public class tiedonvalittaja { // Tiedonv�litt�j� kommunikoi kahden controllerin v�lill�, joka osoittautui hankalaksi, joten tiedot menev�t v�litt�j�n kautta.
private String b;
private String c;
private String d;
public tiedonvalittaja(String lahto, String loppu ,String luokka) {
b = lahto;
c = loppu;
d = luokka;
}
public String getvalitys1() {
	return b;
}
public String getvalitys2() {
	return d;
}
public String getvalitys3() {
	return c;
}
}
