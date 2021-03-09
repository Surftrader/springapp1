package ua.com.poseal.springcourse;

public class MusicPlayer {

    private Music music;

    // Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
