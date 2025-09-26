public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("song.mp3", "mp3");

        audioPlayer.play("movie.mp4", "mp4");
    }
}