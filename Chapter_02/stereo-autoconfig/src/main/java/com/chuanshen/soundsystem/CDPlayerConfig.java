package com.chuanshen.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages={"com.chuanshen.soundsystem"})
@ComponentScan(basePackageClasses= {MarkerInterface.class})
public class CDPlayerConfig {

}
