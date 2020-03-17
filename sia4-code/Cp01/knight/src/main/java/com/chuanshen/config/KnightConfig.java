package com.chuanshen.config;

import com.chuanshen.BraveKnight;
import com.chuanshen.Knight;
import com.chuanshen.Quest;
import com.chuanshen.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
