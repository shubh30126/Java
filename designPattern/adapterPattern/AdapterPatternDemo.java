package designPattern.adapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AudioPlayer ap=new AudioPlayer();
		
		ap.play("Mp3", "Lalala.mp3");
		ap.play("Vlc", "Lalala.vlc");
		ap.play("mp4", "Lalala.mp4");
		ap.play("avi", "Lalala.avi");
		
	}

}
