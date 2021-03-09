package ua.com.poseal.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music musicBean = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        musicPlayer.playMusic();

        Music musicBean2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer2 = new MusicPlayer(musicBean2);

        musicPlayer2.playMusic();

        context.close();
    }
}
