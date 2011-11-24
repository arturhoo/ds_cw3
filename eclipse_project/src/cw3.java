import java.math.BigDecimal;
import java.rmi.RemoteException;

import java.io.*;

import javax.xml.rpc.ServiceException;

import com.cdyne.ws.WeatherWS.*;
import com.daehosting.webservices.temperature.*;


public class cw3 {
	public static void main(String args[]) throws ServiceException, IOException
	{
		TemperatureConversionsLocator tcl = new TemperatureConversionsLocator();
		TemperatureConversionsSoapType soap2 = tcl.getTemperatureConversionsSoap();
		
		WeatherLocator wl = new WeatherLocator();
		WeatherSoap soap1 = wl.getWeatherSoap();
		
		WeatherReturn wr = soap1.getCityWeatherByZIP(args[0]);
		
		System.out.println(wr.getTemperature());
		
		BigDecimal bd = new BigDecimal(wr.getTemperature());
		BigDecimal tempCelsius = (soap2.fahrenheitToCelcius(bd));
		System.out.println(tempCelsius);
		
		FileWriter fstream = new FileWriter("result.html");
		BufferedWriter out = new BufferedWriter(fstream);
		out.write("The temperature in " + wr.getCity());
		out.write(" is " + tempCelsius + " degrees Celsius!");
		out.close();
	}
}
