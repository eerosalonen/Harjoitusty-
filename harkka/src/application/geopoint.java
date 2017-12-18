package application;

public class geopoint {// Geopointeissa on tallennettuna kaikkien kaupunkien tiedot helposti käsiteltävissä.
private String city ;
private String code ;
private String addres ;
private String availability;
private String postoffice;
private String lat ;
private String lang ;
public geopoint(String a,String b,String c, String d, String e, String f, String g) {
	city = a;
	addres = b;
	availability = c;
	postoffice = d;
	lat = e;
	lang = f;
	code = g;
}
public String getcity() {
	return city;
}
public String getaddress() {
	return addres;
}
public String getavailability() {
	return availability;
}
public String getpostoffice() {
	return postoffice;
}
public String getcode() {
	return code;
}
public String getlat() {
	return lat;
}
public String getlang() {
	return lang;
}
}
