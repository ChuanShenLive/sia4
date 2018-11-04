package com.chuanshen.knights;

public class BraveKnight implements Knight {

	private Quest quest;
	// private Minstrel minstrel;
	
	public BraveKnight(Quest quest) {	// Quest 被注入进来
	// public BraveKnight(Quest quest, Minstrel minstrel) {
		this.quest = quest;
		// this.minstrel = minstrel;
	}
	
	public void embarkOnQuest() {
		// minstrel.singBeforeQuest();
		quest.embark();
		// minstrel.singAfterQuest();
	}

}
