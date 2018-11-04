package com.chuanshen.knights;
import static org.mockito.Mockito.*;

import org.junit.Test;

// import org.junit.jupiter.api.Test;
public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);				// 创建 mock Quest
		BraveKnight knight = new BraveKnight(mockQuest);	// 注入 mock Quest
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
