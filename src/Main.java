import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Discord discord = new Discord();
// env almalısın:
        discord.webhookUrl = "https://discord.com/api/webhooks/webhooklinkiniz";
        discord.userName = "123 Deneme";
        discord.content = "Java ile Discord Webhook Kullanarak Deneme Mesajı Atıyorum!!";

// algoritmayı böldük. mesaj içeriği - mesajı gönderme iki ayrı class böldük.

        SendMsg sendMsg = new SendMsg();
        sendMsg.sendDiscordMessage(discord);

    }
}