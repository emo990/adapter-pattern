package mediaplayers;

import service.MediaPlayerService;

public class Mp4Player implements MediaPlayerService {

    @Override
    public String play(String audioType, String fileName) {
        return "Playing mp4 file. Name: " + fileName;
    }

    @Override
    public String getType() {
        return "mp4";
    }

    @Override
    public boolean canPlay(String audioType) {
        return this.getType().equalsIgnoreCase(audioType);
    }

}

