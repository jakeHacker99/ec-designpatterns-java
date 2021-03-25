package designpatternadapter.devices;

import designpatternadapter.inter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
//        Do Nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file:"+fileName);
    }
}
