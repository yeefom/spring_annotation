package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Coach tenniCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tenniCoach.getWorkout());
        System.out.println(tenniCoach.getEquipment());

        Coach basketCoach = context.getBean("basketballCoach", Coach.class);

        System.out.println(basketCoach.getWorkout());
        System.out.println(basketCoach.getEquipment());

        context.close();
    }
}
