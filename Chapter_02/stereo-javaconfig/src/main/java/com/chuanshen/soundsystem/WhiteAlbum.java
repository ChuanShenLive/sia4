package com.chuanshen.soundsystem;

public class WhiteAlbum implements CompactDisc {
	private String title = "White Album";
	private String artist = "The Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
