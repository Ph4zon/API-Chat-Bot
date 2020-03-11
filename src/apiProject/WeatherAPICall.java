package apiProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import com.google.gson.*;

public class WeatherAPICall 
{
	Gson gson = new Gson();
	WeatherData data;
	URL url;
	String key = "f374462b5c4e4e9e283f0fa0af78052c";
	String apiUrl = "http://api.openweathermap.org/data/2.5/weather?zip=";
	String zipCode;
	
	public WeatherAPICall(String zip)
	{
		zipCode = zip;
	}
	
	public void populate()  throws IOException
	{
		url = new URL(apiUrl + zipCode + ",us&APPID=" + key);
		HttpURLConnection com = (HttpURLConnection) url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(com.getInputStream()));
		data = gson.fromJson(in,  WeatherData.class);
	}
	
	public String toString()
	{
		try
		{
			populate();
			return data.getName() + ": The current temprature is " + kToF(data.getMain().getTemp()) +
				" degrees F, the high is " + kToF(data.getMain().getTempMax()) + " degrees F and the low is " + 
				kToF(data.getMain().getTempMin()) + " degrees F, the current wind speed is " + data.getWind().getSpeed() +
				" the humidity is currently " + data.getMain().getHumidity();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public int kToF(double kelvin)
	{
		return (int)((kelvin - 273.15) * 9.0 / 5.0 + 32);
	}
}
