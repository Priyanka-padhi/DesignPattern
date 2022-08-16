package AdapterPattern;

interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);

}
class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
