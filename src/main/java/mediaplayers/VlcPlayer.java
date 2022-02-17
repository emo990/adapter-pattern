package mediaplayers;

import service.MediaPlayerService;

public class VlcPlayer implements MediaPlayerService {
    @Override
    public String play(String audioType, String fileName) {
        return "Playing vlc file. Name: " + fileName;
    }

    @Override
    public String getType() {
        return "vlc";
    }

    @Override
    public boolean canPlay(String audioType) {
        return this.getType().equalsIgnoreCase(audioType);
    }
}

