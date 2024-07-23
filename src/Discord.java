public class Discord {
    String userName;
    String content;
    String avatarUrl;
    String webhookUrl;

    String jsonAl(){
        return "{ \"username\": \"" + userName + "\", \"content\": \"" + content + "\"}";
    }
}
