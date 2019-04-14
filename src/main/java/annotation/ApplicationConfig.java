package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotation")
@PropertySource("ApplicationProps.properties")
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
