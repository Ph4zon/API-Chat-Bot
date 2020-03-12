# APIProject
This project implements a chat bot that gives the user information about the weather and currency exchange rate.

### Instructions
In order to get it to work, you will need to a few external libraries. These libraries are pircbot.jar and gson.jar (the version of gson that was used for this project was 2.6.2)
To use the chat bot, you will need to connect to freenode.net, click on chat, and enter any nickname of your choosing and enter in "#pircbot" into the channel text box.
When MyBotMain.java is ran, the bot will automatically connect to the #pircbot channel and from there you can use the bot.

To get the weather, you will need to message in the chat with "weather" followed by a space then the zip code of the area that you want to get the weather from. For example, "weather 75074" will get the current weather in Plano, Texas.

To get the exchange rate, you will need to message in the chat with "rateof" followed by a space then the 3 letter abbreviation of the initial currency. It will automatically compare it to USD. For example, "rateof JPY" will get the exchange rate of Japanese yen to USD.
