package designpatternadapter;

import designpatternadapter.inter.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {

//        Built in support for mp3
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Could not play "+ fileName +" ,"+ audioType + " not supported");
        }
    }
}
