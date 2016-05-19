package designPattern.adapterPattern;

public class AudioPlayer implements MediaPlayer{
	
	public void play(String audioType,String fileName){
	
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("Playing mp3 file having name "+fileName);
		else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("Mp4")){
			MediaApdapter mediaAdapter=new MediaApdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			}
		else
			System.out.println("Unsupported Media File Found");
		
	}

}
