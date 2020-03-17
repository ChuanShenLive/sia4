package com.chuanshen.config;

import com.chuanshen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig4 {

    @Autowired
    Quest quest;

    @Autowired
    Minstrel minstrel;

    @Bean
    public Knight knight() {
        return new BraveKnight3(quest, minstrel);
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }
}
