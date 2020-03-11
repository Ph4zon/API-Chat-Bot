package apiProject;
import org.jibble.pircbot.*;

public class MyBot extends PircBot
{
	WeatherAPICall weather;
	ExchangeRateAPICall rates;
	
	public MyBot()
	{
		this.setName("PhazonBot");
	}
	
	public void onMessage(String channel, String sender, String login, String hostName, String message)
	{
		if (message.contains(" "))
		{
			if (message.substring(0, message.indexOf(" ")).toLowerCase().equals("weather"))
			{
				
				weather = new WeatherAPICall(message.substring(message.indexOf(" ") + 1));
				sendMessage(channel, sender + ", the weather in " + weather.toString());
			}
			
			if (message.substring(0, message.indexOf(" ")).toLowerCase().equals("rateof"))
			{
				rates = new ExchangeRateAPICall(message.substring(message.indexOf(" ") + 1).toUpperCase());
				sendMessage(channel, sender + ", " + rates.toString());
			}
		}
	}
}
