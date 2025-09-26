public class AudioPlayer {
    private MediaPlayer mediaPlayer;

    public void play(String fileName, String format) {
        if ("mp3".equalsIgnoreCase(format)) {
            mediaPlayer = new Mp3Player();
        } else if ("mp4".equalsIgnoreCase(format)) {
            mediaPlayer = new Mp4Player();  // Прямо используем MP4Player вместо MediaAdapter
        } else {
            System.out.println("Неверный формат");
            return;
        }

        mediaPlayer.play(fileName);  // Используем соответствующий медиаплеер
    }
}