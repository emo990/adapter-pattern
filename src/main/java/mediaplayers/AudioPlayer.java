package mediaplayers;

import adapter.MediaAdapter;
import service.MediaPlayerService;
import java.util.List;


public class AudioPlayer {
    private static MediaAdapter mediaAdapter = new MediaAdapter();

    public String play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file. Name: " + fileName;
        }
        mediaAdapter = mediaAdapter.generateAdapter();
        if (isMediaSupported(mediaAdapter.getSupportedMedia(), audioType)) {
            return "Playing " + audioType + " file. Name: " + fileName;
        }

        return "Invalid media. " + audioType + " format not supported";

    }

    public boolean isMediaSupported(List<MediaPlayerService> supportedMedia, String audioType) {
        for (MediaPlayerService player : supportedMedia) {
            if (player.canPlay(audioType)) {
                return true;
            }
        }
        return false;
    }
}

