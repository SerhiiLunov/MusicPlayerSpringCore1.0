package com.lunov.musicplayer.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lunov.musicplayer")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
