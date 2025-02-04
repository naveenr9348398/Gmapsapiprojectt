package Resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.Gmapsserializationbody;
import Pojo.location;

public class Gmapspayload {
	
	public Gmapsserializationbody addplacepayload(String lat,String lng,String accuracy,String name,String phonenumber,String address,String types1,String types2,String website,String language) {
		Gmapsserializationbody gs = new Gmapsserializationbody();
		location l = new location();
		l.setLat(lat);
		l.setLng(lng);
		gs.setLocation(l);
		gs.setAccuracy(accuracy);
		gs.setName(name);
		gs.setPhone_number(phonenumber);
		gs.setAddress(address);
		List<String> mylist = new ArrayList<String>();
		mylist.add(types1);
		mylist.add(types2);
		gs.setTypes(mylist);
		gs.setWebsite(website);
		gs.setLanguage(language);
		return gs;
	}
	
	public String deleteplacepayload(String placeid) {
		String deletepayload = "{\r\n"
				+ "    \"place_id\":\""+placeid+"\"\r\n"
				+ "}";
		return deletepayload;
	}
	
	
	
	
	

}
