package com.xworkz.inheritance.music;


public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.playTrack();
        player.adjustVolume();

        SmartMusicPlayer smartPlayer = new SmartMusicPlayer();
        smartPlayer.playTrack();
        smartPlayer.adjustVolume();

        MusicPlayer musicPlayer = new SmartMusicPlayer();
        System.out.println(musicPlayer);

        SmartMusicPlayer smartMusicPlayer =(SmartMusicPlayer) musicPlayer;
        System.out.println(smartMusicPlayer);
    }
}
