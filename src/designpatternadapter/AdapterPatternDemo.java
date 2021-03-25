package designpatternadapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "dreelow-priceless.mp3 ");
        audioPlayer.play("mp3", "SSM_Ls.mp3");
        audioPlayer.play("mp4", "Benjamins.mp4");
        audioPlayer.play("vlc", "Freedy_K.vlc");
        audioPlayer.play("avi", "Lita_på_mig.avi");
    }
}
