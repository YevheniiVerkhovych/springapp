package ua.verkhovych.springcourse;

public interface Music {
    String getSong();
    default void doMyInit() {
        System.out.println("Doing my initializaion ");
    }

    default void doMyDestroy(){
        System.out.println("Doing my destruction ");
    }

}
