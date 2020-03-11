package apiProject;

public class MyBotMain 
{
	public static void main(String[] args) throws Exception
	{
		MyBot bot = new MyBot();
		
		bot.setVerbose(true);
		
		bot.connect("chat.freenode.net");
		
		bot.joinChannel("#pircbot");
	}
}
