package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        TennisCoach tenniCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tenniCoach.getWorkout());
        System.out.println(tenniCoach.getEquipment());
        System.out.println(tenniCoach.getTeam());

        Coach basketCoach = context.getBean("basketballCoach", Coach.class);

        System.out.println(basketCoach.getWorkout());
        System.out.println(basketCoach.getEquipment());

        context.close();
    }
}
