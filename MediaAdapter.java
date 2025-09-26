public class MediaAdapter implements MediaPlayer {
    private Mp4Player mp4Player;

    public MediaAdapter() {
        mp4Player = new Mp4Player();  // Adapting MP4Player to MediaPlayer interface
    }

    @Override
    public void play(String fileName) {
        mp4Player.play(fileName);  // Delegating the task to MP4Player
    }
}