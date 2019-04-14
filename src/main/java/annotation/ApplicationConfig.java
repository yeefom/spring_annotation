package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotation")
public class ApplicationConfig {

    @Bean
    public EquipmentService basketballEquipmentService() {
        return new BasketballEquipmentService();
    }

    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach(basketballEquipmentService());
    }

}
