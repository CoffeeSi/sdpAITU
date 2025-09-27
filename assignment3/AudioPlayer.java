public class AudioPlayer implements IMediaPlayer {

    @Override
    public void play(String filename) {
        if (filename.split("\\.").length < 2) {
            System.out.println("FileType not found");
            return;
        }
            
        String fileType = filename.split("\\.")[1];

        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + filename);
        } else {
            MediaAdapter adapter = new MediaAdapter(filename);
            adapter.play(filename);
        }
    }
}
