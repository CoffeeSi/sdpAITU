public class MediaAdapter implements IMediaPlayer {
    private final Object videoPlayer;
    private final String fileType;

    public MediaAdapter(String filename) {
        fileType = filename.split("\\.")[1];
        if (fileType.equalsIgnoreCase("mp4"))
            videoPlayer = new MP4Player();
        else if (fileType.equalsIgnoreCase("mov"))
            videoPlayer = new MOVPlayer();
        else
            videoPlayer = null;
    }

    @Override
    public void play(String filename) {
        if (fileType.equalsIgnoreCase("mp4"))
            ((MP4Player) videoPlayer).playMP4(filename);
        else if (fileType.equalsIgnoreCase("mov"))
            ((MOVPlayer) videoPlayer).playMOV(filename);
        else
            System.out.println("Format not supported");
    }
}
