public class Main {
    public static void main(String[] args) {
        IMediaPlayer player = new AudioPlayer();
        player.play("video.mp4");
        player.play("movie.mov");
        player.play("audio.mp3");
        player.play("video.avi");
    }
}
