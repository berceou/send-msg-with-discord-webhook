import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Discord discord = new Discord();
// env almalısın:
        discord.webhookUrl = "https://discord.com/api/webhooks/1265183261328674817/CMMZLWX0u74nPhyHsMYsM6WVrAJZICwp0vf7_NJMCvlWyuF0xvadoVgTaAynfuIUAYl3";
        discord.userName = "Özüm 123 Deneme";
        discord.content = "Java ile Discord Webhook Kullanarak Deneme Mesajı Atıyorum!!";

// algoritmayı böldük. mesaj içeriği - mesajı gönderme iki ayrı class böldük.

        SendMsg sendMsg = new SendMsg();
        sendMsg.sendDiscordMessage(discord);

    }
}