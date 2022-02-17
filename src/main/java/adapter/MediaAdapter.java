package adapter;

import mediaplayers.Mp4Player;
import mediaplayers.VlcPlayer;
import service.MediaPlayerService;

import java.util.ArrayList;
import java.util.List;

public class MediaAdapter {

    private List<MediaPlayerService> supportedMedia;

    public List<MediaPlayerService> getSupportedMedia() {
        return supportedMedia;
    }

    public void setSupportedMedia(List<MediaPlayerService> supportedMedia) {
        this.supportedMedia = supportedMedia;
    }

    public MediaAdapter generateAdapter() {
        MediaAdapter mediaAdapter = new MediaAdapter();
        List<MediaPlayerService> players = new ArrayList<>();
        players.add(new VlcPlayer());
        players.add(new Mp4Player());
        mediaAdapter.setSupportedMedia(players);
        return mediaAdapter;
    }
}
