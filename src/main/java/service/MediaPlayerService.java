package service;

public interface MediaPlayerService {
    String play(String audioType, String fileName);
    String getType();
    boolean canPlay(String audioType);
}