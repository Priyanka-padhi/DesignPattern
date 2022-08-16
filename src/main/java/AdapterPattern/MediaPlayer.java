package AdapterPattern;

public interface MediaPlayer{
    public void play(String audioType,String fileName);
}
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String Type) {
        switch (Type) {
            case "VLC":
                advancedMediaPlayer = new VlcPlayer();
            case "MP4":
                advancedMediaPlayer = new Mp4Player();

        }
    }

    @Override
    public void play(String Type, String fileName) {
        switch (Type) {
            case "VLC":
                advancedMediaPlayer.playVlc(fileName);
            case "MP4":
                advancedMediaPlayer.playMp4(fileName);
        }
    }
}
class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;


    @Override
    public void play(String Type, String fileName) {
        switch (Type) {
            case "MP3":
                System.out.println("Playing mp3 file. Name: "+fileName);
                break;
            case "VLC":
                mediaAdapter = new MediaAdapter(Type);
                mediaAdapter.play(Type,fileName);
                break;
            case "MP4":
                mediaAdapter = new MediaAdapter(Type);
                mediaAdapter.play(Type,fileName);
                break;
            default:
                System.out.println("Invalid Media File!!");

        }
    }
}