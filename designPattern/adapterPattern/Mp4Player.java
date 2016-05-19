package designPattern.adapterPattern;

public class Mp4Player implements AdvanceMediaPlayer {

	public void playVlc(String fileName){
		//do nothing
		}
	
	public void playMp4(String fileName){
		System.out.println("Playing mp4 file "+fileName);
		}
}
