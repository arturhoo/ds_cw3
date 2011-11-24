import java.math.BigDecimal;
import java.rmi.RemoteException;

import java.io.*;

import javax.xml.rpc.ServiceException;

import com.cdyne.ws.WeatherWS.*;
import com.daehosting.webservices.temperature.*;


public class cw3 {
	public static void main(String args[]) throws ServiceException, IOException
	{
		// Setting the Locator and Soap for the first Web Service
		TemperatureConversionsLocator tcl = new TemperatureConversionsLocator();
		TemperatureConversionsSoapType soap2 = tcl.getTemperatureConversionsSoap();
		
		// Setting the Locator and Soap for the second Web Service
		WeatherLocator wl = new WeatherLocator();
		WeatherSoap soap1 = wl.getWeatherSoap();
		
		// Invoking the desired method of the Soap object
		WeatherReturn wr = soap1.getCityWeatherByZIP(args[0]);
		
		BigDecimal bd = new BigDecimal(wr.getTemperature());
		
		// Invoking the Soap object from the second webservice using the 
		// data from the first
		BigDecimal tempCelsius = (soap2.fahrenheitToCelcius(bd));
		System.out.println(tempCelsius);
		
		// Writing to HTML file
		FileWriter fstream = new FileWriter("result.html");
		BufferedWriter out = new BufferedWriter(fstream);
		out.write("The temperature in " + wr.getCity());
		out.write(" is " + tempCelsius + " degrees Celsius!");
		out.close();
	}
}
