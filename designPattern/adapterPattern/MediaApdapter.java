package designPattern.adapterPattern;

public class MediaApdapter implements MediaPlayer {

	AdvanceMediaPlayer advanceMusicPlayer;
	
	public MediaApdapter(String audioType) {
		if(audioType.equalsIgnoreCase("VLC"))
			advanceMusicPlayer =new VlcPlayer();
		else if(audioType.equalsIgnoreCase("MP4"))
			advanceMusicPlayer =new Mp4Player();
		else 
			advanceMusicPlayer=null;
	}

	public void play(String audioType,String fileName){
		
		if(audioType.equalsIgnoreCase("VLC"))
			advanceMusicPlayer.playVlc(fileName);
		if(audioType.equalsIgnoreCase("MP4"))
			advanceMusicPlayer.playMp4(fileName);	
		
		
	}
	
	
}
