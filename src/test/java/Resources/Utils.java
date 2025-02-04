package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification req;
	
	public RequestSpecification requestspecification() throws IOException {
		
		if(req==null) {
		PrintStream log = new PrintStream("logging.txt");
		 req = new RequestSpecBuilder()
				 .setBaseUri(getbaseurii("baseuri"))
				 .addQueryParam("key", "qaclick123")
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
				 .build();
		 return req;
		}
		return req;
	}
	
	public String getjsonpath(String key,Response response) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		return js.get(key).toString();
	}
	
	public static String getbaseurii(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\navee\\eclipse-workspace\\Newcucumberproject\\src\\test\\java\\Resources\\getbaseuri.properties");
        prop.load(fis);
        return prop.getProperty(key);
	}

}
