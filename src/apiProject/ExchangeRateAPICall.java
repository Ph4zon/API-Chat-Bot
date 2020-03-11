package apiProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import com.google.gson.*;

public class ExchangeRateAPICall 
{
	Gson gson = new Gson();
	ExchangeRateData data;
	URL url;
	String apiUrl = "https://api.exchangeratesapi.io/latest?base=USD";
	String currency;
	
	public ExchangeRateAPICall(String currency)
	{
		this.currency = currency.toUpperCase();
	}
	
	public void populate() throws IOException
	{
		url = new URL(apiUrl);
		HttpURLConnection com = (HttpURLConnection) url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(com.getInputStream()));
		data = gson.fromJson(in, ExchangeRateData.class);
	}
	
	public String toString()
	{
		String end = "1";
		try
		{
			populate();
			switch(currency)
			{
			case "BGN": end = "the rate of " + currency + " compared to USD is " + data.getRates().getBGN();
				break;
			case "CAD": end = "the rate of " + currency + " compared to USD is " + Double.toString(data.getRates().getCAD());
				break;
			case "BRL": end = "the rate of " + currency + " compared to USD is " + data.getRates().getBRL();
				break;
			case "HUF": end = "the rate of " + currency + " compared to USD is " + data.getRates().getHUF();
				break;
			case "DKK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getDKK();
				break;
			case "JPY": end = "the rate of " + currency + " compared to USD is " + data.getRates().getJPY();
				break;
			case "ILS": end = "the rate of " + currency + " compared to USD is " + data.getRates().getILS();
				break;
			case "TRY": end = "the rate of " + currency + " compared to USD is " + data.getRates().getTRY();
				break;
			case "RON": end = "the rate of " + currency + " compared to USD is " + data.getRates().getRON();
				break;
			case "GBP": end = "the rate of " + currency + " compared to USD is " + data.getRates().getGBP();
				break;
			case "PHP": end = "the rate of " + currency + " compared to USD is " + data.getRates().getPHP();
				break;
			case "HRK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getHRK();				
				break;
			case "NOK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getNOK();
				break;
			case "MXN": end = "the rate of " + currency + " compared to USD is " + data.getRates().getMXN();
				break;
			case "USD": end = "the rate of " + currency + " compared to USD is " + data.getRates().getUSD();
				break;
			case "AUD": end = "the rate of " + currency + " compared to USD is " + data.getRates().getAUD();
				break;
			case "IDR": end = "the rate of " + currency + " compared to USD is " + data.getRates().getIDR();
				break;
			case "KRW": end = "the rate of " + currency + " compared to USD is " + data.getRates().getKRW();
				break;
			case "HKD": end = "the rate of " + currency + " compared to USD is " + data.getRates().getHKD();
				break;
			case "ZAR": end = "the rate of " + currency + " compared to USD is " + data.getRates().getZAR();
				break;
			case "ISK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getISK();
				break;
			case "CZK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getCZK();
				break;
			case "THB": end = "the rate of " + currency + " compared to USD is " + data.getRates().getTHB();	
				break;
			case "MYR": end = "the rate of " + currency + " compared to USD is " + data.getRates().getMYR();	
				break;
			case "NZD": end = "the rate of " + currency + " compared to USD is " + data.getRates().getNZD();
				break;
			case "PLN": end = "the rate of " + currency + " compared to USD is " + data.getRates().getPLN();	
				break;
			case "SEK": end = "the rate of " + currency + " compared to USD is " + data.getRates().getSEK();
				break;
			case "RUB": end = "the rate of " + currency + " compared to USD is " + data.getRates().getRUB();
				break;
			case "CNY": end = "the rate of " + currency + " compared to USD is " + data.getRates().getCNY();
				break;
			case "SGD": end = "the rate of " + currency + " compared to USD is " + data.getRates().getSGD();
				break;
			case "CHF": end = "the rate of " + currency + " compared to USD is " + data.getRates().getCHF();
				break;
			case "INR": end = "the rate of " + currency + " compared to USD is " + data.getRates().getINR();
			}
			return end;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
