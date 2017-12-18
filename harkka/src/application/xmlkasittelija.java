package application;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class xmlkasittelija { // Xmlk‰sittelij‰ss‰ smartpostdata k‰sitell‰‰n muotoon, miss‰ siit‰ voidaan hakea tietty kaupunki ja t‰t‰ kautta kaikki ominaisuudet.
static private xmlkasittelija v = null;
protected xmlkasittelija() {
}
static public xmlkasittelija getinstance() {
	if (v == null) {
		v = new xmlkasittelija();
		System.out.println("xmlkasittelija luotu");
		return v;}
	else {
		return v;
}}	
public static ArrayList<geopoint> paikkatiedot = new ArrayList<geopoint>(); // lista miss‰ kaikkien kaupunkien data on geopoint olioissa.
public void lukija() { // Lukija parsii xml tiedoston hakee elementtien tiedot, ja lopuksi luo niist‰ geopoint oliot.
	DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
	Class<?> getc = getClass();
	InputStream i = getc.getResourceAsStream("smartpostdata.xml");
	try {
		DocumentBuilder b = f.newDocumentBuilder();
		try {
			Document d = b.parse(i);
			NodeList pohjanodet = d.getElementsByTagName("place");
			for (int w = 0; w < pohjanodet.getLength(); w++) {
				
				Node paikka = pohjanodet.item(w);
				Element juttu = (Element) paikka;
				geopoint g = new geopoint(juttu.getElementsByTagName("city").item(0).getTextContent(),juttu.getElementsByTagName("address").item(0).getTextContent(),juttu.getElementsByTagName("availability").item(0).getTextContent(),juttu.getElementsByTagName("postoffice").item(0).getTextContent(),juttu.getElementsByTagName("lat").item(0).getTextContent(),juttu.getElementsByTagName("lng").item(0).getTextContent(),juttu.getElementsByTagName("code").item(0).getTextContent());
				paikkatiedot.add(g);

		}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public geopoint searchlahto(String a) { // Yksinkertainen hakufunktio, joka vertaa array listin olion kaupungin nime‰ annettuun Stringiin, joka sitten palauttaa lˆydetyn olion.
	   for(geopoint o : paikkatiedot) {
	      if(o.getcity().equalsIgnoreCase(a)) { return o; }
	   } 
	   return null;
	}
}
