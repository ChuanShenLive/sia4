package com.chuanshen;

public class BraveKnight3 implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight3(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
