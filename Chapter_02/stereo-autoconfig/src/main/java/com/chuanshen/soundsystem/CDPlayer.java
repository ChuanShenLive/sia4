package com.chuanshen.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CDPlayer")
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	// @Autowired(required=false) // 防止异常抛出
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd ;
	}
	
	@Override
	public void play() {
		cd.play();
	}
}
