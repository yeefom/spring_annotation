package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getWorkout());

        System.out.println(coach.getEquipment());

        context.close();
    }
}
