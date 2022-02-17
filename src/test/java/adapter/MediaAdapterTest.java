package adapter;

import mediaplayers.Mp4Player;
import mediaplayers.VlcPlayer;
import org.junit.jupiter.api.Test;
import service.MediaPlayerService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MediaAdapterTest {

    private static MediaAdapter mediaAdapter = new MediaAdapter();

    @Test
    void generateShouldCreateAndReturnMediaAdapterWithAllSupportedMediaPlayers() {
        mediaAdapter = mediaAdapter.generateAdapter();
        List<MediaPlayerService> supportedMedia = mediaAdapter.getSupportedMedia();
        assertEquals(2, supportedMedia.size());
        VlcPlayer vlcPlayer = new VlcPlayer();
        Mp4Player mp4Player = new Mp4Player();
        assertInstanceOf(vlcPlayer.getClass(), supportedMedia.get(0));
        assertInstanceOf(mp4Player.getClass(), supportedMedia.get(1));
    }
}