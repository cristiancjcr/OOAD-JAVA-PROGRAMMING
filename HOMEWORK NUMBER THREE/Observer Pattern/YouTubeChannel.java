// Fișier: YouTubeChannel.java
// clasa concretă care notifică observatorii
public class YouTubeChannel extends Subject {
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    // Simulează postarea unui videoclip nou
    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " a postat un nou videoclip: " + videoTitle);
        notifyObservers("Noul videoclip: " + videoTitle);
    }
}
