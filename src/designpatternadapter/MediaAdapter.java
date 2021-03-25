package designpatternadapter;

import designpatternadapter.devices.Mp4Player;
import designpatternadapter.devices.VlcPlayer;
import designpatternadapter.inter.AdvancedMediaPlayer;
import designpatternadapter.inter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer= new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
