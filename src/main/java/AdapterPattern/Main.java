package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP4","Hello.mp4");
        audioPlayer.play("MP3","Dynamite.mp3");
        audioPlayer.play("abv","Hii.abv");
    }
}
