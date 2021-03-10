package ua.com.poseal.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music musicBean = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//
//        musicPlayer.playMusic();
//
//        Music musicBean2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer2 = new MusicPlayer(musicBean2);
//
//        musicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);;

        context.close();
    }
}
