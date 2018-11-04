package com.chuanshen.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chuanshen.knights.BraveKnight;
import com.chuanshen.knights.Knight;
import com.chuanshen.knights.Quest;
import com.chuanshen.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight()  {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
