import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendMsg {
    void sendDiscordMessage(Discord discord) throws IOException {
        URL url  = new URL(discord.webhookUrl); // connection açtık
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // http ile haberleşicem
        connection.addRequestProperty("Content-Type", "application/json"); // output type
        connection.addRequestProperty("user-agent", "Java-DiscordWebhook");
        connection.setDoOutput(true);
        connection.setRequestMethod("POST"); // post http request


        OutputStream stream = connection.getOutputStream(); // bu bağlantı ayarlarıyla bağlan. write flow
        stream.write(discord.jsonAl().getBytes()); // json verisini al byteları gönder
        stream.flush(); // flowdaki verilerin gitmesini sağla
        stream.close(); // kaynak yemesin diye close ettik

        connection.getInputStream().close();
        connection.disconnect();
            }
}
