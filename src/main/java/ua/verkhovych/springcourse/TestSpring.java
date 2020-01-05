package ua.verkhovych.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);

        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparsion = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparsion);

        System.out.println(firstMusicPlayer.getName() + " " + firstMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(10);

        System.out.println(secondMusicPlayer.getName() + " " + secondMusicPlayer.getVolume());

        context.close();
    }
}
