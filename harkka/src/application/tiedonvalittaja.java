package application;

public class tiedonvalittaja { // Tiedonvälittäjä kommunikoi kahden controllerin välillä, joka osoittautui hankalaksi, joten tiedot menevät välittäjän kautta.
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
